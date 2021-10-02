package com.sofka.domainPaqueExplora.usecases.DocumentaryCenter;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.domainPaqueExplora.domain.documentarycenter.command.AddProject;
import com.sofka.domainPaqueExplora.domain.documentarycenter.event.DocumentaryCenterCreate;
import com.sofka.domainPaqueExplora.domain.documentarycenter.event.ProjectAdded;
import com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddProjectCommandTest {

    @Test
    @DisplayName("Prueba para crear")
    void crearDocumentaryCenter(){
        //arrange

        var command = new AddProject(DocumentaryCenterId.of("A"),new ProjectId("W123"), new Name("Movilidad"),new ProjectDescription("Proyecto para la movilidad")
        ,new Money("3000000"),new Date("23/10/21"),new Date("29/12/21"));
        var useCase = new AddProjectCommand();

        //act

        var events = UseCaseHandler.
                getInstance().
                syncExecutor(useCase, new RequestCommand<>(command)).
                orElseThrow().
                getDomainEvents();

        //assert

        var event= (ProjectAdded)events.get(0);
        Assertions.assertEquals("W123",event.EntityID().value());
        Assertions.assertEquals("Movilidad",event.getName().value());
        Assertions.assertEquals("Proyecto para la movilidad",event.ProjectDescription().value());
        Assertions.assertEquals("3000000",event.CapitalMoney().value());
        Assertions.assertEquals("23/10/21",event.DateInitial().value());
        Assertions.assertEquals("29/12/21",event.DateFinal().value());
    }


}