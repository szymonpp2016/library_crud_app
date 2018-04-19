package com.library.crudapp.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
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
