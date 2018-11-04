package com.allaroundjava.dao;

import com.allaroundjava.model.Car;

import java.util.Optional;

public interface CarDao {
    Optional<Car> getById(Long id);

    Long persist(Car c);
}
