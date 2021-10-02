package com.sofka.domainPaqueExplora.usecases.DocumentaryCenter;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.domainPaqueExplora.domain.documentarycenter.DocumentaryCenter;
import com.sofka.domainPaqueExplora.domain.documentarycenter.command.UpgradeProject;
import com.sofka.domainPaqueExplora.domain.documentarycenter.command.UpgradePucharseInovoice;

public class UpgradePucharSeInovoiceCommand extends UseCase<RequestCommand<UpgradePucharseInovoice>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<UpgradePucharseInovoice> upgradePucharseInovoicetRequestCommand) {
        var command = upgradePucharseInovoicetRequestCommand.getCommand();
        var documentary = DocumentaryCenter.from(command.getDocumentaryCenterId(),retrieveEvents(command.getPurchaseInvoiceId().value()));
        documentary.upgradePurchaseInvoice(
                command.getPurchaseInvoiceId(),
                command.getDatePurchase(),
                command.getPurchaseMoney(),
                command.getPurchaseDescription(),
                command.getCompanyName()

                );

        emit().onResponse(new ResponseEvents(documentary.getUncommittedChanges()));
    }
}
