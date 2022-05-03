package com.car.inventory;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.car.inventory.model.Car;
import com.car.inventory.repository.CarRepository;

@SpringBootTest
class CarInventoryApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private CarRepository carRepository;

	@Test
	@DisplayName("Create Car Test ")
	void createCarsTest() {

		Car created = carRepository.save(getCars());

		assertTrue(created != null);
	}

	private Car getCars() {
		Car cars = new Car();
		cars.setId(101);
		cars.setMake("Sterling Truck");
		cars.setModel("CONDOR");
		cars.setColour("Grey");
		cars.setPrice(1000.00);
		cars.setVin("5TDZK3EH0AS022676");
		cars.setDealership("New Dealership");

		return cars;
	}
	
	@Test
	@DisplayName("Create Car Test ")
	void findAllCarsTest() {
        Car cars=carRepository.save(getCars() );
		List<Car> created = (List<Car>) carRepository.findAll();
		assertTrue(created != null);
	}
	
	@Test
	@DisplayName("Create FindByID Test ")
	void getCarByIdTest(){
		Car cars=carRepository.save(getCars() );
		Optional<Car> created = carRepository.findById(101);
		assertTrue(created != null);
		
	}

	


	
}
