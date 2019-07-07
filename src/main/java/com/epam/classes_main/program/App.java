package com.epam.classes_main.program;

import java.io.*;

public class App {
    public static void main(String[] args) {
        try (
                FileReader reader = new FileReader("data")) {
            int c;
            while ((c = reader.read()) != -1) {

                System.out.print((char) c);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }



        /*Car car1 = new Sedan(1, "Skoda Rapid", 5.0, 12000, 200);
        Car car2 = new Minivan(2, "Volkswagen Caddy", 7.0, 30000, 180);
        ArrayList<Car> garage = new ArrayList<>();
        garage.add(car1);
        garage.add(car2);
        TaxiPark taxiPark = new TaxiPark(garage);
        taxiPark.garagePriceCalculation();
        taxiPark.carSortByFuel();
        taxiPark.choiceOfCarBySpeed();
   */
    }
}
