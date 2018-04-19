package com.library.crudapp.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;


@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "BOOKCOPY")
public class BookCopy {

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "BOOKCOPYID", unique = true)
    private int bookCopyId;

    @Column(name = "BOOK_STATUS")
    private String bookStatus;

    @ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    @JoinColumn(name="BOOKID")
    private Book book;

    public BookCopy(Book book, String bookStatus) {
        this.book  = book ;
        this.bookStatus = bookStatus;
    }
}