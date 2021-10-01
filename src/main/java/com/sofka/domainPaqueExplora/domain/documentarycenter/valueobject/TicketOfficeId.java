package com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject;


import co.com.sofka.domain.generic.Identity;

public class TicketOfficeId extends Identity {
    public TicketOfficeId(String id){
        super(id);
    }

    public TicketOfficeId(){}

    public static TicketOfficeId of(String id){
        return new TicketOfficeId(id);
    }

}
