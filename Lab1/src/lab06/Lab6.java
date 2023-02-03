package lab06;

import lab05.Lab5;
import lab03.part1;

import java.util.*;

public class Lab6 {

    // Global variable to call in grade service.
    public Lab5 lab5;

    // Global variable to call in service to get string
    public part1 lab3;

    public static Lab6 map = new Lab6();

    // Add global variable of to create the bank treemap.
    public static TreeMap<String, String> mapValues = new TreeMap<>();

    // Global variable to build the tree map of the bank accounts.
    public static Map mappingData = map.createGradesTable();

    // Method to automatically add some default data to the tree map.
    public static Map createGradesTable() {
        // Add records to hash table
        mapValues.put("Charlie", "Fail");
        mapValues.put("Dave", "Distinction");
        mapValues.put("John", "Pass");
        mapValues.put("SomeMan", "Fail");
        mapValues.put("Jerry", "Merit");
        return mapValues;
    }

    public static void loopAllGrades()
    {
        Iterator<Map.Entry<String, Integer>> iterator = mappingData.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Name: " + entry.getKey() + ", Grade: " + entry.getValue());
        }
    }

    public void part1() {

        int nameDataLength = mappingData.size();
        for (int i = nameDataLength; i < nameDataLength + 1; i++) {
            int gradeInput = lab5.getInt("Please enter your grade: ");
            mapValues.put(lab3.getString("Please enter a name: "), lab5.getGradeCalculation(gradeInput));
        }

        loopAllGrades();
    }
}
