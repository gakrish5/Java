public class Product {
    private double price;

    public static void main(String[] args) {
        Product product = new Product();

        product.setPrice(10.0);
        double singlePrice = product.getPrice();
        System.out.println("Price for single quantity: " + singlePrice);

        int quantity = 5;
        double totalPrice = product.getPrice(quantity);
        if (totalPrice != -1) {
            System.out.println("Total price for " + quantity + " quantities: " + totalPrice);
        }
    }

    // Getter Method
    public double getPrice() {
        return price;
    }

    // Setter Method
    public void setPrice(double price) {
        this.price = price;
    }

    // Overriding Method
    public double getPrice(int quantity) {
        if (quantity > 0) {
            return price * quantity;
        } else {
            System.out.println("Invalid quantity. Please provide a positive quantity.");
            return -1;
        }
    }
}
