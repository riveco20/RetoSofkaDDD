package com.sofka.domainPaqueExplora.domain.contract;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.Identity;
import com.sofka.domainPaqueExplora.domain.contract.entity.Builder;
import com.sofka.domainPaqueExplora.domain.contract.entity.Contractor;
import com.sofka.domainPaqueExplora.domain.contract.event.BullilderAggregate;
import com.sofka.domainPaqueExplora.domain.contract.event.BullilderTupdated;
import com.sofka.domainPaqueExplora.domain.contract.event.ContractCreate;
import com.sofka.domainPaqueExplora.domain.contract.event.ContractTypeChanged;
import com.sofka.domainPaqueExplora.domain.contract.valueobject.*;
import com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject.Name;

import java.util.Objects;
import java.util.Set;

public class Contract extends AggregateEvent<ContractId> {

    protected ContractType contractType;
    protected Set<Contractor> contrators;
    protected Set<Builder> builders;

    public Contract(ContractId entityId, ContractType contractType){
        super(entityId);
        appendChange(new ContractCreate(contractType)).apply();
    }

    /**
    public void addEmployeeContractor(ContractId contractId,ContractorId contractorId, Name nameContractor, EmpleoyeeId empleoyeeId, Name nameEmployee, Salary salary, Telephone telephone, Post post){
        Objects.requireNonNull(contractId);
        Objects.requireNonNull(empleoyeeId);
        Objects.requireNonNull(nameEmployee);
        Objects.requireNonNull(salary);
        Objects.requireNonNull(telephone);
        Objects.requireNonNull(post);
        Objects.requireNonNull(contractorId);
        Objects.requireNonNull(nameContractor);
        appendChange(new EmpleoyeeContractAggregate(ContractId contractId,ContractorId contractorId, Name nameContractor, EmpleoyeeId empleoyeeId, Name nameEmployee, Salary salary, Telephone telephone, Post post)).apply();
    }


    public void addAllyContractor(ContractId contractId, ContractorId contractorId, Name nameContractor, AllyId allyId, Name nameAlly, Telephone telephone, Post post){
        Objects.requireNonNull(contractId);
        Objects.requireNonNull(allyId);
        Objects.requireNonNull(nameAlly);
        Objects.requireNonNull(telephone);
        Objects.requireNonNull(post);
        Objects.requireNonNull(contractorId);
        Objects.requireNonNull(nameContractor);
        appendChange(new AllyContractorAggregate(contractId,contractorId, nameContractor, allyId, nameAlly,telephone, post)).apply();
    }

*/
    public void addBullider(BuilderId builderId, Telephone telephone, Function function, Specialization specialization){
        Objects.requireNonNull(builderId);
        Objects.requireNonNull(telephone);
        Objects.requireNonNull(function);
        Objects.requireNonNull(specialization);
        appendChange(new BullilderAggregate(builderId, telephone, function,specialization)).apply();
    }

    //Actualizar

    public void upgradeBullider(BuilderId builderId, Telephone telephone, Function function, Specialization specialization){
        appendChange(new BullilderTupdated(builderId,telephone,function,specialization)).apply();
    }

    public void renameContract(ContractType contractType){
        appendChange(new ContractTypeChanged(contractType)).apply();
    }


    public ContractType getContractType() {
        return contractType;
    }

    public Set<Contractor> getContrators() {
        return contrators;
    }

    public Set<Builder> getBuilders() {
        return builders;
    }
}
