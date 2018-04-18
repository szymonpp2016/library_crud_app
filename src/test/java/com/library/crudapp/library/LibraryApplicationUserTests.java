package com.library.crudapp.library;

import com.library.crudapp.domain.User;
import com.library.crudapp.repositoryDao.UserDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LibraryApplicationUserTests {

    @Autowired
    private UserDao userDao;

    @Test
    public void testBookAdd() {
        //Given
        User user = new User("aaaaa","aaaaa","2017-11-11");

        //When
        userDao.save(user);

        //Then
        int id = user.getUserId();
        Optional<User> readUser = userDao.findByUserId(id);
        Assert.assertEquals(id, readUser.get().getUserId());

        //CleanUp
        userDao.delete(user);
    }

}