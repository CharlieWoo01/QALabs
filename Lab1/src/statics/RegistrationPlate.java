package statics;

public class RegistrationPlate {
    private final String registrationPlate;

    /**
     * Registration plate constructor
     * @param registrationPlate
     */
    public RegistrationPlate(String registrationPlate) {
        this.registrationPlate = registrationPlate;
    }

    /**
     * Get the registration plate as string
     * @return
     */
    public String getRegistrationPlate() {
        return registrationPlate;
    }
}
