package com.sofka.domainPaqueExplora.domain.documentarycenter.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject.*;

public class PurcheseInvoiceupdated extends DomainEvent {
    private PurchaseInvoiceId purchaseInvoiceId;
    private Date datePurchase;
    private Money purchaseMoney;
    private InvoiceDescription purchaseDescription;
    private Name companyName;

    public PurcheseInvoiceupdated(PurchaseInvoiceId entityId, Date datePurchase, Money purchaseMoney, InvoiceDescription purchaseDescription,Name companyName) {
        super("parqueexplora.bodega.facturacompraactualizada");
    }

    public PurchaseInvoiceId PurchaseInvoiceId() {
        return purchaseInvoiceId;
    }

    public Date DatePurchase() {
        return datePurchase;
    }

    public Money getPurchaseMoney() {
        return purchaseMoney;
    }

    public InvoiceDescription PurchaseDescription() {
        return purchaseDescription;
    }

    public Name CompanyName() {
        return companyName;
    }
}

