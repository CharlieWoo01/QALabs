package lab12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Program3 {

    /**
     * Try reading the CSV file and convert it into an array. If there's an error return error as the array.
     * @param inFile
     * @return String[]
     * @throws IOException
     */
    private static String[] readCSV(String inFile) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(inFile))) {
            String line;
            String[] lines = new String[0];
            while ((line = reader.readLine()) != null) {
                String[] newLines = Arrays.copyOf(lines, lines.length + 1);
                newLines[newLines.length - 1] = line;
                lines = newLines;
            }
            return lines;
        } catch (IOException e) {
            return new String[]{"Error"};
        }
    }

    /**
     * Format the CSV array using split
     * @param inFile
     * @return
     */
    private static String[] formatCsv(String[] inFile) {
        String[] formatArray = new String[inFile.length - 1];
        for (String file : inFile) {
            formatArray = file.split(",");
        }
        return formatArray;
    }

    public static void main(String[] args) throws Exception {

        /**
         * Read the course file, format it and check for any errors/Handle any errors.
         */
        String[] courses = readCSV("Lab1/src/course.txt");
        courses = formatCsv(courses);
        if (courses.length == 1 && courses[0].equals("Error")) {
            System.out.println("Error reading file course.txt");
            return;
        }

        /**
         * Read the trainers file, format it and check for any errors/Handle any errors.
         */
        String[] trainers = readCSV("Lab1/src/trainer.txt");
        trainers = formatCsv(trainers);
        if (trainers.length == 1 && trainers[0].equals("Error")) {
            System.out.println("Error reading file trainer.txt");
            return;
        }

        /**
         * Read the trainer courses file and check for any errors/Handle any errors.
         */
        String[] trainerCourses = readCSV("Lab1/src/trainerCourse.txt");
        if (trainerCourses.length == 1 && trainerCourses[0].equals("Error")) {
            System.out.println("Error reading file trainerCourse.txt");
            return;
        }

        /**
         * Loop through all the trainer courses & check the associated indexes in course and trainer in the print statement &
         * Handle any errors if the length of the indexes are too long.
         */
        for (String trainerCourse : trainerCourses) {
            String[] parts = trainerCourse.split(",");
            int trainerIndex = Integer.parseInt(parts[0]) - 1;
            int courseIndex = Integer.parseInt(parts[1]) - 1;

            if (trainerIndex >= 0 && trainerIndex < trainers.length && courseIndex >= 0 && courseIndex < courses.length) {
                System.out.println(trainers[trainerIndex] + " is teaching " + courses[courseIndex]);
            } else {
                System.out.println("Error: Invalid trainer or course index");
            }
        }
    }
}
