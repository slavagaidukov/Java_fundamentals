package com.epam.classes_optional;

public class Car {
    private int id;
    private String carMake;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    private String carModel;
    private int yearOfManufacture;
    private String color;
    private int price;
    private int registrationNumber;


    public Car() {
    }

    public Car(int id, String carMake, String carMode, int yearOfManufacture, String color, int price, int registrationNumber) {
        this.id = id;
        this.carMake = carMake;
        this.carModel = carMode;
        this.yearOfManufacture = yearOfManufacture;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public String toString() {
        return id + ". make:" + carMake + ", model:" + carModel + ", year:" + yearOfManufacture + ", color:" + color + ", price:" + price + ", registration number:" + registrationNumber;
    }

}
