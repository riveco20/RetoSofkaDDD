package com.sofka.domainPaqueExplora.domain.contract.valueobject;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Specialization implements ValueObject<String> {
    private final String specialization;

    public Specialization(String description) {
        this.specialization = Objects.requireNonNull(description);
        if (this.specialization.isBlank()) {
            throw new IllegalArgumentException("Descripcion bacia");
        }
        if (this.specialization.length() < 100) {
            throw new IllegalArgumentException("Debe ser mas larga");
        }

    }

    @Override
    public String value() {
        return specialization;
    }
    @Override
    public boolean equals(Object object){
        if(this == object) return true;
        if(object == null || getClass() != object.getClass()) return false;
        Specialization specialization2 = (Specialization) object;
        return Objects.equals(specialization2, specialization2.specialization);
    }

    @Override
    public int hashCode(){
        return Objects.hash(specialization);
    }


}