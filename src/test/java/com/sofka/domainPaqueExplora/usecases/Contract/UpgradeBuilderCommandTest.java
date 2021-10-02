package com.sofka.domainPaqueExplora.usecases.Contract;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domainPaqueExplora.domain.contract.Contract;
import com.sofka.domainPaqueExplora.domain.contract.command.UpgradeBuilder;
import com.sofka.domainPaqueExplora.domain.contract.event.BullilderAggregate;
import com.sofka.domainPaqueExplora.domain.contract.valueobject.*;
import com.sofka.domainPaqueExplora.domain.documentarycenter.command.CreateCenterDocumentary;
import com.sofka.domainPaqueExplora.domain.documentarycenter.event.DocumentaryCenterCreate;
import com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject.DocumentaryCenterId;
import com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject.Name;
import com.sofka.domainPaqueExplora.usecases.DocumentaryCenter.CreateCenterDocumentaryCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UpgradeBuilderCommandTest {


    @Test
    void upgradeBuilderCommandTest(){
        //arrange

        var command = new UpgradeBuilder(ContractId.of("sss"),new BuilderId("123"),
                new Telephone("1234567890"),new Specialization("jugando pley"),
                new Function("jugando en la casa")
        );
        var useCase = new UpgradeBuilderCommand();

        //act

        var events = UseCaseHandler.
                getInstance().
                syncExecutor(useCase,
                        new RequestCommand<>(command)).
                orElseThrow().
                getDomainEvents();

        //assert

        var event= (BullilderAggregate)events.get(0);
        Assertions.assertEquals("123",event.getBuilderId().value());
        Assertions.assertEquals("1234567890",event.getTelephone().value());
        Assertions.assertEquals("jugando pley",event.getSpecialization().value());
        Assertions.assertEquals("jugando en la casa",event.getFunction().value());
    }

    private List<DomainEvent>eventList{
        return List.of(
                new Contract(
                        new ContractId("154"),
                        new ContractType("Definido")
                ),
                new BullilderAggregate(
                        new BuilderId("123"),
                        new Telephone("0987652312"),
                        new Specialization("No voy a salir hoy"),
                        new Function("Estudiar mucho")
                );
    }
        )
    }

}