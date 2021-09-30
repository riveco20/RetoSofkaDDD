package com.sofka.domainPaqueExplora.domain.documentarycenter;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.domainPaqueExplora.domain.documentarycenter.entity.Project;
import com.sofka.domainPaqueExplora.domain.documentarycenter.entity.PurchaseInvoice;
import com.sofka.domainPaqueExplora.domain.documentarycenter.entity.TicketOffice;
import com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject.*;

import java.util.Set;

public class DocumentaryCenter extends AggregateEvent<DocumentaryCenterId> {

    protected Set<PurchaseInvoice> puchases;
    protected Set<TicketOffice> ticketOffices;
    protected Set<Project> projectset;

    public DocumentaryCenter(DocumentaryCenterId entityId) {

        super(entityId);

    }
/**
    public void addProject(ProjectId entityId, ProjectName name, ProjectDescription projectDescription, Money capitalMoney, Date dateInitial, Date dateFinal){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(name);
        Objects.requireNonNull(projectDescription);
        Objects.requireNonNull(capitalMoney);
        Objects.requireNonNull(dateInitial);
        Objects.requireNonNull(dateFinal);
        appendChange(new ProjectAdded(ProjectId entityId, ProjectName name, ProjectDescription projectDescription, Money capitalMoney, Date dateInitial, Date dateFinal).apply();
    }

    public void addPurchaseInvoice(PurchaseInvoiceId entityId, Date datePurchase, CompanyName companyName, Money purchaseMoney, InvoiceDescription purchaseDescription){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(datePurchase);
        Objects.requireNonNull(companyName);
        Objects.requireNonNull(purchaseMoney);
        Objects.requireNonNull(purchaseDescription);
        appendChange(new PurchseInvoiceAdded(PurchaseInvoiceId entityId, Date datePurchase, CompanyName companyName, Money purchaseMoney, InvoiceDescription purchaseDescription).apply();
    }

    public void addTicketOfficeInvoice(TicketOfficeInvoiceId entityId, NumberOfBallots numberOfBallots , Date dateDay, Money ticketMoney, InvoiceDescription ticketDescription){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(numberOfBallots);
        Objects.requireNonNull(dateDay);
        Objects.requireNonNull(ticketMoney);
        Objects.requireNonNull(ticketDescription);
        appendChange(new TicketOfficeInvoiceAdded(ProjectId entityId, ProjectName name, ProjectDescription projectDescription, Money capitalMoney, Date dateInitial, Date dateFinal).apply();
    }
*/
}


