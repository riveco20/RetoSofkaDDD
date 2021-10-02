package com.sofka.domainPaqueExplora.usecases.Contract;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.domainPaqueExplora.domain.contract.command.AddBuilder;
import com.sofka.domainPaqueExplora.domain.contract.event.BullilderAggregate;
import com.sofka.domainPaqueExplora.domain.contract.valueobject.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddBuilderCommandTest {
    @Test
    void crearDocumentaryCenter(){
        //arrange

        var command = new AddBuilder(ContractId.of("123"),new BuilderId("1234"),
                new Telephone("1234567890"),
                new Specialization("Arquitectura temprana edad"),
                new Function("Actualizar la fachada"));
        var useCase = new AddBuilderCommand();

        //act

        var events = UseCaseHandler.
                getInstance().
                syncExecutor(useCase,
                        new RequestCommand<>(command)).
                orElseThrow().
                getDomainEvents();

        //assert

        var event= (BullilderAggregate)events.get(0);
        Assertions.assertEquals("1234",event.getBuilderId().value());
        Assertions.assertEquals("1234567890",event.getTelephone().value());
        Assertions.assertEquals("Arquitectura temprana edad",event.getSpecialization().value());
        Assertions.assertEquals("Actualizar la fachada",event.getFunction().value());

    }


}