package com.sofka.domainPaqueExplora.domain.documentarycenter.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject.*;

public class Projectupdated extends DomainEvent {
    private Name name;
    private ProjectDescription projectDescription;
    private Date dateInitial;
    private Date dateFinal;
    private Money capitalMoney;
    private ProjectId projectId;


    public Projectupdated(ProjectId projectId,Name name, ProjectDescription projectDescription, Date dateInitial, Date dateFinal, Money capitalMoney) {
        super("parqueexplora.bodega.proyectoactualizado");
        this.name = name;
        this.projectDescription = projectDescription;
        this.dateInitial = dateInitial;
        this.dateFinal = dateFinal;
        this.capitalMoney = capitalMoney;
        this.projectId = projectId;
    }

    public Name getName() {
        return name;
    }

    public ProjectDescription ProjectDescription() {
        return projectDescription;
    }

    public Date DateInitial() {
        return dateInitial;
    }

    public Date DateFinal() {
        return dateFinal;
    }

    public Money CapitalMoney() {
        return capitalMoney;
    }

    public ProjectId ProjectId() {
        return projectId;
    }
}
