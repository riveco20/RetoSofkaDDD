package com.sofka.domainPaqueExplora.domain.documentarycenter;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domainPaqueExplora.domain.documentarycenter.entity.Project;
import com.sofka.domainPaqueExplora.domain.documentarycenter.entity.PurchaseInvoice;
import com.sofka.domainPaqueExplora.domain.documentarycenter.entity.TicketOffice;
import com.sofka.domainPaqueExplora.domain.documentarycenter.event.*;
import com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class DocumentaryCenter extends AggregateEvent<DocumentaryCenterId> {

    protected Set<PurchaseInvoice> purchases;
    protected Set<TicketOffice> ticketOffices;
    protected Set<Project> projectset;


    public DocumentaryCenter(DocumentaryCenterId entityId,String name) {
        super(entityId);
       appendChange(new DocumentaryCenterCreate(name)).apply();
    }
    private DocumentaryCenter(DocumentaryCenterId entityId){
        super(entityId);
        subscribe(new DocumentaryCenterChange(this));
    }

    public static DocumentaryCenter from(DocumentaryCenterId documentaryCenterId, List<DomainEvent> events){
        var documentary = new DocumentaryCenter(documentaryCenterId);
        events.forEach(documentary::applyEvent);
        return documentary;
    }

        //Agregando Objetos
    public void addProject(ProjectId entityId, Name name, ProjectDescription projectDescription, Money capitalMoney, Date dateInitial, Date dateFinal){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(name);
        Objects.requireNonNull(projectDescription);
        Objects.requireNonNull(capitalMoney);
        Objects.requireNonNull(dateInitial);
        Objects.requireNonNull(dateFinal);
        appendChange(new ProjectAdded(entityId, name,projectDescription, capitalMoney, dateInitial, dateFinal)).apply();
    }

    public void addPurchaseInvoice(PurchaseInvoiceId entityId, Date datePurchase, Name companName, Money purchaseMoney, InvoiceDescription purchaseDescription){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(datePurchase);
        Objects.requireNonNull(companName);
        Objects.requireNonNull(purchaseMoney);
        Objects.requireNonNull(purchaseDescription);
        appendChange(new PurcheseInvoiceAdded(entityId,datePurchase,purchaseMoney,purchaseDescription,companName)).apply();
    }

    public void addTicketOfficeInvoice(TicketOfficeId entityId, NumberOfBallots numberOfBallots , Date dateDay, Money ticketMoney, InvoiceDescription ticketDescription){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(numberOfBallots);
        Objects.requireNonNull(dateDay);
        Objects.requireNonNull(ticketMoney);
        Objects.requireNonNull(ticketDescription);
        appendChange(new TicketOfficeAdded(entityId, numberOfBallots, dateDay, ticketMoney, ticketDescription)).apply();
    }

    //Actualizar

    public void upgradeProject(ProjectId entityId, Name name, ProjectDescription projectDescription, Money capitalMoney, Date dateInitial, Date dateFinal){
        appendChange(new Projectupdated(entityId,name,projectDescription,dateInitial,dateFinal,capitalMoney)).apply();
    }

    public void upgradePurchaseInvoice(PurchaseInvoiceId entityId, Date datePurchase, Name companyName, Money purchaseMoney, InvoiceDescription purchaseDescription){
        appendChange(new PurcheseInvoiceupdated(entityId,datePurchase,companyName,purchaseMoney,purchaseDescription)).apply();

    }

    public void ticketOfficeupgrade(TicketOfficeId entityId, NumberOfBallots numberOfBallots , Date dateDay, Money ticketMoney, InvoiceDescription ticketDescription){
        appendChange(new TicketOfficeupdated(entityId,numberOfBallots,dateDay,ticketMoney,ticketDescription)).apply();

    }

      //obtener mediante el id
    protected Optional<Project> getProjecFortId(ProjectId entityId){
        return projectset.
                stream().
                filter(project -> project.identity().equals(entityId))
                .findFirst();
    }

    protected Optional<PurchaseInvoice> getPurchaseForId(PurchaseInvoiceId entityId){
        return purchases.
                stream().
                filter(purchase -> purchase.identity().equals(entityId))
                .findFirst();
    }

    protected Optional<TicketOffice> getTicketOfficeForId(TicketOfficeId entityId){
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


