package com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject;

import co.com.sofka.domain.generic.Identity;

public class DocumentaryCenterId extends Identity {

    public DocumentaryCenterId(String id){
        super(id);
    }

    public DocumentaryCenterId(){}

    public static DocumentaryCenterId of(String id){
        return new DocumentaryCenterId(id);
    }
}
