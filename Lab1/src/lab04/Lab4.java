package lab04;

import java.util.Scanner;

public class Lab4 {

    public static int getInt(String prompt) {
        Scanner s = new Scanner(System.in);
        System.out.println(prompt);
        int intInput = s.nextInt();
        return intInput;
    }

    public static boolean validateNumbers(int value) {
        return (value <= 0) ? true : false;
    }

    public static String calculateBags(int bagPrice, int moneyAmount) {
       return Integer.toString(moneyAmount / bagPrice);
    }

    public void part1() {
        int bagPrice, moneyAmount = 0;
        String printString;
        bagPrice = getInt("Price of a bag please?: ");
        moneyAmount = getInt("How much money do you have?: ");

        if (validateNumbers(bagPrice) && bagPrice <= moneyAmount
                || validateNumbers(moneyAmount) && bagPrice <= moneyAmount ) {
            printString = "If the price is " + bagPrice + "p and you have " + moneyAmount + "p then you will be able to buy " +
                    calculateBags(bagPrice, moneyAmount) + " bags";
            System.out.println(printString);
        }
        else {
            System.out.println("Please ensure that your value is not 0, negative or you have less money than bag price. ");
        }
    }
}
