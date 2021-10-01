package com.sofka.domainPaqueExplora.usecases.DocumentaryCenter;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import com.sofka.domainPaqueExplora.domain.documentarycenter.DocumentaryCenter;
import com.sofka.domainPaqueExplora.domain.documentarycenter.event.ProjectAdded;
import com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject.DocumentaryCenterId;

import java.util.Objects;

public class ProjectCreatedAlertEvent extends UseCase<TriggeredEvent<ProjectAdded>, ResponseEvents> {
    @Override
    public void executeUseCase(TriggeredEvent<ProjectAdded> projectAddedTriggeredEvent) {
        var event = projectAddedTriggeredEvent.getDomainEvent();
        var project = DocumentaryCenter.from(DocumentaryCenterId.of(event.aggregateRootId()),this.retrieveEvents());
        var message = "Se a guardado un archivo nuevo";
        project.sendAlert(message);

        if(event.getName().value()!=null)return;{

        emit().onResponse(new ResponseEvents(project.getUncommittedChanges()));
        }

    }
}
