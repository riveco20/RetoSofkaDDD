package com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject;

import co.com.sofka.domain.generic.Identity;

public class ProjectId extends Identity {
    public ProjectId(String id){
        super(id);
    }

    public ProjectId(){}

    public static ProjectId of(String id){
        return new ProjectId(id);
    }
}
