package com.sofka.domainPaqueExplora.domain.documentarycenter.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject.*;

public class ProjectAdded extends DomainEvent {

    private final ProjectId entityID;
    private final ProjectName name;
    private final ProjectDescription projectDescription;
    private final Money capitalMoney;
    private final Date dateInitial;
    private final Date dateFinal;

    public ProjectAdded(ProjectId entityID, ProjectName name, ProjectDescription projectDescription, Money capitalMoney, Date dateInitial, Date dateFinal) {
        super("ParqueExplora.Winery.ProjectAdded");
        this.entityID = entityID;
        this.name = name;
        this.projectDescription = projectDescription;
        this.capitalMoney = capitalMoney;
        this.dateInitial = dateInitial;
        this.dateFinal = dateFinal;
    }

    public ProjectId EntityID() {
        return entityID;
    }

    public ProjectName Name() {
        return name;
    }

    public ProjectDescription ProjectDescription() {
        return projectDescription;
    }

    public Money CapitalMoney() {
        return capitalMoney;
    }

    public Date DateInitial() {
        return dateInitial;
    }

    public Date DateFinal() {
        return dateFinal;
    }
}
