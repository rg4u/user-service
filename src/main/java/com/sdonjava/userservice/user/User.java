package com.sdonjava.userservice.user;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
public class User {

    @Id
    @GeneratedValue
    @Column(nullable = false)
    private Long id;
    @NotEmpty(message = "First Name can't be empty")
    @Column(nullable = false)
    @Basic(optional = false)
    private String firstName;
    @NotEmpty(message = "Sur Name can't be empty")
    @Column(nullable = false)
    @Basic(optional = false)
    private String surName;
    @NotEmpty(message = "Email can't be empty")
    @Email(message = "Email should be valid")
    @Column(nullable = false)
    @Basic(optional = false)
    private String email;


    public User() {

    }

    public User(Long id, String firstName, String surName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.surName = surName;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
