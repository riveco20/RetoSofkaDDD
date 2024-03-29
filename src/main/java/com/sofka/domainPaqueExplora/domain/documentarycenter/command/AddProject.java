package com.sofka.domainPaqueExplora.domain.documentarycenter.command;

import co.com.sofka.domain.generic.Command;
import com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject.*;

public class AddProject extends Command{
    private final DocumentaryCenterId documentaryCenterId;
    private final ProjectId projectId;
    private final Name name;
    private final ProjectDescription projectDescription;
    private final Money capitalMoney;
    private final Date dateInitial;
    private final Date dateFinal;



    public AddProject(DocumentaryCenterId documentaryCenterId,ProjectId projectId, Name name, ProjectDescription projectDescription, Money capitalMoney, Date dateInitial, Date dateFinal) {
        this.documentaryCenterId = documentaryCenterId;
        this.projectId=projectId;
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

    public ProjectId getProjectId() {
        return projectId;
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
