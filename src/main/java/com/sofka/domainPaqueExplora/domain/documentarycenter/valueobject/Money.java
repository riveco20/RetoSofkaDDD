package com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Money implements ValueObject<String> {

    private final String money;

    public Money(String money) {
        this.money = Objects.requireNonNull(money);
        if(this.money.isBlank()){
            throw new IllegalArgumentException("Valor nulo");

        }
            if(this.money.length()<3){
                throw new IllegalArgumentException("El dinero debe ser mayor que cero");
            }
    }


    @Override
    public String value() {

        return money;
    }

    @Override
    public boolean equals(Object object){
        if(this == object) return true;
        if(object == null || getClass() != object.getClass()) return false;
        Money moneyd = (Money) object;
        return Objects.equals(money, moneyd.money);
    }

    @Override
    public int hashCode(){
        return Objects.hash(money);
    }


}
