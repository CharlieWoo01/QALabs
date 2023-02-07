package exceptions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

    public static void main (String args[]) throws IOException {
        Account account1 = new Account(1, 100.00, "Charlie Roberts");
        try {
            account1.withdraw(101.00);
        } catch (IllegalArgumentException | IllegalAccessException e) {
            System.out.println("Error: " + e.getMessage());
            log(e.getMessage() + " More Details: User tried entering a value for withdraw which is above their balance resulting in a negative balance which isn't allowed...");
        } finally {
            account1.close();
        }
        System.out.println(account1.getDetails());
    }

    private static void log(String msg) throws IOException {
        File file = new File("Lab1/src/log.txt");
        FileWriter fr = new FileWriter(file, true);
        BufferedWriter br = new BufferedWriter(fr);
        br.write(msg + "\r\n");
        br.close();
        fr.close();
    }
}
