package com.sofka.domainPaqueExplora.domain.contract.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.Identity;
import com.sofka.domainPaqueExplora.domain.contract.valueobject.BuilderId;
import com.sofka.domainPaqueExplora.domain.contract.valueobject.Function;
import com.sofka.domainPaqueExplora.domain.contract.valueobject.Specialization;
import com.sofka.domainPaqueExplora.domain.contract.valueobject.Telephone;

import javax.print.Doc;

public class BullilderAggregate extends DomainEvent {
    private final BuilderId builderId;
    private final Telephone telephone;
    private  final Function function;
    private  final Specialization specialization;

    public BullilderAggregate(BuilderId builderId, Telephone telephone, Function function, Specialization specialization) {
        super("parqueexplora.bodega.contratistaAgregado");
        this.builderId= builderId;
        this.telephone = telephone;
        this.function = function;
        this.specialization = specialization;
    }

    public BuilderId getBuilderId() {
        return builderId;
    }

    public Telephone getTelephone() {
        return telephone;
    }

    public Function getFunction() {
        return function;
    }

    public Specialization getSpecialization() {
        return specialization;
    }
}
