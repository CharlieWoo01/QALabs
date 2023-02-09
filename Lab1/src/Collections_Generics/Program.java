package Collections_Generics;

import java.util.ArrayDeque;

public class Program {
    static ArrayDeque<ShoppingBasket> baskets = new ArrayDeque<ShoppingBasket>();

    public static void main(String[] args) {
        buy();
        processBaskets();
    }

    static void buy() {
        baskets.add(new ShoppingBasket("Apple", 2, 0.50));
        baskets.add(new ShoppingBasket("Bag", 1, 0.5));
        baskets.add(new ShoppingBasket("Pizza", 10, 1.49));
    }

    static void processBaskets() {
        while (!baskets.isEmpty()) {
            ShoppingBasket basket = baskets.pop();
            basket.displayDetails();
            System.out.println("------------------");
        }
    }
}