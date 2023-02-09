package Inheritance_Polymorphism;

public class Car {
    public String model;
    public int speed;

    public Car(String model) {
        this.setModel(model);
    }

    public void accelerate(int seconds) {
        this.setSpeed(this.getSpeed() + 5 * seconds);
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public void getToSixty() {
        this.setSpeed(60);
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
