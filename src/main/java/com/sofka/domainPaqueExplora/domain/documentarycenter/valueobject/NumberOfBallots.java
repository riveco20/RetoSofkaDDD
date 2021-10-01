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
        if(isNumer<=0){
            throw new IllegalArgumentException("El dinero debe ser mayor que cero");
        }
    }


    @Override
    public String value() {
       return this.ballots;
    }
}