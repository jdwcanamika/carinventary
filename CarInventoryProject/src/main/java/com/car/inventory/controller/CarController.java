package com.car.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.car.inventory.model.Car;
import com.car.inventory.service.CarService;

//creating RestController
@RestController
public class CarController {
//autowired the carservice class
	@Autowired
	CarService carService;

//creating a get mapping that retrieves all the cars detail from the database 
	@GetMapping("/cars")
	private List<Car> getAllCars() {
		return carService.getAllCars();
	}

//creating a get mapping that retrieves the detail of a specific student
	@GetMapping("/car/{id}")
	private Car getCar(@PathVariable("id") int id) {
		return carService.getCarById(id);
	}

//creating a delete mapping that deletes a specific student
	@DeleteMapping("/car/{id}")
	private void deleteCar(@PathVariable("id") int id) {
		carService.delete(id);
	}

//creating post mapping that post the student detail in the database
	@PostMapping("/car")
	private int saveCar(@RequestBody Car car) {
		carService.saveOrUpdate(car);
		return car.getId();
	}
}
