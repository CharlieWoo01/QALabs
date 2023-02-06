package lab11;

class ShoppingBasket {
    String productName;
    int quantity;
    double price;

    public ShoppingBasket(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
    }
}