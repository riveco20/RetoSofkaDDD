package com.sofka.domainPaqueExplora.domain.contract.valueobject;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Telephone implements ValueObject<String> {
    private final String telephono;
    private final Double isNumer;

    public Telephone(String ballots) {
        this.telephono = Objects.requireNonNull(ballots);
        if (this.telephono.isBlank()) {
            throw new IllegalArgumentException("Valor nulo");

        }

        if(this.telephono.length()<10){
            throw new IllegalArgumentException("El numero de telefono debe contener 10 digitos");
        }

        this.isNumer=Double.parseDouble(ballots);
        if(isNumer<0){
            throw new IllegalArgumentException("El dinero debe ser mayor que cero");
        }



    }


    @Override
    public String value() {
        return this.telephono;
    }

    @Override
    public boolean equals(Object object){
        if(this == object) return true;
        if(object == null || getClass() != object.getClass()) return false;
        Telephone telephone2 = (Telephone) object;
        return Objects.equals(telephone2, telephone2.telephono);
    }

    @Override
    public int hashCode(){
        return Objects.hash(telephono);
    }
}