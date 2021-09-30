package com.sofka.domainPaqueExplora.domain.documentarycenter.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject.*;

public class TicketOfficeAdded extends DomainEvent {
    private final NumberOfBallots numberOfBallots;
    private final Date dateDay;
    private final Money ticketMoney;
    private final InvoiceDescription ticketDescription;
    private final TicketOfficeId entityId;

    public TicketOfficeAdded(TicketOfficeId entityId,NumberOfBallots numberOfBallots, Date dateDay, Money ticketMoney, InvoiceDescription ticketDescription) {
        super("ParqueExplora.Winery.TicketOfficeAdded");
        this.entityId=entityId;
        this.numberOfBallots = numberOfBallots;
        this.dateDay = dateDay;
        this.ticketMoney = ticketMoney;
        this.ticketDescription = ticketDescription;
    }

    public NumberOfBallots NumberOfBallots() {
        return numberOfBallots;
    }

    public Date DateDay() {
        return dateDay;
    }

    public Money TicketMoney() {
        return ticketMoney;
    }

    public InvoiceDescription TicketDescription() {
        return ticketDescription;
    }
}
