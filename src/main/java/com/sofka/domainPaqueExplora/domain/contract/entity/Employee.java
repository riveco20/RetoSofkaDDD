package com.sofka.domainPaqueExplora.domain.contract.entity;

import co.com.sofka.domain.generic.Entity;
import com.sofka.domainPaqueExplora.domain.contract.valueobject.EmpleoyeeId;
import com.sofka.domainPaqueExplora.domain.contract.valueobject.Post;
import com.sofka.domainPaqueExplora.domain.contract.valueobject.Salary;
import com.sofka.domainPaqueExplora.domain.contract.valueobject.Telephone;
import com.sofka.domainPaqueExplora.domain.documentarycenter.valueobject.Name;

import java.util.Objects;

public class Employee extends Entity<EmpleoyeeId>{
    private Name name;
    private Salary salary;
    private Telephone telephone;
    private Post post;

    public Employee(EmpleoyeeId entityId, Name name, Salary salary, Telephone telephone, Post post) {
        super(entityId);
        this.name = name;
        this.salary = salary;
        this.telephone = telephone;
        this.post = post;
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

    public Salary getSalary() {
        return salary;
    }

    public Telephone getTelephone() {
        return telephone;
    }

    public Post getPost() {
        return post;
    }
}
