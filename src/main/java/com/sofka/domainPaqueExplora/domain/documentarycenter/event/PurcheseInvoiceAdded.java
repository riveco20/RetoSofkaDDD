package com.sofka.domainPaqueExplora.domain.documentarycenter.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject.*;
public class PurcheseInvoiceAdded extends DomainEvent {
    private final Date datePurchase;
    private final Money purchaseMoney;
    private final InvoiceDescription purchaseDescription;
    private final CompanyName companyName;
    private final PurchaseInvoiceId entityId;

    public PurcheseInvoiceAdded(PurchaseInvoiceId entityId, Date datePurchase, Money purchaseMoney, InvoiceDescription purchaseDescription, CompanyName companyName) {
        super("ParqueExplora.Winery.purcheseInvoiceAdded");
        this.datePurchase = datePurchase;
        this.purchaseMoney = purchaseMoney;
        this.purchaseDescription = purchaseDescription;
        this.companyName = companyName;
        this.entityId = entityId;
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
