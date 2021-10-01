package com.sofka.domainPaqueExplora.domain.contract.valueobject;

import co.com.sofka.domain.generic.Identity;
import com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject.DocumentaryCenterId;

public class EmpleoyeeId extends Identity {
    public EmpleoyeeId(String id){
        super(id);
    }

    public EmpleoyeeId(){}

    public static EmpleoyeeId of(String id){
        return new EmpleoyeeId(id);
    }
}
