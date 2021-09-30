package com.sofka.domainPaqueExplora.domain.documentarycenter.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject.*;

public class ticketOfficeupdated extends DomainEvent {
    private TicketOfficeId entity;
    private NumberOfBallots numberOfBallots;
    private Date dateDay;
    private Money ticketMoney;
    private InvoiceDescription ticketDescription;

    public ticketOfficeupdated(TicketOfficeId entity, NumberOfBallots numberOfBallots, Date dateDay, Money ticketMoney, InvoiceDescription ticketDescription) {
        super("parqueexplora.bodega.facturataquillaactualizada");
        this.entity = entity;
        this.numberOfBallots = numberOfBallots;
        this.dateDay = dateDay;
        this.ticketMoney = ticketMoney;
        this.ticketDescription = ticketDescription;

        }

    public TicketOfficeId Entity() {
        return entity;
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
