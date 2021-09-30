package com.sofka.domainPaqueExplora.domain.documentarycenter.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject.*;

public class PurcheseInvoiceupdated extends DomainEvent {
    private PurchaseInvoiceId purchaseInvoiceId;
    private Date datePurchase;
    private Money purchaseMoney;
    private InvoiceDescription purchaseDescription;
    private CompanyName companyName;

    public PurcheseInvoiceupdated(PurchaseInvoiceId entityId, Date datePurchase, CompanyName companyName, Money purchaseMoney, InvoiceDescription purchaseDescription) {
        super("parqueexplora.bodega.facturacompraactualizada");
    }

    public PurchaseInvoiceId Entity() {
        return purchaseInvoiceId;
    }

    public Date DatePurchase() {
        return datePurchase;
    }

    public Money PurchaseMoney() {
        return purchaseMoney;
    }

    public InvoiceDescription PurchaseDescription() {
        return purchaseDescription;
    }

    public CompanyName CompanyName() {
        return companyName;
    }
}

