package com.sofka.domainPaqueExplora.usecases.Contract;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.domainPaqueExplora.domain.contract.command.CreateContract;
import com.sofka.domainPaqueExplora.domain.contract.event.ContractCreate;
import com.sofka.domainPaqueExplora.domain.contract.event.ContractTypeChanged;
import com.sofka.domainPaqueExplora.domain.contract.valueobject.ContractId;
import com.sofka.domainPaqueExplora.domain.contract.valueobject.ContractType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateContractCommandTest {
    @Test
    void crearDocumentaryCenter(){
        //arrange

        var command = new CreateContract(ContractId.of("123"),
                new ContractType("TerminoFijo"));
        var useCase = new CreateContractCommand();

        //act

        var events = UseCaseHandler.
                getInstance().
                syncExecutor(useCase,
                        new RequestCommand<>(command)).
                orElseThrow().
                getDomainEvents();

        //assert

        var event= (ContractCreate)events.get(0);
        Assertions.assertEquals("TerminoFijo",event.getContractType().value());
    }

}