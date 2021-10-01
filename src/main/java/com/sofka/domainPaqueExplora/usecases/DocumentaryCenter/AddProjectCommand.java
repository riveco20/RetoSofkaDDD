package com.sofka.domainPaqueExplora.usecases.DocumentaryCenter;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.domainPaqueExplora.domain.documentarycenter.DocumentaryCenter;
import com.sofka.domainPaqueExplora.domain.documentarycenter.command.AddProject;

public class AddProjectCommand extends UseCase<RequestCommand<AddProject>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AddProject> addProjectRequestCommand) {
    var command = addProjectRequestCommand.getCommand();
    var documentary= DocumentaryCenter.from(command.getDocumentaryCenterId(),retrieveEvents(command.getProjectId().value()));
    documentary.addProject(command.getProjectId(),command.getName(),command.getProjectDescription(),command.getCapitalMoney(),command.getDateInitial(),command.getDateFinal());
    emit().onResponse(new ResponseEvents(documentary.getUncommittedChanges()));
    }
}
