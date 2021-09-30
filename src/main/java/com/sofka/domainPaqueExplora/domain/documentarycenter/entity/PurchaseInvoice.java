package com.sofka.domainPaqueExplora.domain.documentarycenter.entity;

import co.com.sofka.domain.generic.Entity;
import com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject.*;

import java.util.Objects;

public class PurchaseInvoice extends Entity<PurchaseInvoiceId> {

    private Date datePurchase;
    private Money purchaseMoney;
    private InvoiceDescription purchaseDescription;
    private CompanyName companyName;

    public PurchaseInvoice(PurchaseInvoiceId entityId, Date datePurchase, CompanyName companyName, Money purchaseMoney, InvoiceDescription purchaseDescription) {
        super(entityId);
        this.datePurchase=datePurchase;
        this.companyName= companyName;
        this.purchaseMoney=purchaseMoney;
        this.purchaseDescription=purchaseDescription;
    }

    public void upgradeData(Date datePurchase,CompanyName companyName, Money purchaseMoney, InvoiceDescription purchaseDescription){
        this.datePurchase=Objects.requireNonNull(datePurchase);
        this.companyName=Objects.requireNonNull(companyName);
        this.purchaseMoney= Objects.requireNonNull(purchaseMoney);
        this.purchaseDescription=Objects.requireNonNull(purchaseDescription);
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
