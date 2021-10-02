package com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class InvoiceDescription implements ValueObject<String>{
    private final String description;

    public InvoiceDescription(String description) {
        this.description = Objects.requireNonNull(description);
        if(this.description.isBlank()){
            throw new IllegalArgumentException("Descripcion bacia");
        }
        if(this.description.length()<10){
            throw new IllegalArgumentException("Debe ser mas larga");
        }

    }

    @Override
    public String value() {
        return description;
    }


    @Override
    public boolean equals(Object object){
        if(this == object) return true;
        if(object == null || getClass() != object.getClass()) return false;
        InvoiceDescription invoiceDescription= (InvoiceDescription) object;
        return Objects.equals(description, invoiceDescription.description);
    }

    @Override
    public int hashCode(){
        return Objects.hash(description);
    }
}
