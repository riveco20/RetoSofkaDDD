package com.sofka.domainPaqueExplora.usecases.DocumentaryCenter;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.domainPaqueExplora.domain.documentarycenter.DocumentaryCenter;
import com.sofka.domainPaqueExplora.domain.documentarycenter.command.AddProject;

public class UpgradeProjectCommand extends UseCase<RequestCommand<AddProject>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AddProject> addProjectRequestCommand) {
    }
}
