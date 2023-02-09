package File_Workings;

import java.io.*;
import java.util.Arrays;

public class Program {
    private static String[] readCSV(String inFile) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inFile));
            String line = reader.readLine();
            return (line != null) ? line.split(",") : new String[]{"Error"};
        } catch (IOException e) {
            return new String[]{"Error"};
        }
    }

    public static void main(String[] args) throws Exception {
        String[] courses = readCSV("Lab1/src/File_Resources/course.txt");
        if (courses.length == 1 && courses[0].equals("Error")) {
            System.out.println("Error reading file course.txt");
            return;
        }
        String[] trainers = readCSV("Lab1/src/File_Resources/trainer.txt");
        if (trainers.length == 1 && trainers[0].equals("Error")) {
            System.out.println("Error reading file trainer.txt");
            return;
        }
        String[] trainerCourses = readCSV("Lab1/src/File_Resources/trainerCourse.txt");
        if (trainerCourses.length == 1 && trainerCourses[0].equals("Error")) {
            System.out.println("Error reading file trainerCourse.txt");
            return;
        }

        for (String trainerCourse : trainerCourses) {
            String[] parts = trainerCourse.split(",");
            File file = new File("Lab1/src/File_Resources/trainersAndCourses.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(Arrays.toString(courses));
            writer.newLine();
            writer.write(Arrays.toString(trainers));
            writer.close();
        }
    }

}
