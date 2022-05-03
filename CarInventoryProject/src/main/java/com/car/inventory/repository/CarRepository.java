package com.car.inventory.repository;
import org.springframework.data.repository.CrudRepository;

import com.car.inventory.model.Car;
public interface CarRepository extends CrudRepository<Car, Integer>
{
}
