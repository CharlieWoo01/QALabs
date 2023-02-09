package Abstract_Classes_Interfaces;

public class Program {

    public static void main(String args[]) {

        /**
         * Create an animal array of the objects
         */
        Animal[] animals = {
                new Duck("Bob"),
                new Penguin("Jerry"),
                new Fish("Terry")
        };

        System.out.println("Consumables: ");

        /**
         * Iterate through consumable with the information
         */
        for (Animal animal : animals) {
            if (animal instanceof Consumable) {
                Consumable consumable = (Consumable) animal;
                System.out.println(consumable.describeTaste());
                System.out.println(consumable.isMainCourseDish() + "\n");
            }
        }

        System.out.println("Insurable: ");

        /**
         * Iterate through insurable with the information
         */
        for (Animal animal : animals) {
            if (animal instanceof Insurable) {
                Insurable insurable = (Insurable) animal;
                System.out.println(insurable.getPremium());
                System.out.println(insurable.expires() + "\n");
            }
        }
    }
}
