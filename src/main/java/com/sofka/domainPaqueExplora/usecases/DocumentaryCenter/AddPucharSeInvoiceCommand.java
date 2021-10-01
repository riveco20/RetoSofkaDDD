package com.sofka.domainPaqueExplora.usecases.DocumentaryCenter;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.domainPaqueExplora.domain.documentarycenter.DocumentaryCenter;
import com.sofka.domainPaqueExplora.domain.documentarycenter.command.AddPucharSelnvoice;

public class AddPucharSeInvoiceCommand extends UseCase<RequestCommand<AddPucharSelnvoice>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<AddPucharSelnvoice> addPucharSelnvoiceRequestCommand) {
        var command = addPucharSelnvoiceRequestCommand.getCommand();
        var documentary = DocumentaryCenter.from(command.getDocumentaryCenterId(), retrieveEvents(command.getPurchaseInvoiceId().value()));
        documentary.addPurchaseInvoice(command.getPurchaseInvoiceId(),command.getDatePurchase(),command.getCompanyName(),command.getPurchaseMoney(),command.getPurchaseDescription());
        emit().onResponse(new ResponseEvents(documentary.getUncommittedChanges()));
    }
}