package abstractclassesinterfaces;

public class Penguin extends Bird{

    /**
     * Construct penguin
     * @param name
     */
    public Penguin(String name) {
        super(name);
    }

    /**
     * Describe taste
     * @return
     */
    public String describeTaste() {
        return getName() + ": " + "Better";
    }

    /**
     * Show main course dish
     * @return
     */
    public String isMainCourseDish() {
        return getName() + ": " + false;
    }
}
