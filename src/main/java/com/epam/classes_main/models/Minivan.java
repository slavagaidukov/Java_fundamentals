package com.epam.classes_main.models;

public class Minivan extends Car {
    public int getSeats() {
        return seats;
    }

    private int seats; // amount of seats that passengers can use

    public Minivan(int id, String model, double fuelConsumption, int price, int maxSpeed) {
        super(id, model, fuelConsumption, price, maxSpeed);
        this.seats = 6;
    }

    public void getInformation() {
        System.out.println(getId() + " " + getModel() + " " + getFuelConsumption()
                + " " + getPrice() + " " + getMaxSpeed() + " " + seats);
    }

}
