package com.epam.classes_main.models;

import com.epam.classes_main.scan.Scan;

import java.util.ArrayList;
import java.util.Comparator;

public class TaxiPark {
    private ArrayList<Car> garage;

    public TaxiPark(ArrayList garage) {
        this.garage = garage;
    }


    public void carSortByFuel() {
        System.out.println("The taxipark is sorted by fuel consumption");
        garage.sort(Comparator.comparing(Car::getFuelConsumption));
        for (Car car : garage) {
            car.getInformation();
        }
    }

    // User inputs the value of the maximal and minimal speed. The method shows all the cars which values match with users.
    public void choiceOfCarBySpeed() {
        Scan scanOfTaxiPark = new Scan();
        boolean flagOfSpeedRange = false;
        while (!flagOfSpeedRange) {
            int minSpeedRange = scanOfTaxiPark.scanOfSpeed("minimal");
            int maxSpeedRange = scanOfTaxiPark.scanOfSpeed("maximal");
            if (minSpeedRange < maxSpeedRange) {
                System.out.println("These cars match with your range:");
                for (Car car : garage) {
                    if (car.getMaxSpeed() >= minSpeedRange && car.getMaxSpeed() <= maxSpeedRange) {
                        car.getInformation();
                    }
                    flagOfSpeedRange = true;
                }
            } else {
                System.out.println("Invalid input. Please try once again");
            }
        }
    }

    public void garagePriceCalculation() {
        int sumOfPrices = 0;
        for (Car car : garage) {
            sumOfPrices = sumOfPrices + car.getPrice();
        }
        System.out.println("The price of Taxipark is " + sumOfPrices);
    }
}

