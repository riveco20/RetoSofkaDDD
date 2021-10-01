package com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NumberOfBallots implements ValueObject<String> {
    private final String ballots;
    private final Double isNumer;

    public NumberOfBallots(String ballots) {
        this.ballots = Objects.requireNonNull(ballots);
        if (this.ballots.isBlank()) {
            throw new IllegalArgumentException("Valor nulo");

        }
        this.isNumer=Double.parseDouble(ballots);
        if(isNumer<0){
            throw new IllegalArgumentException("El dinero debe ser mayor que cero");
        }
    }


    @Override
    public String value() {
       return this.ballots;
    }

    @Override
    public boolean equals(Object object){
        if(this == object) return true;
        if(object == null || getClass() != object.getClass()) return false;
        NumberOfBallots numberOfBallots = (NumberOfBallots) object;
        return Objects.equals(ballots, numberOfBallots.ballots);
    }

    @Override
    public int hashCode(){
        return Objects.hash(ballots);
    }
}