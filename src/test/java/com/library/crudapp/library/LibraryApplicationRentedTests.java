package com.library.crudapp.library;

import com.library.crudapp.domain.Book;
import com.library.crudapp.domain.BookCopy;
import com.library.crudapp.domain.Rented;
import com.library.crudapp.domain.User;
import com.library.crudapp.repositoryDao.BookCopyDao;
import com.library.crudapp.repositoryDao.RentedDao;
import com.library.crudapp.repositoryDao.UserDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;
import java.util.Date;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LibraryApplicationRentedTests {


    @Autowired
    private RentedDao rentedDao;


    @Test
    public void testBookCopyAdd() {
        //Given
        User user1 =new User("Jan","Nowak","2017-11-11");
        Book book1 =  new Book("aaaaa","aaaaa",2017);
        BookCopy bookcopy1 = new BookCopy(book1,"rented");
        Rented rented = new Rented(new Date(1 / 2015),new Date(1 / 2015),user1,bookcopy1);

        //When
        rentedDao.save(rented);

        //Then
        int id = rented.getRenetedId();
        Optional<Rented> readRented = rentedDao.findByRenetedId(id);
        assertEquals(id, readRented.get().getRenetedId());

        //CleanUp
       rentedDao.delete(rented);

    }
}