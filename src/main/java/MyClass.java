public class MyClass {
    // Static variable
    private static int myStaticVariable = 10;

    // Static method that returns an int
    public static int getStaticVariable() {
        return myStaticVariable;
    }

    public static void main(String[] args) {
        // Accessing the static variable and method
        System.out.println("Static Variable: " + MyClass.myStaticVariable);
        System.out.println("Returned Value from Static Method: " + MyClass.getStaticVariable());
    }
}
