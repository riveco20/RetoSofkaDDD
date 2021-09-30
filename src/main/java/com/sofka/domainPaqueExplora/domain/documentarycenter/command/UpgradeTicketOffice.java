package com.sofka.domainPaqueExplora.domain.documentarycenter.command;

import co.com.sofka.domain.generic.Command;
import com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject.*;

public class UpgradeTicketOffice extends Command {
    private final DocumentaryCenterId documentaryCenterId;
    private final NumberOfBallots numberOfBallots;
    private final Date dateDay;
    private final Money ticketMoney;
    private final InvoiceDescription ticketDescription;


    public UpgradeTicketOffice(DocumentaryCenterId documentaryCenterId, NumberOfBallots numberOfBallots, Date dateDay, Money ticketMoney, InvoiceDescription ticketDescription) {
        this.documentaryCenterId = documentaryCenterId;
        this.numberOfBallots = numberOfBallots;
        this.dateDay = dateDay;
        this.ticketMoney = ticketMoney;
        this.ticketDescription = ticketDescription;
    }

    public DocumentaryCenterId getDocumentaryCenterId() {
        return documentaryCenterId;
    }

    public NumberOfBallots getNumberOfBallots() {
        return numberOfBallots;
    }

    public Date getDateDay() {
        return dateDay;
    }

    public Money getTicketMoney() {
        return ticketMoney;
    }

    public InvoiceDescription getTicketDescription() {
        return ticketDescription;
    }
}

