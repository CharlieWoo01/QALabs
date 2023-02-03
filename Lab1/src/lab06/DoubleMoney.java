package lab06;

import java.text.DecimalFormat;

public class DoubleMoney {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public double updateBalance(double initialInvestment, double interestRate) {
        return initialInvestment + (initialInvestment * interestRate);
    }

    public void account() {
        double interestRate = 0.05;
        double initialInvestment = 100;
        double targetInvestment = 200;
        int years = 0;

        while (initialInvestment < targetInvestment) {
            initialInvestment = updateBalance(initialInvestment, interestRate);
            System.out.println(initialInvestment);
            years++;
        }

        System.out.println("It will take " + Integer.toString(years) + " years to reach " + df.format(initialInvestment));
    }
}
