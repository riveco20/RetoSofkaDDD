package com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject;

import co.com.sofka.domain.generic.Identity;

public class PurchaseInvoiceId extends Identity {
    public PurchaseInvoiceId(String id){
        super(id);
    }

    public PurchaseInvoiceId(){}

    public static PurchaseInvoiceId of(String id){
        return new PurchaseInvoiceId(id);
    }
}
