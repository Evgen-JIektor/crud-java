package com.example.javacrud.controllers;

import com.example.javacrud.models.Car;
import com.example.javacrud.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/car")
    public String findAll(Model model) {
        List<Car> cars = carService.findAll();
        model.addAttribute("cars", cars);
        return "allCar";
    }
    @GetMapping("/CarAdd")
    public String AddCarForm(Model model) {
        List<Car> cars = carService.findAll();
        model.addAttribute("cars", cars);
        return "CarAdd";
    }

    @PostMapping("/CarAdd")
    public String AddCar(Car car){
        carService.saveCar(car);
        return "redirect:/car";
    }


}