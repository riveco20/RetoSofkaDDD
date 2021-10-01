package com.sofka.domainPaqueExplora.domain.contract.valueobject;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Post implements ValueObject<String> {
    private final String post;

    public Post(String description) {
        this.post = Objects.requireNonNull(description);
        if(this.post.isBlank()){
            throw new IllegalArgumentException("Descripcion bacia");
        }
        if(this.post.length()<100){
            throw new IllegalArgumentException("Debe ser mas larga");
        }

    }

    @Override
    public String value() {
        return post;
    }

}
