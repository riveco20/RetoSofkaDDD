package com.sofka.domainPaqueExplora.domain.contract.command;

import co.com.sofka.domain.generic.Command;
import com.sofka.domainPaqueExplora.domain.contract.valueobject.ContractId;
import com.sofka.domainPaqueExplora.domain.contract.valueobject.Function;
import com.sofka.domainPaqueExplora.domain.contract.valueobject.Specialization;
import com.sofka.domainPaqueExplora.domain.contract.valueobject.Telephone;

public class UpgradeBuilder extends Command {
    private final ContractId contractId;
    private final Telephone telephone;
    private final Specialization specialization;
    private final Function function;

    public UpgradeBuilder(ContractId contractId, Telephone telephone, Specialization specialization, Function function) {
        this.contractId = contractId;
        this.telephone = telephone;
        this.specialization = specialization;
        this.function = function;
    }

    public ContractId getContractId() {
        return contractId;
    }

    public Telephone getTelephone() {
        return telephone;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public Function getFunction() {
        return function;
    }
}
