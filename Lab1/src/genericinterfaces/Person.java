package genericinterfaces;

public class Person implements Comparable<Person>{
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return String.format("%1$-10s\t%2$d", name, age);
    }

    public int compareTo(Person otherPerson) {
        return this.age - otherPerson.age;
    }
}
