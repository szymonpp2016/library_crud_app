package com.library.crudapp.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
public class RentedDto {

    private int renetedId;
    private String copyBookId;
    private String userId;
    private Date rentedDate;
    private Date returnDate;
}
