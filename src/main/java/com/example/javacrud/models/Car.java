package com.example.javacrud.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer vinNumber;
    private String brand;
    private String modelss;
    private String color;
    private Integer countDoor;

    public Car(Long id, Integer vinNumber, String brand, String modelss, String color, Integer countDoor) {
        this.id = id;
        this.vinNumber = vinNumber;
        this.brand = brand;
        this.modelss = modelss;
        this.color = color;
        this.countDoor = countDoor;
    }



    public Car(Integer vinNumber, String brand, String modelss) {
        this.brand = brand;
        this.modelss = modelss;
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

    public String getModelss() {
        return modelss;
    }

    public void setModelss(String modelss) {
        this.modelss = modelss;
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
