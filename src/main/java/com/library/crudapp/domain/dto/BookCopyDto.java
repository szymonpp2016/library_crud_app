package com.library.crudapp.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BookCopyDto {

    private int renetedId;
    private int bookId;
    private String bookStatus;
}
