package com.sofka.domainPaqueExplora.domain.contract.valueobject;

import co.com.sofka.domain.generic.Identity;

public class ContractId extends Identity {
    public ContractId(String id){
        super(id);
    }

    public ContractId(){}

    public static ContractId of(String id){
        return new ContractId(id);
    }
}
