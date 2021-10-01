package com.sofka.domainPaqueExplora.domain.contract.entity;

import co.com.sofka.domain.generic.Entity;
import com.sofka.domainPaqueExplora.domain.contract.valueobject.AllyId;
import com.sofka.domainPaqueExplora.domain.contract.valueobject.Post;
import com.sofka.domainPaqueExplora.domain.contract.valueobject.Telephone;
import com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject.Name;

import java.util.Objects;

public class Ally extends Entity<AllyId>{
    private Name name;
    private Telephone telephone;
    private Post post;


    public Ally(AllyId entityId, Name name, Telephone telephone, Post post) {
        super(entityId);
        this.name=name;
        this.telephone=telephone;
        this.post=post;

    }


    public void upgradeTelephone(Telephone telephone){

        this.telephone = Objects.requireNonNull(telephone);
    }

    public Name getName() {
        return name;
    }

    public Telephone getTelephone() {
        return telephone;
    }

    public Post getPost() {
        return post;
    }
}
