package com.car.inventory.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Represents a car which is located in a car dealership
 * 
 * @author Anamika kumari
 * @version 1.0
 */

@Entity
@Table(name= "Car")
public class Car implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column
	private int id;
	@Column
	private String make;
	@Column
	private String model;
	@Column
	private String colour;
	@Column
	private double price;
	@Column
	private String vin;
	@Column
	private String dealership;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getDealership() {
		return dealership;
	}

	public void setDealership(String dealership) {
		this.dealership = dealership;
	}

	public String getNewDealership() {
		return newDealership;
	}

	public void setNewDealership(String newDealership) {
		this.newDealership = newDealership;
	}

	public String[] getDealerships() {
		return dealerships;
	}

	public void setDealerships(String[] dealerships) {
		this.dealerships = dealerships;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	// To use for moving car from one dealership to another
	private String newDealership;

	// Dealership names
	private String[] dealerships = { "Deals_on_Wheels", "Steals_and_Deals", "Rhyme_and_Crime" };
}