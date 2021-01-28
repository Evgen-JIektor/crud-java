package com.example.javacrud.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.javacrud.models.Car;

public interface CarRepository extends CrudRepository<Car, Long> {

}
