package com.springlearning.frenchlearning.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Users {

    private String fname;
    private String lname;

    @Id
    private String email;
    private String password;
}
