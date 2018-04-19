package com.library.crudapp.repositoryDao;

import com.library.crudapp.domain.Rented;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;

@Transactional
@Repository
public interface RentedDao extends CrudRepository<Rented, Integer> {
    @Override
    Rented save(Rented rented);

    Optional<Rented> findByRenetedId(int id);

    @Override
    void delete(Rented rented);

}

