package com.sofka.domainPaqueExplora.domain.documentarycenter.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject.*;

public class TicketOfficeupdated extends DomainEvent {
    private TicketOfficeId ticketOfficeId;
    private NumberOfBallots numberOfBallots;
    private Date dateDay;
    private Money ticketMoney;
    private InvoiceDescription ticketDescription;

    public TicketOfficeupdated(TicketOfficeId entity, NumberOfBallots numberOfBallots, Date dateDay, Money ticketMoney, InvoiceDescription ticketDescription) {
        super("parqueexplora.bodega.facturataquillaactualizada");
        this.ticketOfficeId = entity;
        this.numberOfBallots = numberOfBallots;
        this.dateDay = dateDay;
        this.ticketMoney = ticketMoney;
        this.ticketDescription = ticketDescription;

        }

    public TicketOfficeId Entity() {
        return ticketOfficeId;
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
