package com.library.crudapp.repositoryDao;

import com.library.crudapp.domain.User;
import com.library.crudapp.domain.dto.UserDto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface UserDao extends CrudRepository<User, Integer> {
    @Override
    User save(User user);

    //@Override
    Optional<User> findByUserId(int id);

    @Override
    void delete(User user);

    //@Override
    Optional<User> findByFirstName(String userFirstName);

    //@Override
    User findOneByUserId(int id);

    @Override
    List<User> findAll();

    //@Override
    void deleteByUserId(int userId);
}
