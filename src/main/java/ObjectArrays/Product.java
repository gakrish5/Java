package ObjectArrays;

import java.util.*;

class Product implements Comparable<Product> {
    private double weight;
    private double price;
    private int id;

    // Constructor
    public Product(double weight, double price, int id) {
        this.weight = weight;
        this.price = price;
        this.id = id;
    }

    // Getter methods

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    // Implementing compareTo method for Comparable interface
    @Override
    public int compareTo(Product otherProduct) {
        // Compare products based on their price
        return Double.compare(this.price, otherProduct.price);
    }

    // toString method for better readability
    @Override
    public String toString() {
        return "Product [id=" + id + ", weight=" + weight + ", price=" + price + "]";
    }

    // Main method for testing
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        // Adding products to the list
        productList.add(new Product(2.5, 25.99, 1));
        productList.add(new Product(1.8, 19.99, 2));
        productList.add(new Product(3.0, 34.99, 3));

        // Sorting the list of products based on price
        Collections.sort(productList);

        // Displaying the sorted list
        System.out.println("Sorted Products based on Price:");
        for (Product product : productList) {
            System.out.println(product);
        }
    }
}
