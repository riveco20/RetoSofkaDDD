package com.sofka.domainPaqueExplora.domain.documentarycenter.event;

import co.com.sofka.domain.generic.DomainEvent;

public class DocumentaryCenterCreate extends DomainEvent {
   private final String letraArchivo;
    public DocumentaryCenterCreate(String name) {
        super("Archivo Creado");
        this.letraArchivo=name;
    }

    public String LetraArchivo() {
        return letraArchivo;
    }
}
