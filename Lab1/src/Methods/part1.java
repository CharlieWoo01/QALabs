package Methods;

import java.util.Scanner;

public class part1 {

    public static int getInt(String prompt) {
        Scanner s = new Scanner(System.in);
        System.out.println(prompt);
        return s.nextInt();
    }

    public static String getString(String prompt) {
        Scanner s = new Scanner(System.in);
        System.out.print(prompt);
        return s.nextLine();
    }

    public static void main (String args[]){
        String prompt;
        prompt = "Help";
        System.out.println(getString(prompt));
        System.out.println(getInt(prompt));
    }
}
