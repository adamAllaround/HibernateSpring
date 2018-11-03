package com.allaroundjava.dao;

import com.allaroundjava.model.Car;

import java.util.Optional;

interface CarDao {
    Optional<Car> getById(Long id);

    Long persist(Car c);
}
