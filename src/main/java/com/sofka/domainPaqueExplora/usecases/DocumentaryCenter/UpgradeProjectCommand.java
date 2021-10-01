package com.sofka.domainPaqueExplora.usecases.DocumentaryCenter;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.domainPaqueExplora.domain.contract.valueobject.Email;
import com.sofka.domainPaqueExplora.domain.documentarycenter.DocumentaryCenter;
import com.sofka.domainPaqueExplora.domain.documentarycenter.command.UpgradeProject;

public class UpgradeProjectCommand extends UseCase<RequestCommand<UpgradeProject>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<UpgradeProject> upgradeProjectRequestCommand) {
        var command = upgradeProjectRequestCommand.getCommand();
        var documentary = DocumentaryCenter.from(command.getDocumentaryCenterId(), retrieveEvents(command.getProjectId().value()));
        documentary.upgradeProject(command.getProjectId(),
                command.getName(),
                command.getProjectDescription(),
                command.getCapitalMoney(),
                command.getDateInitial(),
                command.getDateFinal()
        );
    emit().onResponse(new ResponseEvents(documentary.getUncommittedChanges()));
    }

    }
