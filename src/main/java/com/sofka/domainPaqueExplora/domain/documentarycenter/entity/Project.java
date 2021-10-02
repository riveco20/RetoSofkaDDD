package com.sofka.domainPaqueExplora.domain.documentarycenter.entity;

import co.com.sofka.domain.generic.Entity;
import com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject.*;

import java.util.Objects;

public class Project extends Entity<ProjectId> {

    private Name name;
    private ProjectDescription projectDescription;
    private Date dateInitial;
    private Date dateFinal;
    private Money capitalMoney;

    public Project(ProjectId entityId, Name name, ProjectDescription projectDescription, Money capitalMoney, Date dateInitial, Date dateFinal) {
        super(entityId);
        this.name=name;
        this.projectDescription = projectDescription;
        this.dateInitial=dateInitial;
        this.dateFinal = dateFinal;
        this.capitalMoney=capitalMoney;
    }

    public void upgradeCapitalMoney(Money capitalMoney) {
        this.capitalMoney = Objects.requireNonNull(capitalMoney);
    }

    public void upgradeDateInitial(Date dateInitial) {
        this.dateInitial = Objects.requireNonNull(dateInitial);
    }

    public void upgradeDateFinal(Date dateFinal) {
        this.dateFinal = Objects.requireNonNull(dateFinal);
    }


   public void upgradeSpecifications(ProjectDescription projectDescription){
       this.projectDescription = Objects.requireNonNull(projectDescription);
    }


    public Name getName() {
        return name;
    }

    public ProjectDescription Thickening() {
        return projectDescription;
    }

    public Date DateFinal() {
        return dateFinal;
    }

    public Date getDateInitial()
    {
        return dateInitial;
    }
    public Money CapitalMoney() {
        return capitalMoney;
    }
}
