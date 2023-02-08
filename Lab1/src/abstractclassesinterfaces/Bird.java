package abstractclassesinterfaces;

public abstract class Bird extends Animal implements Consumable{
    public String name;

    /**
     * Construct the bird
     * @param name
     */
    public Bird(String name) {
        super(AnimalType.Bird);
        this.name = name;
    }

    /**
     * Get name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Describe the taste
     * @return
     */
    public String describeTaste() {
        return getName() + ": " + "Delicate";
    }

    /**
     * Show main course dish
     * @return
     */
    public String isMainCourseDish() {
        return getName() + ": " + true;
    }

}
