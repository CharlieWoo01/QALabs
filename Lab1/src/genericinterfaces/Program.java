package genericinterfaces;

import java.util.ArrayList;
import java.util.Collections;

public class Program {

    public static void main(String args[]) {
        ArrayList<Person> people = new ArrayList<Person>();

        int[] ages = {36, 53, 51, 21, 41, 19};
        String[] names = {"Holland", "Turner", "Powell", "Vicious", "Lyndon", "Spears"};

        for (int i = 0; i < names.length; i++) {
            people.add(new Person(names[i], ages[i]));
        }

        Collections.sort(people);

        Collections.sort(people, new PersonNameComparer());

        displayPeople(people);
    }

    public static void displayPeople(ArrayList<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

/**
 *
 * Implementing Comparable<Person>
 * 8.	If you invoke Collections.sort(people) method in the main() method, you'll get the following exception:
 * Solution.GenericMethods.Person cannot be cast to java.lang.Comparable
 * You get the above error because the system doesn't know how to compare one element of the people with another. To tell the system how to compare two elements, Person class has to implement the Comparable<Person>
 * 9.	Open the Person class and implement the Comparable<Person>  to sort people by age.
 * Tip: Please see the slides if you're not sure how to do this.
 * 10.	Back in the main() method, type Collections.sort(people);
 * to sort people by age.
 * 11.	Write an enhanced for loop to display every person's age and name in 	the people list.
 * Tip: better create a method to display people.
 */