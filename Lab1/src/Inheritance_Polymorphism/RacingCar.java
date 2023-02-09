package Inheritance_Polymorphism;

public class RacingCar extends Car {
    public String driver;
    public int turboFactor;

    public RacingCar(String model, String driver, int turboFactor) {
        super(model);
        this.setDriver(driver);
        this.setTurboFactor(turboFactor);
    }

    public String getDriver() {
        return driver;
    }

    public int getTurboFactor() {
        return turboFactor;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setTurboFactor(int turboFactor) {
        this.turboFactor = turboFactor;
    }

    public void accelerate(int seconds) {
        super.accelerate(seconds);
        this.setSpeed(this.getSpeed() * this.getTurboFactor());
    }
}
