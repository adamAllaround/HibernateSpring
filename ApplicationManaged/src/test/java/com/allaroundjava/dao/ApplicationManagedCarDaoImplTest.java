package com.allaroundjava.dao;

import com.allaroundjava.config.AppConfig;
import com.allaroundjava.model.Car;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.LocalDate;
import java.util.Optional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class ApplicationManagedCarDaoImplTest {

    @Autowired
    private CarDao carDao;

    @Before
    public void setUp() {
    }

    @Test
    public void whenPersist_ThenReachOutToDb() {
        Car car = new Car();
        car.setMake("Mini");
        car.setModel("Cooper S");
        car.setManufacturedAt(LocalDate.now());

        carDao.persist(car);
    }

    @Test
    public void whenPersist_thenFetchFromDb() {
        Car car = new Car();
        car.setMake("Mini");
        car.setModel("Cooper S");
        car.setManufacturedAt(LocalDate.now());

        carDao.persist(car);

        Optional<Car> carFetched = carDao.getById(car.getId());
        Assert.assertTrue(carFetched.isPresent());

    }

    @Test
    public void whenFetchwrongObjectThenFail() {
        Car car = new Car();
        car.setMake("Mini");
        car.setModel("Cooper S");
        car.setManufacturedAt(LocalDate.now());

        carDao.persist(car);

        Optional<Car> carFetched = carDao.getById(789L);
        Assert.assertFalse(carFetched.isPresent());

    }

}