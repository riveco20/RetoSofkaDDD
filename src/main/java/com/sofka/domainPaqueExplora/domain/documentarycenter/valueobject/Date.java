package com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Date implements ValueObject<String> {
    private final String date;

    public Date(String date) {
        this.date = Objects.requireNonNull(date);
        if(this.date.isBlank()){
            throw new IllegalArgumentException("Ingrese una fecha");
        }
        if(this.date.length()>=11){
            throw new IllegalArgumentException("No debe tener mas de 10 caracteres");

        }
    }

    @Override
    public String value() {
        return date;
    }

    @Override
    public boolean equals(Object object){
        if(this == object) return true;
        if(object == null || getClass() != object.getClass()) return false;
        Date dated = (Date) object;
        return Objects.equals(date, dated.date);
    }

    @Override
    public int hashCode(){
        return Objects.hash(date);
    }



}
