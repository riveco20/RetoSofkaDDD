package com.sofka.domainPaqueExplora.domain.contract.valueobject;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ContractType implements ValueObject<String> {
    private final String contratType;

    public ContractType(String contratType) {
        this.contratType = Objects.requireNonNull(contratType);
        if(this.contratType.isBlank()){
            throw new IllegalArgumentException("Descripcion bacia");
        }
        if(this.contratType.length()<100){
            throw new IllegalArgumentException("Debe ser mas larga");
        }

    }

    @Override
    public String value() {
        return null;
    }


    @Override
    public boolean equals(Object object){
        if(this == object) return true;
        if(object == null || getClass() != object.getClass()) return false;
        ContractType contractType2 = (ContractType) object;
        return Objects.equals(contractType2, contractType2.contratType);
    }

    @Override
    public int hashCode(){
        return Objects.hash(contratType);
    }
}
