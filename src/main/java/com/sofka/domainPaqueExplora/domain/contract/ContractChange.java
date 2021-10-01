package com.sofka.domainPaqueExplora.domain.contract;

import co.com.sofka.domain.generic.EventChange;
import com.sofka.domainPaqueExplora.domain.contract.entity.Builder;
import com.sofka.domainPaqueExplora.domain.contract.event.BullilderAggregate;
import com.sofka.domainPaqueExplora.domain.contract.event.BullilderTupdated;
import com.sofka.domainPaqueExplora.domain.contract.event.ContractCreate;

import java.util.HashSet;

public class ContractChange extends EventChange {
    public ContractChange(Contract contract) {
        apply((ContractCreate event) -> {
            contract.contractType = event.getContractType();
            contract.builders = new HashSet<>();
        });

        apply((BullilderAggregate envet) -> {
            var numerProject = contract.builders.size();
            if (numerProject == 3) {
                throw new IllegalArgumentException("no se puede Archivar mas de 4 proyecto ");
            }
            contract.builders.add(new Builder(envet.getBuilderId(),
                    envet.getTelephone(),
                    envet.getFunction(),
                    envet.getSpecialization()));
        });

        apply((BullilderTupdated event)->{
            var builder = contract.getBuilderId(event.getEntityId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encontro el contrato del contratista ingresado"));
                    builder.upgradeTelephone(event.getTelephone());
                    builder.upgradeFunction(event.getFunction());

             });

        apply((ContractCreate event)->{

            contract.contractType = event.getContractType();

        });

    }

}
