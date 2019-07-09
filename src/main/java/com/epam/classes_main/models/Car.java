package com.epam.classes_main.models;

public class Car {
    private int id;  // id number of the car

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public int getPrice() {
        return price;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    private String model;
    private double fuelConsumption;
    private int price;
    private int maxSpeed;


    public Car(int id, String model, double fuelConsumption, int price, int maxSpeed) {
        this.id = id;
        this.model = model;
        this.fuelConsumption = fuelConsumption;
        this.price = price;
        this.maxSpeed = maxSpeed;
    }
    // Output of the information about the car
    public void getInformation() {
        System.out.println(getId() + " " + getModel() + " " + getFuelConsumption() + " " + getPrice() + " " + getMaxSpeed());
    }
}
