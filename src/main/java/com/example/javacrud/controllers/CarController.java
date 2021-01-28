package com.example.javacrud.controllers;

import com.example.javacrud.models.Car;
import com.example.javacrud.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @GetMapping("/car")
    public String main() {
        return "showCar";
    }

    @GetMapping
    public String showCar(Model model){
        Iterable<Car> cars = carRepository.findAll();
        model.addAttribute("cars", cars);
        return "allCar";
    }
    @PostMapping
    public String add(@RequestParam (value = "vinNumber", required = false) Integer vinNumber,
                      @RequestParam ("brand") String brand,
                      @RequestParam ("modelss") String modelss,
                      Model model){
        Car car = new Car(vinNumber, brand, modelss);
        carRepository.save(car);
        Iterable<Car> cars = carRepository.findAll();
        model.addAttribute("cars", cars);

        return "allCar";
    }

}