package com.sofka.domainPaqueExplora.domain.contract.valueobject;

import co.com.sofka.domain.generic.Identity;
import com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject.DocumentaryCenterId;

public class ContractorId extends Identity {
    public ContractorId(String id){
        super(id);
    }

    public ContractorId(){}

    public static DocumentaryCenterId of(String id){
        return new DocumentaryCenterId(id);
    }
}
