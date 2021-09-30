package com.sofka.domainPaqueExplora.domain.documentarycenter.entity;

import co.com.sofka.domain.generic.Entity;
import com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject.*;

import java.util.Objects;

public class Project extends Entity<ProjectId> {

    private ProjectName name;
    private ProjectDescription projectDescription;
    private Date dateInitial;
    private Date dateFinal;
    private Money capitalMoney;

    public Project(ProjectId entityId, ProjectName name, ProjectDescription projectDescription, Money capitalMoney, Date dateInitial, Date dateFinal) {
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

    public void upgradeDate(Date dateInitial,Date dateFinal){
        this.dateInitial = Objects.requireNonNull(dateInitial);
        this.dateFinal = Objects.requireNonNull(dateFinal);
    }


   public void upgradeSpecifications(ProjectDescription projectDescription){
       this.projectDescription = Objects.requireNonNull(projectDescription);
    }

    public ProjectName Name() {
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
