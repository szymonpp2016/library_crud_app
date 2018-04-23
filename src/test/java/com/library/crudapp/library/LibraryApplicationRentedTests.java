package com.library.crudapp.library;

import com.library.crudapp.domain.Book;
import com.library.crudapp.domain.BookCopy;
import com.library.crudapp.domain.Rented;
import com.library.crudapp.domain.User;
import com.library.crudapp.repositoryDao.RentedDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;
import java.util.Date;
import java.util.Optional;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class LibraryApplicationRentedTests {
/*
    private static final String STATUS_RENTED="RENTED";
    private static final String  STATUS_AVAILABLE="AVAILABLE";
    public static final String STATUS_DAMAGED = "DAMAGED";
    public static final String STATUS_LOST = "LOST";

    @Autowired
    private RentedDao rentedDao;

    @Test
    public void testBookCopyRented() {

        //Given
        User user1 =new User("Jan","Nowak","2017-11-11");
        Book book1 =  new Book("aaaaa","aaaaa",2017);

        BookCopy bookcopy1 = new BookCopy(book1,STATUS_RENTED);
        Rented rented = new Rented(new Date(1 / 2015),new Date(2 / 2015),user1,bookcopy1);

        //When
        rentedDao.save(rented);

        //Then
        int id = rented.getRenetedId();
        Optional<Rented> readRented = rentedDao.findByRenetedId(id);
        assertEquals(id, readRented.get().getRenetedId());
        assertEquals(STATUS_RENTED, readRented.get().getBookCopy().getBookStatus());

        //CleanUp
        rentedDao.delete(rented);
    }

    @Test
    public void testBookCopyRurTUn() {

        //Given
        User user1 =new User("Jan","Nowak","2017-11-11");
        Book book1 =  new Book("aaaaa","aaaaa",2017);

        BookCopy bookCopy1 = new BookCopy(book1,STATUS_RENTED);
        Rented rented = new Rented(new Date(1 / 2015),new Date(2 / 2015),user1,bookCopy1);
        rentedDao.save(rented);

        //When
        bookCopy1.setBookStatus(STATUS_AVAILABLE);

        //Then
        int id = rented.getRenetedId();
        Optional<Rented> readRented = rentedDao.findByRenetedId(id);
        assertEquals(id, readRented.get().getRenetedId());
        assertEquals(STATUS_AVAILABLE, bookCopy1.getBookStatus());

        //CleanUp
        rentedDao.delete(rented);
    } */
}
