package com.sofka.domainPaqueExplora.usecases.DocumentaryCenter;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.domainPaqueExplora.domain.documentarycenter.command.CreateCenterDocumentary;
import com.sofka.domainPaqueExplora.domain.documentarycenter.event.DocumentaryCenterCreate;
import com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject.DocumentaryCenterId;
import com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject.Name;
import com.sofka.domainPaqueExplora.usecases.DocumentaryCenter.CreateCenterDocumentaryCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CreateCenterDocumentaryCommandTest {

    private Object DocumentaryCenterChange;

    @Test
    void crearDocumentaryCenter(){
        //arrange

        var command = new CreateCenterDocumentary(
                DocumentaryCenterId.of("xxxxx"),
                new Name("Richard")
        );
        var useCase = new CreateCenterDocumentaryCommand();

        //act

        var events = UseCaseHandler.
                getInstance().
                syncExecutor(useCase,
                new RequestCommand<>(command)).
                orElseThrow().
                getDomainEvents();

        //assert

        var event= (DocumentaryCenterCreate)events.get(0);
        Assertions.assertEquals("Richard",event.getName().value());
    }

}