package com.sofka.domainPaqueExplora.domain.documentarycenter.event;

import co.com.sofka.domain.generic.DomainEvent;

public class MessageSent extends DomainEvent {

    private final String message;

    public MessageSent(String message) {
        super("parqueexplora.bodega.mensajeenviado");
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
