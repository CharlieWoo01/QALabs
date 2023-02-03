package lab03;

import java.util.Scanner;

public class part2 {
    public static String getString(String prompt) {
        Scanner s = new Scanner(System.in);
        System.out.println(prompt);
        return s.nextLine();
    }

    public static int getInt(String prompt) {
        Scanner s = new Scanner(System.in);
        System.out.println(prompt);
        return s.nextInt();
    }

    public static String theLunchQueue() {
        String mainCourse, bill;
        int roastPotatoes, brusselSprouts;
        mainCourse = getString("What main dishes would you like (Fish, Burgers or Veg)?: ");
        roastPotatoes = getInt("How many roast potatoes would you like?: ");
        brusselSprouts = getInt("How many brussel sprouts would you like?: ");
        bill = "Hello, your lunch is: " + mainCourse + " With: " + roastPotatoes + " roast potatoes and: " + brusselSprouts + " brussel sprouts";
        return bill;
    }

    public static void main(String args[]) {
        System.out.print(theLunchQueue());
    }
}
