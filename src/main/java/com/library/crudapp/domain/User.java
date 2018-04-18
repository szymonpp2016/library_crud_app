package com.library.crudapp.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "USERID", unique = true)
    private int userId;

    @Column(name = "FIRSTNAME")
    private String firstName;

    @Column(name = "LASTNAME")
    private String lastName;

    @Column(name = "REGISTRATION_DATE")
    private String registartionDate;

    public User(String firstName, String lastName, String registartionDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registartionDate = registartionDate;
    }
}
