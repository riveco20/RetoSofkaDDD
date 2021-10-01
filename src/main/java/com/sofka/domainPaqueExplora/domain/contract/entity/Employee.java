package com.sofka.domainPaqueExplora.domain.contract.entity;

import co.com.sofka.domain.generic.Entity;
import com.sofka.domainPaqueExplora.domain.contract.valueobject.EmpleoyeeId;
import com.sofka.domainPaqueExplora.domain.contract.valueobject.Post;
import com.sofka.domainPaqueExplora.domain.contract.valueobject.Email;
import com.sofka.domainPaqueExplora.domain.contract.valueobject.Telephone;
import com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject.Money;
import com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject.Name;

import java.util.Objects;

public class Employee extends Entity<EmpleoyeeId>{
    private Name name;
    private Email email;
    private Telephone telephone;
    private Post post;
    private Money salary;
    public Employee(EmpleoyeeId entityId, Name name, Email email, Telephone telephone, Post post, Money salary) {
        super(entityId);
        this.name = name;
        this.email = email;
        this.telephone = telephone;
        this.post = post;
        this.salary =salary;
    }
    public void upgradeTelephone(Telephone telephone){
        this.telephone = Objects.requireNonNull(telephone);
    }


    public void upgradePost(Post post){
        this.post = Objects.requireNonNull(post);
    }

    public Name getName() {
        return name;
    }

    public Email getSalary() {
        return email;
    }

    public Telephone getTelephone() {
        return telephone;
    }

    public Post getPost() {
        return post;
    }
}
