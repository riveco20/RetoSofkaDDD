package com.sofka.domainPaqueExplora.usecases.DocumentaryCenter;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.domainPaqueExplora.domain.documentarycenter.DocumentaryCenter;
import com.sofka.domainPaqueExplora.domain.documentarycenter.command.CreateCenterDocumentary;


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

