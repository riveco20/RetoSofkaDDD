package com.sofka.domainPaqueExplora.domain.documentarycenter.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject.Name;

public class DocumentaryCenterCreate extends DomainEvent {
   private final Name letraArchivo;
    public DocumentaryCenterCreate(Name name) {
        super("Archivo Creado");
        this.letraArchivo=name;
    }

    public Name getName() {
        return letraArchivo;
    }
}
