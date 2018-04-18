package com.library.crudapp.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
@AllArgsConstructor
public class UserDto {

    private int userId;
    private String firstName;
    private String lastName;
    private String registartionDate;
}
