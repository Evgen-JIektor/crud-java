package com.example.javacrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.javacrud.models.Car;

public interface CarRepository extends JpaRepository<Car, Long> {

}
