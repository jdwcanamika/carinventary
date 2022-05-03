package com.car.inventory.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.car.inventory.model.Car;
import com.car.inventory.repository.CarRepository;

//defining the business logic
@Service
public class CarService {
	@Autowired
	CarRepository carRepo;

//getting all car records
	public List<Car> getAllCars() {
		List<Car> cars = new ArrayList<Car>();
		carRepo.findAll().forEach(car -> cars.add(car));
		return cars;
	}

//getting a specific record
	public Car getCarById(int id) {
		return carRepo.findById(id).get();
	}

	public void saveOrUpdate(Car car) {
		carRepo.save(car);
	}

//deleting a specific record
	public void delete(int id) {
		carRepo.deleteById(id);
	}
}