package com.sofka.domainPaqueExplora.domain.documentarycenter;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.domainPaqueExplora.domain.documentarycenter.entity.Project;
import com.sofka.domainPaqueExplora.domain.documentarycenter.entity.PurchaseInvoice;
import com.sofka.domainPaqueExplora.domain.documentarycenter.entity.TicketOffice;
import com.sofka.domainPaqueExplora.domain.documentarycenter.event.ProjectAdded;
import com.sofka.domainPaqueExplora.domain.documentarycenter.event.PurcheseInvoiceAdded;
import com.sofka.domainPaqueExplora.domain.documentarycenter.event.TicketOfficeAdded;
import com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject.*;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class DocumentaryCenter extends AggregateEvent<DocumentaryCenterId> {

    protected Set<PurchaseInvoice> purchases;
    protected Set<TicketOffice> ticketOffices;
    protected Set<Project> projectset;

    public DocumentaryCenter(DocumentaryCenterId entityId) {

        super(entityId);

    }
        //Agregando Objetos
    public void addProject(ProjectId entityId, ProjectName name, ProjectDescription projectDescription, Money capitalMoney, Date dateInitial, Date dateFinal){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(name);
        Objects.requireNonNull(projectDescription);
        Objects.requireNonNull(capitalMoney);
        Objects.requireNonNull(dateInitial);
        Objects.requireNonNull(dateFinal);
        appendChange(new ProjectAdded(entityId, name,projectDescription, capitalMoney, dateInitial, dateFinal));
    }

    public void addPurchaseInvoice(PurchaseInvoiceId entityId, Date datePurchase, CompanyName companyName, Money purchaseMoney, InvoiceDescription purchaseDescription){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(datePurchase);
        Objects.requireNonNull(companyName);
        Objects.requireNonNull(purchaseMoney);
        Objects.requireNonNull(purchaseDescription);
        appendChange(new PurcheseInvoiceAdded(entityId,datePurchase,purchaseMoney,purchaseDescription,companyName));
    }

    public void addTicketOfficeInvoice(TicketOfficeId entityId, NumberOfBallots numberOfBallots , Date dateDay, Money ticketMoney, InvoiceDescription ticketDescription){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(numberOfBallots);
        Objects.requireNonNull(dateDay);
        Objects.requireNonNull(ticketMoney);
        Objects.requireNonNull(ticketDescription);
        appendChange(new TicketOfficeAdded(entityId, numberOfBallots, dateDay, ticketMoney, ticketDescription));
    }


      //obtener mediante el id
    public Optional<Project> getProjectId(ProjectId entityId){
        return projectset.
                stream().
                filter(project -> project.identity().equals(entityId))
                .findFirst();
    }

    public Optional<PurchaseInvoice> getProjectId(PurchaseInvoiceId entityId){
        return purchases.
                stream().
                filter(purchase -> purchase.identity().equals(entityId))
                .findFirst();
    }

    public Optional<TicketOffice> getProjectId(TicketOfficeId entityId){
        return ticketOffices.
                stream().
                filter(ticketOffice -> ticketOffice.identity().equals(entityId))
                .findFirst();
    }
    public Set<PurchaseInvoice> Puchases() {
        return purchases;
    }

    public Set<TicketOffice> TicketOffices() {
        return ticketOffices;
    }

    public Set<Project> Projectset() {
        return projectset;
    }
}


