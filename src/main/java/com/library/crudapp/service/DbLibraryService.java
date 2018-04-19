package com.library.crudapp.service;

import com.library.crudapp.domain.User;
import com.library.crudapp.domain.dto.UserDto;
import com.library.crudapp.repositoryDao.UserDao;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Service
public class DbLibraryService {

    @Autowired
    private UserDao userDao;

    public List<User> getAllTasks()
    {
        return  userDao.findAll();
    }

    public User getUserById(final int userId) {
        return userDao.findOneByUserId(userId);
    }

    public User saveUser(final User user) {
        return userDao.save(user);
    }


    public Optional<User> get(final int userId) {
        return userDao.findById(userId);
    }

    public void deleteUser(User user) {
        userDao.delete(user);
    }

}
