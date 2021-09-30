package com.sofka.domainPaqueExplora.domain.documentarycenter;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject.DocumentaryCenterId;

public class DocumentaryCenter extends AggregateEvent<DocumentaryCenterId> {

    public DocumentaryCenter(DocumentaryCenterId entityId) {
        super(entityId);
            }
}
