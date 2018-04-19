package com.library.crudapp.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BookDto {

    private int bookId;
    private String title;
    private String author;
    private int yearOfPublication;

}