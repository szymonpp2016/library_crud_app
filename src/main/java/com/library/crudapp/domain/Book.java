package com.library.crudapp.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "BOOK")
public class Book {

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "BOOKID", unique = true)
    int bookId;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "AUTHOR")
    private String author;

    @Column(name = "YEAR_OF_PUBLICATION")
    private int yearOfPublication;


    @OneToMany   (targetEntity = BookCopy.class,
            mappedBy = "book",
            cascade = CascadeType.ALL,
            fetch=FetchType.EAGER)
    private List<Book> readBook;

    public Book(String title, String author, int yearOfPublication) {
        this.title=title;
        this.author=author;
        this.yearOfPublication = yearOfPublication;
    }


}