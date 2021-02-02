package com.example.javacrud.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer vinNumber;
    private String brand;
    private String models;
    private String color;
    private Integer countDoor;

    public Car(Long id, Integer vinNumber, String brand, String models, String color, Integer countDoor) {
        this.id = id;
        this.vinNumber = vinNumber;
        this.brand = brand;
        this.models = models;
        this.color = color;
        this.countDoor = countDoor;
    }

    public Car(Integer vinNumber, String brand, String models, String color, Integer countDoor) {
        this.vinNumber = vinNumber;
        this.brand = brand;
        this.models = models;
        this.color = color;
        this.countDoor = countDoor;
    }

    public Car(Integer vinNumber, String brand, String models) {
        this.brand = brand;
        this.models = models;
        this.vinNumber = vinNumber;
    }

    public Car() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModels() {
        return models;
    }

    public void setModels(String models) {
        this.models = models;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getCountDoor() {
        return countDoor;
    }

    public void setCountDoor(Integer countDoor) {
        this.countDoor = countDoor;
    }

    public Integer getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(Integer vinNumber) {
        this.vinNumber = vinNumber;
    }
}
