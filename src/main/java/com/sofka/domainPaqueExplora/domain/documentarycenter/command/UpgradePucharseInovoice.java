package com.sofka.domainPaqueExplora.domain.documentarycenter.command;

import co.com.sofka.domain.generic.Command;
import com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject.*;

public class UpgradePucharseInovoice extends Command {
    private final DocumentaryCenterId documentaryCenterId;
    private final Date datePurchase;
    private final Money purchaseMoney;
    private final InvoiceDescription purchaseDescription;
    private final Name companyName;

    public UpgradePucharseInovoice(DocumentaryCenterId documentaryCenterId, Date datePurchase, Money purchaseMoney, InvoiceDescription purchaseDescription, Name companyName) {
        this.documentaryCenterId = documentaryCenterId;
        this.datePurchase = datePurchase;
        this.purchaseMoney = purchaseMoney;
        this.purchaseDescription = purchaseDescription;
        this.companyName = companyName;
    }

    public DocumentaryCenterId getDocumentaryCenterId() {
        return documentaryCenterId;
    }

    public Date getDatePurchase() {
        return datePurchase;
    }

    public Money getPurchaseMoney() {
        return purchaseMoney;
    }

    public InvoiceDescription getPurchaseDescription() {
        return purchaseDescription;
    }

    public Name getCompanyName() {
        return companyName;
    }
}
