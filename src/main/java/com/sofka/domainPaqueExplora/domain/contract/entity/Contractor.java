package com.sofka.domainPaqueExplora.domain.contract.entity;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generic.Identity;
import com.sofka.domainPaqueExplora.domain.contract.valueobject.*;
import com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject.Name;

import java.util.Objects;

public class Contractor  extends Entity {
    private Name NameContractor;
    private Employee employee;
    private Ally ally;
    private Contractor contractor;

    public Contractor(Identity entityId, Name nameContractor) {
        super(entityId);
        NameContractor = nameContractor;
    }

    public Employee EmpoyyeeCreater(EmpleoyeeId empleoyeeId, Name name, Salary salary,Telephone telephone, Post post){
        Objects.requireNonNull(empleoyeeId);
        Objects.requireNonNull(name);
        Objects.requireNonNull(salary);
        Objects.requireNonNull(telephone);
        Objects.requireNonNull(post);
        var employee=new Employee(empleoyeeId,name, salary,telephone,post);
            return employee;
    }

    public Ally AllyCreater(AllyId allyId, Name name, Telephone telephone, Post post){
        Objects.requireNonNull(allyId);
        Objects.requireNonNull(name);
        Objects.requireNonNull(telephone);
        Objects.requireNonNull(post);
        var ally=new Ally(allyId,name,telephone,post);
        return ally;
    }


    public void upgradeEmpleoyeeTelephone(Telephone telephone) {
        Objects.requireNonNull(telephone);
        this.employee.upgradeTelephone(telephone);
    }

    public void upgradeAllyTelepone(Telephone telephone){
        Objects.requireNonNull(telephone);
        this.ally.upgradeTelephone(telephone);
         }


    public Name getNameContractor() {
        return NameContractor;
    }
}
