package abstractclassesinterfaces;

public class Fish extends Animal implements Consumable, Insurable{

    public String name;

    /**
     * Construct the fish
     * @param name
     */
    public Fish(String name) {
        super(AnimalType.Fish);
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
     * Describe taste
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

    /**
     * Get premium
     * @return
     */
    public String getPremium() {
        return getName() + ":" + "Some other premium";
    }

    /**
     * Get expire
     * @return
     */
    public String expires() {
        return getName() + ":" + "Not found";
    }
}
