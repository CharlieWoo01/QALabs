package statics;

import java.util.ArrayList;

public class RegistrationPlateFactory {
    private static ArrayList<String> usedRegPlates = new ArrayList<>();
    private static String[] regPlates = {"MRB1G", "RU16", "TOYS4US", "HNZ57", "PUT3", "JB007"};

    /**
     * Loop through the registration plate array list and get the plate, if at end then return null.
     * @return
     * @throws IllegalArgumentException
     */
    public static RegistrationPlate getNextRegistrationPlate() throws IllegalArgumentException {
        for (String regPlate : regPlates) {
            if (!usedRegPlates.contains(regPlate)) {
                usedRegPlates.add(regPlate);
                return new RegistrationPlate(regPlate);
            }
        }
        throw new IllegalArgumentException("The limit of cars for registration plates has been reached. ");
    }
}
