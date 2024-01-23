package FinalClass;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of FinalClass
        FinalClass finalInstance = new FinalClass();

        // Accessing final variable (allowed)
        System.out.println("Final Variable from Main: " + finalInstance.finalVariable);

        // Accessing final method (allowed)
        finalInstance.finalMethod();
    }
}