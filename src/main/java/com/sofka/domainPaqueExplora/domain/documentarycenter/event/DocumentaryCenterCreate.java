package com.sofka.domainPaqueExplora.domain.documentarycenter.event;

import co.com.sofka.domain.generic.DomainEvent;

public class DocumentaryCenterCreate extends DomainEvent {
   private final char letraArchivo;
    public DocumentaryCenterCreate(char letra) {
        super("Archivo Creado");
        this.letraArchivo=letra;
    }

    public char LetraArchivo() {
        return letraArchivo;
    }
}
