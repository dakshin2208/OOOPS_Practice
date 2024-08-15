package Teams.day5;

import java.util.Scanner;

public class Car {
    String make;
    String model;
    int year;
    double price;

    public Car(String make , String model , int year , double price){
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public static Car user(Scanner in){
        System.out.println("enter the car to make:");
        String make = in.nextLine();

        System.out.println("enter the car model:");
        String model = in.nextLine();

        System.out.println("enter the year:");
        int year = in.nextInt();

        System.out.println("enter the price:");
        double price = in.nextDouble();

        in.nextLine();

        return new Car(make,model,year,price);
    }

    public void display(){
        System.out.println("Make :" + make);
        System.out.println("Model :" + model);
        System.out.println("year :" + year);
        System.out.println("price :" + price);
    }
}
