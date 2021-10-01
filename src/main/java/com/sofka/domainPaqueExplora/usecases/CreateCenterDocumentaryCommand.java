package com.sofka.domainPaqueExplora.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domainPaqueExplora.domain.documentarycenter.DocumentaryCenter;
import com.sofka.domainPaqueExplora.domain.documentarycenter.command.CreateCenterDocumentary;
import com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject.DocumentaryCenterId;
import com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject.Name;

import java.util.List;

public class CreateCenterDocumentaryCommand extends UseCase<RequestCommand<CreateCenterDocumentary>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<CreateCenterDocumentary> createCenterDocumentaryRequestCommand) {
        var command =createCenterDocumentaryRequestCommand.getCommand();
        var documentaryCenter = new DocumentaryCenter(
                command.getDocumentaryCenterId(),
                command.getName()
        );
         emit().onResponse(new ResponseEvents(documentaryCenter.getUncommittedChanges()));
        };
    }

