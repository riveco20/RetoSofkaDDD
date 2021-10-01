package com.sofka.domainPaqueExplora.domain.contract.valueobject;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Function implements ValueObject<String> {
    private final String function;

    public Function(String description) {
        this.function = Objects.requireNonNull(description);
        if(this.function.isBlank()){
            throw new IllegalArgumentException("Descripcion bacia");
        }
        if(this.function.length()<10000){
            throw new IllegalArgumentException("Debe ser mas larga");
        }

    }

    @Override
    public String value() {
        return function;
    }


    @Override
    public boolean equals(Object object){
        if(this == object) return true;
        if(object == null || getClass() != object.getClass()) return false;
        Function function2 = (Function) object;
        return Objects.equals(function2, function2.function);
    }

    @Override
    public int hashCode(){
        return Objects.hash(function);
    }
}