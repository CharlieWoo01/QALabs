package genericinterfaces;

public class Person implements Comparable<Person>{
    public String name;
    public int age;

    /**
     * Construct person
     * @param name
     * @param age
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Get name
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * Format the name and ago to left justify and tab
     * @return
     */
    public String toString() {
        return String.format("%1$-10s\t%2$d", name, age);
    }

    /**
     * Compare the ages to each other
     * @param otherPerson the object to be compared.
     * @return
     */
    public int compareTo(Person otherPerson) {
        return this.age - otherPerson.age;
    }
}
