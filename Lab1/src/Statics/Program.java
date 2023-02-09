package Statics;

import java.util.ArrayList;
import java.util.Random;

public class Program {

    public static Vehicle vehicle;

    public static void main(String args[]) {
        ArrayList<Vehicle> vehicleArray = new ArrayList<Vehicle>();

        /**
         * Loop through however many times to generate cars and their random properties
         */
        for (int i = 0; i < 3; i++) {
            vehicleArray.add(new Vehicle(0, i + 1));
        }

        /**
         * Loop through the vehicles to get their details
         */
        for (Vehicle v : vehicleArray) {
            System.out.println(v.getDetails());
        }

        /**
         * Formatting and print the number of vehicles which has been created
         */
        System.out.println();
        System.out.println("Number of Vehicles created: " + Vehicle.getCount());
        System.out.println();


        /**
         * Loop through the vehicles and change the speed/distance until 1000 is met for the distance then determine the winner and end.
         */
        Random rand = new Random();
        while (true) {
            boolean winner = false;
            for (Vehicle v : vehicleArray) {
                int randomSpeed = rand.nextInt(10) + 1;
                v.accelerate(randomSpeed);
                System.out.println(v.getDetails());
                if (v.getDistanceTravelled() >= 1000) {
                    System.out.println(v.getRegistrationPlate() + " Wins.");
                    winner = true;
                    break;
                }
            }
            if (winner) {
                break;
            }
        }
    }

        //System.out.println(vehicle.getCount());

    }