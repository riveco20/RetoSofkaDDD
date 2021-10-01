package com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ProjectDescription implements ValueObject<String> {
    private final String description;

    public ProjectDescription(String description) {
        this.description = Objects.requireNonNull(description);
        if(this.description.isBlank()){
            throw new IllegalArgumentException("Descripcion bacia");
        }
        if(this.description.length()<100){
            throw new IllegalArgumentException("Debe ser mas larga");
        }

    }

    @Override
    public String value() {
        return description;
    }
   
}
