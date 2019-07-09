package com.epam.classes_main.models;


public class Sedan extends Car {
    public int getSeats() {
        return seats;
    }

    private int seats; // amount of seats that passengers can use

    public Sedan(int id, String model, double fuelConsumption, int price, int maxSpeed) {
        super(id, model, fuelConsumption, price, maxSpeed);
        this.seats = 4;
    }

    public void getInformation() {
        System.out.println(getId() + " " + getModel() + " " + getFuelConsumption()
                + " " + getPrice() + " " + getMaxSpeed() + " " + seats);
    }

}
