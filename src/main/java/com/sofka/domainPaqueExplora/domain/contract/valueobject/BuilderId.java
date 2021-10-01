package com.sofka.domainPaqueExplora.domain.contract.valueobject;

import co.com.sofka.domain.generic.Identity;

public class BuilderId extends Identity {
    public BuilderId(String id){
        super(id);
    }

    public BuilderId(){}

    public static BuilderId of(String id){
        return new BuilderId(id);
    }
}
