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
@Table(name = "RENTED")
public class Rented {

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "RENTEDID", unique = true)
    private int renetedId;

    @Column(name = "RENTED_DATE")
    private Date rentedDate;

    @Column(name = "RETURN_DATE")
    private Date returnDate;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="USERID")
    private User user;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "BOOKCOPYID")
    private BookCopy bookCopy;

    public Rented(Date rentedDate, Date returnDate, User user, BookCopy bookCopy) {
        this.rentedDate = rentedDate;
        this.returnDate = returnDate;
        this.user = user;
        this.bookCopy = bookCopy;
    }
}
