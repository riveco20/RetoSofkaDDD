package com.sofka.domainPaqueExplora.domain.contract;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.domainPaqueExplora.domain.contract.valueobject.ContractId;

public class Contract extends AggregateEvent<ContractId> {

    public Contract(ContractId entityId) {
        super(entityId);
    }
}
