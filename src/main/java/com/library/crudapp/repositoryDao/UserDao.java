package com.library.crudapp.repositoryDao;

import com.library.crudapp.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;

@Transactional
@Repository
public interface UserDao extends CrudRepository<User, Integer> {
    @Override
    User save(User user);

    Optional<User> findByUserId(int id);

    @Override
    void delete(User user);

    Optional<User> findByFirstName(String userFirstName);
}
