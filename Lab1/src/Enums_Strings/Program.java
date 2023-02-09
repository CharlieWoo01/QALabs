package Enums_Strings;

public class Program {

    public static void main(String[] args) {
        String name = "John";

        System.out.println("3rd character: " + name.charAt(2));

        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("Uppercase: " + name.toUpperCase());

        System.out.print("Characters: ");
        for (char c : name.toCharArray()) {
            System.out.print(c + "\t");
        }
        System.out.println();

        System.out.println("Starts with Jo: " + name.startsWith("Jo"));

        System.out.println("Ends with n: " + name.endsWith("n"));

        System.out.println("Index of o: " + name.indexOf('o'));
        System.out.println("Index of z: " + name.indexOf('z'));

        String fullName = name + " Doe";
        System.out.println("Full name: " + fullName);


        // Part 3: Using StringBuilder

        StringBuilder sb = new StringBuilder("Bruce Springsteen ");

        sb.append("is the artist ever");

        System.out.println(sb.toString());

        sb.insert(sb.indexOf("artist"), "greatest ");

        sb.replace(sb.indexOf("artist"), sb.indexOf("artist") + 7, "rock singer ");

        System.out.println(sb.toString());
    }

}
