package com.sofka.domainPaqueExplora.usecases.Contract;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.domainPaqueExplora.domain.contract.Contract;
import com.sofka.domainPaqueExplora.domain.contract.command.UpgradeBuilder;

public class UpgradeBuilderCommand extends UseCase<RequestCommand<UpgradeBuilder>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<UpgradeBuilder> upgradeBuilderRequestCommand) {
        var command = upgradeBuilderRequestCommand.getCommand();
        var contract = Contract.from(command.getContractId(),retrieveEvents(command.getBuilderId().value()));
        contract.upgradeBuilder(command.getBuilderId(),command.getTelephone(),command.getFunction(),command.getSpecialization());
    emit().onResponse(new ResponseEvents(contract.getUncommittedChanges()));
    }

}
