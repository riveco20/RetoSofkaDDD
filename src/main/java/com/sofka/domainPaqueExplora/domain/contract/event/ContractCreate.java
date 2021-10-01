package com.sofka.domainPaqueExplora.domain.contract.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domainPaqueExplora.domain.contract.valueobject.ContractType;

public class ContractCreate extends DomainEvent {
    private final ContractType contractType;
    public ContractCreate(ContractType contractType) {
        super("parqueexplora.bodega.contratocreado");
        this.contractType=contractType;
    }

    public ContractType getContractType() {
        return contractType;
    }
}
