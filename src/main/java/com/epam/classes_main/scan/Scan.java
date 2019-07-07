package com.epam.classes_main.scan;

import java.util.Scanner;

public class Scan {
    // The request of the arguments of speed
    public int scanOfSpeed(String minOrMaxSpeed) {
        boolean flagOfScan = false;
        int speed = 0;
        while (!flagOfScan) {
            System.out.println("Please, input " + minOrMaxSpeed + " speed of your range");
            Scanner scanOfInt = new Scanner(System.in);
            try {
                speed = scanOfInt.nextInt();
                flagOfScan = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid error. Please try once again");
            }
        }
        return speed;
    }
}
