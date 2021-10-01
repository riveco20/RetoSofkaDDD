package com.sofka.domainPaqueExplora.domain.contract.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domainPaqueExplora.domain.contract.valueobject.ContractType;

public class ContractTypeChanged extends DomainEvent {
    private final ContractType contractType;

    public ContractTypeChanged(ContractType contractType) {
        super("parqueexplora.bodega.tipocontratocambiado");
        this.contractType = contractType;
    }

    public ContractType getContractType() {
        return contractType;
    }
}
