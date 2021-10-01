package com.sofka.domainPaqueExplora.domain.contract.command;

import co.com.sofka.domain.generic.Command;
import com.sofka.domainPaqueExplora.domain.contract.valueobject.ContractId;
import com.sofka.domainPaqueExplora.domain.contract.valueobject.ContractType;

public class ChangeContractType extends Command {
    private final ContractId contractId;
    private final ContractType contractType;

    public ChangeContractType(ContractId contractId, ContractType contractType) {
        this.contractId = contractId;
        this.contractType = contractType;
    }

    public ContractId getContractId() {
        return contractId;
    }

    public ContractType getContractType() {
        return contractType;
    }
}
