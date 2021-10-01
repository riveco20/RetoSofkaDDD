package com.sofka.domainPaqueExplora.usecases.Contract;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.domainPaqueExplora.domain.contract.Contract;
import com.sofka.domainPaqueExplora.domain.contract.command.AddBuilder;

public class AddBuilderCommand extends UseCase<RequestCommand<AddBuilder>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AddBuilder> addBuilderRequestCommand) {
        var command = addBuilderRequestCommand.getCommand();
        var contract= Contract.from(command.getContractId(),retrieveEvents(command.getBuilderId().value()));
        contract.addBullider(command.getBuilderId(),command.getTelephone(),command.getFunction(),command.getSpecialization());
        emit().onResponse(new ResponseEvents(contract.getUncommittedChanges()));

    }
}
