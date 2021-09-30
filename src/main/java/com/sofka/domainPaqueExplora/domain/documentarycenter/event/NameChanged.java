package com.sofka.domainPaqueExplora.domain.documentarycenter.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject.Name;

public class NameChanged extends DomainEvent {
   private final Name name;
    public NameChanged(Name name) {
        super("parqueexplora.bodega.nombredocumentocentralcambiado");
        this.name=name;
    }

    public Name getName() {
        return name;
    }
}
