package com.sofka.domainPaqueExplora.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.domainPaqueExplora.domain.contract.Contract;
import com.sofka.domainPaqueExplora.domain.contract.command.CreateContract;
import com.sofka.domainPaqueExplora.domain.documentarycenter.DocumentaryCenter;

public class CreateContractCommand extends UseCase<RequestCommand<CreateContract>, ResponseEvents>{
    @Override
    public void executeUseCase(RequestCommand<CreateContract> createContractRequestCommand) {
        var command =createContractRequestCommand.getCommand();
        var contract = new Contract(command.getContractId(),command.getContractType());
        emit().onResponse(new ResponseEvents(contract.getUncommittedChanges()));
    };

    }


