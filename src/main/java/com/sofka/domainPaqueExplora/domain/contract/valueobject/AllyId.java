package com.sofka.domainPaqueExplora.domain.contract.valueobject;

import co.com.sofka.domain.generic.Identity;

public class AllyId extends Identity {
    public AllyId(String id){
        super(id);
    }

    public AllyId(){}

    public static AllyId of(String id){
        return new AllyId(id);
    }


}
