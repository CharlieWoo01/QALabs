package More_Conditionals;

import java.util.Scanner;

public class Lab5 {

    public static int getInt(String prompt) {
        Scanner s = new Scanner(System.in);
        System.out.println(prompt);
        int intInput = s.nextInt();
        return intInput;
    }

    public static String getGradeCalculation(int examMark) {
        String gradeCalculation = "";

        if (examMark >= 0 && examMark < 50) {
            gradeCalculation = "Fail";
        }
        else if (examMark >= 50 && examMark <= 60) {
            gradeCalculation = "Pass";
        }
        else if (examMark >= 61 && examMark <= 70) {
            gradeCalculation = "Merit";
        }
        else if (examMark >= 71 && examMark <= 100) {
            gradeCalculation = "Distinction";
        }
        else {
            gradeCalculation = "Error: Marks must be between 1 and 100";
        }
        return gradeCalculation;
    }

    public void grades() {
        int examMark = getInt("Please enter an exam mark: ");
        System.out.println(getGradeCalculation(examMark));
    }
}
