package shape;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape(); // Parent class Instance
        Circle circle = new Circle(5.0); //Child Class Instance

        // reference variable of parent class can be referred to object of child class
        Shape reference;

        // reference to the parent class
        reference = shape;
        reference.calculateArea(); // Calls the parent class method

        // Reference to the child class
        reference = circle;
        reference.calculateArea(); // Calls the overridden method in the child class
    }
}