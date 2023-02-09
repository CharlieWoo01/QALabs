package genericinterfaces;

import java.util.ArrayList;
import java.util.Collections;

public class Program {

    public static void main(String args[]) {
        ArrayList<Person> people = new ArrayList<Person>();

        /**
         * Store the ages and names in array
         */
        int[] ages = {36, 53, 51, 21, 41, 19};
        String[] names = {"Holland", "Turner", "Powell", "Vicious", "Lyndon", "Spears"};

        /**
         * Iterate through the names and lengths
         */
        for (int i = 0; i < names.length; i++) {
            people.add(new Person(names[i], ages[i]));
        }

        /**
         * Sort people for their age
         */
        Collections.sort(people);

        /**
         * Sort people for their name
         */
        Collections.sort(people, new PersonNameComparer());

        /**
         * Call display method
         */
        displayPeople(people);
    }

    /**
     * Method to iterate through and display people
     * @param people
     */
    public static void displayPeople(ArrayList<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }
}