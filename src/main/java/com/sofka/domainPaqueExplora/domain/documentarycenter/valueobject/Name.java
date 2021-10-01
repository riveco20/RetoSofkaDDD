package com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Name implements ValueObject {
private final String name;

public Name(String name){
    this.name= Objects.requireNonNull(name);
    if(name.isEmpty()){
        throw new IllegalArgumentException("Ingresa un nombre por favor");
    }

    if(this.name.length()>=5){
        throw new IllegalArgumentException("Los nombres de archivos no contiene mas de 4 caracteres");
    }
}


    @Override
    public Object value() {
        return name;
    }
}
