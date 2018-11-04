package com.allaroundjava.container.dao;

import com.allaroundjava.dao.CarDao;
import com.allaroundjava.model.Car;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Optional;

@Repository
@Transactional
public class ContainerManagedCarDaoImpl implements CarDao {

    @PersistenceContext
    private EntityManager entityManager;

    public Optional<Car> getById(Long id) {
        Car car = entityManager.find(Car.class, id);
        return Optional.ofNullable(car);
    }

    public Long persist(Car c) {
        entityManager.persist(c);
        return c.getId();
    }
}
