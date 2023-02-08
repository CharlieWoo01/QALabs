package abstractclassesinterfaces;

public class Duck extends Bird implements Insurable {

    /**
     * Construct the duck
     * @param name
     */
    public Duck(String name) {
        super(name);
    }

    /**
     * Describe taste
     * @return
     */
    public String describeTaste() {
        return getName() + ": " + "Awful";
    }

    /**
     * Show main course dish
     * @return
     */
    public String isMainCourseDish() {
        return getName() + ": " + false;
    }

    /**
     * Get premium
     * @return
     */
    public String getPremium() {
        return getName() + ":" + "Some premium";
    }

    /**
     * Get expiry
     * @return
     */
    public String expires() {
        return getName() + ":" + "No clue";
    }
}
