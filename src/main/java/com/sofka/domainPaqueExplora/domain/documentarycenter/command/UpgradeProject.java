package com.sofka.domainPaqueExplora.domain.documentarycenter.command;

import co.com.sofka.domain.generic.Command;
import com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject.*;

public class UpgradeProject extends Command {
    private final DocumentaryCenterId documentaryCenterId;
    private final Name name;
    private final ProjectDescription projectDescription;
    private final Money capitalMoney;
    private final Date dateInitial;
    private final Date dateFinal;


    public UpgradeProject(DocumentaryCenterId documentaryCenterId, Name name, ProjectDescription projectDescription, Money capitalMoney, Date dateInitial, Date dateFinal) {
        this.documentaryCenterId = documentaryCenterId;
        this.name = name;
        this.projectDescription = projectDescription;
        this.capitalMoney = capitalMoney;
        this.dateInitial = dateInitial;
        this.dateFinal = dateFinal;
    }

    public DocumentaryCenterId getDocumentaryCenterId() {
        return documentaryCenterId;
    }

    public Name getName() {
        return name;
    }

    public ProjectDescription getProjectDescription() {
        return projectDescription;
    }

    public Money getCapitalMoney() {
        return capitalMoney;
    }

    public Date getDateInitial() {
        return dateInitial;
    }

    public Date getDateFinal() {
        return dateFinal;
    }
}
