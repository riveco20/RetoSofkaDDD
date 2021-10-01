package com.sofka.domainPaqueExplora.domain.contract.valueobject;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Email implements ValueObject<String> {
    private final String email;

    public Email(String description) {
        this.email = Objects.requireNonNull(description);
        if(this.email.isBlank()){
            throw new IllegalArgumentException("Descripcion bacia");
        }
        if(this.email.length()<100){
            throw new IllegalArgumentException("Debe ser mas larga");
        }

    }

    @Override
    public String value() {
        return email;
    }

    @Override
    public boolean equals(Object object){
        if(this == object) return true;
        if(object == null || getClass() != object.getClass()) return false;
        Email email2 = (Email) object;
        return Objects.equals(email2, email2.email);
    }

    @Override
    public int hashCode(){
        return Objects.hash(email);
    }
}



