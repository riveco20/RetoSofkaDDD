package com.sofka.domainPaqueExplora.domain.contract.entity;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generic.Identity;
import com.sofka.domainPaqueExplora.domain.contract.valueobject.*;

import java.util.Objects;

public class Builder extends Entity {
    private Telephone telephone;
    private Function function;
    private Specialization specialization;

    public Builder(Identity entityId, Telephone telephone, Function function, Specialization specialization) {
        super(entityId);
        this.telephone = telephone;
        this.function = function;
        this.specialization = specialization;
    }

    public void upgradeFunction(Function function){

        this.function = Objects.requireNonNull(function);
    }

    public void upgradeSpecialization(Specialization specialization){
        this.specialization = Objects.requireNonNull(specialization);
    }

    public void setTelephone(Telephone telephone) {
        this.telephone = telephone;
    }

    public void setFunction(Function function) {
        this.function = function;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }
}
