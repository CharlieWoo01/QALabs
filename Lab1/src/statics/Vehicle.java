package statics;

public class Vehicle {
    private int speed;
    private int lane;
    private int distanceTravelled;
    private RegistrationPlate registrationPlate;

    static int numberOfCars = 0;

    /**
     * Count number of cars when instance is called.
     */
    {
        numberOfCars += 1;
    }

    /**
     * Vehicle constructor with exception handling if there are no registration plates left and exit the program if so
     * @param speed
     * @param lane
     */
    public Vehicle(int speed, int lane) {
        this.speed = speed;
        this.lane = lane;
        this.distanceTravelled = 0;
        try {
            this.registrationPlate = RegistrationPlateFactory.getNextRegistrationPlate();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            System.exit(0);
            this.registrationPlate = null;
        }
    }

    /**
     * Accelerate method
     * @param amount
     */
    public void accelerate(int amount) {
        this.speed += amount;
        this.distanceTravelled += this.speed;
    }

    /**
     * Brake method
     * @param amount
     */
    public void brake(int amount) {
        this.speed -= amount;
    }

    /**
     * Get the count as a string
     * @return
     */
    public static int getCount() {
        return numberOfCars;
    }

    /**
     * Get the distance travelled
     * @return
     */
    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    /**
     * Get the registration plate as string and handle if not found (Just some extra protection if for whatever reason jumps past the exception)
     * @return
     */
    public String getRegistrationPlate() {
        return (registrationPlate == null) ? "NOT FOUND" : registrationPlate.getRegistrationPlate();
    }

    /**
     * Get the details as a string
     * @return
     */
    public String getDetails() {
        return "Speed: " + speed + " Lane: " + lane + " Distance Travelled: " + distanceTravelled + " Registration Plate: " + getRegistrationPlate();
    }
}
