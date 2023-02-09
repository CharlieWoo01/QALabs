package Inheritance_Polymorphism;

public class Program {

    public static void main(String[] args) {
        Car[] cars = {
                new Car("Car1"),
                new RacingCar("RacingCar1", "Driver1", 2)
        };
        processCars(cars);
    }

    public static void processCars(Car[] cars) {
        for (Car car : cars) {
            car.getToSixty();
            car.accelerate(2);
            System.out.println("Model: " + car.getModel() + " Speed: " + car.getSpeed());
            if (car instanceof RacingCar) {
                RacingCar racingCar = (RacingCar) car;
                System.out.println("Driver: " + racingCar.getDriver());
            }
        }
    }
}
