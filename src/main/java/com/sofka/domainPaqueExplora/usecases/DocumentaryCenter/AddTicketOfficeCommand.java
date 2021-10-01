package com.sofka.domainPaqueExplora.usecases.DocumentaryCenter;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.domainPaqueExplora.domain.documentarycenter.DocumentaryCenter;
import com.sofka.domainPaqueExplora.domain.documentarycenter.command.AddTicketOffice;

public class AddTicketOfficeCommand extends UseCase<RequestCommand<AddTicketOffice>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AddTicketOffice> addProjectRequestCommand) {
        var command = addProjectRequestCommand.getCommand();
        var documentary = DocumentaryCenter.from(command.getDocumentaryCenterId(), retrieveEvents(command.getTicketOfficeId().value()));
        documentary.addTicketOfficeInvoice(command.getTicketOfficeId(),command.getNumberOfBallots(),command.getDateDay(),command.getTicketMoney(),command.getTicketDescription());
        emit().onResponse(new ResponseEvents(documentary.getUncommittedChanges()));
    }
}