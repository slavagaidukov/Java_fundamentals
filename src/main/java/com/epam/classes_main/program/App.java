package com.epam.classes_main.program;

import com.epam.classes_main.models.Car;
import com.epam.classes_main.models.Minivan;
import com.epam.classes_main.models.Sedan;

import java.io.*;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
      /*  try (
                FileReader reader = new FileReader("data")) {
            int c;
            while ((c = reader.read()) != -1) {

                System.out.print((char) c);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
*/

        // Adding auto
        Car car1 = new Sedan(1, "Skoda Rapid", 5.0, 12000, 200);
        Car car2 = new Minivan(2, "Volkswagen Caddy", 7.0, 30000, 180);
        ArrayList<Car> garage = new ArrayList<>();
        garage.add(car1);
        garage.add(car2);
        // Creating a garage
        Sedan.TaxiPark taxiPark = new Sedan.TaxiPark(garage);
        // The method calculates the price of the garage
        taxiPark.garagePriceCalculation();
        // The method sortes and outputs information about cars by fuel value
        taxiPark.carSortByFuel();
        // The method outputs group of cars that match to the range which was entered by user
        taxiPark.choiceOfCarBySpeed();

    }
}
