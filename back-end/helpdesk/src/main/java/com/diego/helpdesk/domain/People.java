package com.diego.helpdesk.domain;

import com.diego.helpdesk.domain.enums.Profile;

import java.time.LocalDate;
import java.util.HashSet;

import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public abstract class People {

    protected Integer id;
    protected String name;
    protected String cpf;
    protected String email;
    protected String password;

    protected Set<Integer> profiles = new HashSet<>();
    protected LocalDate dateCreated = LocalDate.now();

    public People() {
        super();
    }

    public People(Integer id, String name, String email, String password, String cpf) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.cpf = cpf;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Profile> getProfiles() {
        return profiles.stream().map(x -> Profile.toEnum(x)).collect(Collectors.toSet());
    }

    public void addProfile(Profile profile) {
        this.profiles.add(profile.getCode());
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return id.equals(people.id) && cpf.equals(people.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cpf);
    }
}
