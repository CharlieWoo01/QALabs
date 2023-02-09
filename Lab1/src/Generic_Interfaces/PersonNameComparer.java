package Generic_Interfaces;

import java.util.Comparator;

public class PersonNameComparer implements Comparator<Person> {

    /**
     * Compare names to each other
     * @param p1 the first object to be compared.
     * @param p2 the second object to be compared.
     * @return
     */
    public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }
}
