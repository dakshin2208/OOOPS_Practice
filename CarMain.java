package Teams.day5;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter the car to make:");
        String makes = in.nextLine();

        System.out.println("enter the car model:");
        String model = in.nextLine();

        System.out.println("enter the year:");
        int year = in.nextInt();

        System.out.println("enter the price:");
        double price = in.nextDouble();

        in.nextLine();

        Car car = new Car(makes,model,year,price);


        System.out.println("details:");

        car.display();

        }
    }

