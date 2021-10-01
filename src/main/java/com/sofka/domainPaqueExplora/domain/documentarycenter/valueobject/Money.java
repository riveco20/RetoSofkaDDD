package com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Money implements ValueObject<String> {

    private final String money;
    private final Double isNumer;

    public Money(String money) {
        this.money = Objects.requireNonNull(money);
        if(this.money.isBlank()){
            throw new IllegalArgumentException("Valor nulo");

        }
        this.isNumer=Double.parseDouble(money);
            if(isNumer<=0){
                throw new IllegalArgumentException("El dinero debe ser mayor que cero");
            }
    }


    @Override
    public String value() {

        return money;
    }
}
