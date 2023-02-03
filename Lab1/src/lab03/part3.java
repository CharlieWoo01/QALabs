package lab03;

import java.util.Scanner;

public class part3 {

    public static void convertInputToStonesPounds(int pounds) {
        int poundsInStone = 14;
        int findPounds = 0;
        findPounds = pounds % poundsInStone;
        System.out.println(Integer.toString(pounds / poundsInStone) + "," + findPounds);
    }

    public static void convertKgsToStonesPounds(double kg) {
        double kilosInPounds = 2.20462;
            System.out.printf("%.3f", kg * kilosInPounds);
    }

    public static void main(String args []) {
        int stoneInput;
        double kgInput;
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your weight in pounds: ");
        stoneInput = s.nextInt();
        System.out.println("Please enter your weight in kilograms: ");
        kgInput = s.nextDouble();
        s.close();

        convertInputToStonesPounds(stoneInput);
        convertKgsToStonesPounds(kgInput);
    }
}
