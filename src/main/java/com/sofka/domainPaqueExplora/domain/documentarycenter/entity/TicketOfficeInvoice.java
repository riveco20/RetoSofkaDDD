package com.sofka.domainPaqueExplora.domain.documentarycenter.entity;

import co.com.sofka.domain.generic.Entity;
import com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject.*;

import java.util.Objects;

public class TicketOfficeInvoice extends Entity<TicketOfficeInvoiceId> {
    private NumberOfBallots numberOfBallots;
    private Date dateDay;
    private Money ticketMoney;
    private InvoiceDescription ticketDescription;

    public TicketOfficeInvoice(TicketOfficeInvoiceId entityId, NumberOfBallots numberOfBallots , Date dateDay, Money ticketMoney, InvoiceDescription ticketDescription) {

        super(entityId);
        this.numberOfBallots = numberOfBallots;
        this.dateDay=dateDay;
        this.ticketMoney = ticketMoney;
        this.ticketDescription=ticketDescription;
        }

    public void upgradeData(NumberOfBallots numberOfBallots,Date dateDay, Money ticketMoney, InvoiceDescription ticketDescription){
        this.numberOfBallots= Objects.requireNonNull(numberOfBallots);
        this.dateDay=Objects.requireNonNull(dateDay);
        this.ticketMoney= Objects.requireNonNull(ticketMoney);
        this.ticketDescription=Objects.requireNonNull(ticketDescription);
    }


    public NumberOfBallots NumberOfBallots() {
        return numberOfBallots;
    }

    public Date getDateDay() {
        return dateDay;
    }

    public Money TicketMoney() {
        return ticketMoney;
    }

    public InvoiceDescription TicketDescription() {
        return ticketDescription;
    }
}
