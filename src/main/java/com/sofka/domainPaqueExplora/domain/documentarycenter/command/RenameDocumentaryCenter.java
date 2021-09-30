package com.sofka.domainPaqueExplora.domain.documentarycenter.command;

import co.com.sofka.domain.generic.Command;
import com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject.DocumentaryCenterId;
import com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject.Name;

public class RenameDocumentaryCenter extends Command {
    private final DocumentaryCenterId documentaryCenterId;
    private final Name name;

    public RenameDocumentaryCenter(DocumentaryCenterId documentaryCenterId, Name name) {
        this.documentaryCenterId = documentaryCenterId;
        this.name = name;
    }

    public DocumentaryCenterId getDocumentaryCenterId() {
        return documentaryCenterId;
    }

    public Name getName() {
        return name;
    }
}
