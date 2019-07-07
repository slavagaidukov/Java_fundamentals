package com.epam.classes_optional;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(1, "Skoda", "Rapid", 2018, "white", 10000, 10001);
        Car car2 = new Car(2, "Skoda", "Rapid", 2017, "black", 11000, 10002);
        Car car3 = new Car(3, "Volkswagen", "Polo", 2017, "white", 12000, 10003);
        Car car4 = new Car(4, "Volkswagen", "Polo", 2016, "green", 13000, 10004);
        Car car5 = new Car(5, "Renault", "Logan", 2015, "white", 8000, 10005);
        Car car6 = new Car(6, "Renault", "Logan", 2017, "blue", 9000, 10006);
        Car car7 = new Car(7, "Kia", "Rio", 2018, "yellow", 14000, 10007);
        Car car8 = new Car(8, "Kia", "Rio", 2019, "black", 15000, 10008);
        Car car9 = new Car(9, "Hyundai", "Solaris", 2014, "grey", 8000, 10009);
        Car car10 = new Car(10, "Hyundai", "Solaris", 2018, "black", 14000, 10010);
        Car[] carArr = {car1, car2, car3, car4, car5, car6, car7, car8, car9, car10};
        chooseCarMake(carArr, "Skoda");
        chooseCarMakeWithYear(carArr, "Hyundai", 2);
        chooseCarWithYearAndPrice(carArr, 2018, 11000);
    }

    public static void chooseCarMake(Car[] carArr, String carMake) {
        for (int i = 0; i < carArr.length; i++) {
            if (carArr[i].getCarMake().equals(carMake)) {
                System.out.println(carArr[i]);
            }
        }
        System.out.println();
    }

    public static void chooseCarMakeWithYear(Car[] carArr, String carMake, int yearsOfExpluatation) {
        for (int i = 0; i < carArr.length; i++) {
            if (carArr[i].getCarMake().equals(carMake)
                    && carArr[i].getYearOfManufacture() < 2019 - yearsOfExpluatation) {
                System.out.println(carArr[i]);
            }
        }
        System.out.println();
    }

    public static void chooseCarWithYearAndPrice(Car[] carArr, int year, int price) {
        for (int i = 0; i < carArr.length; i++) {
            if (carArr[i].getYearOfManufacture() == year && carArr[i].getPrice() > price) {
                System.out.println(carArr[i]);
            }
        }
    }
}

