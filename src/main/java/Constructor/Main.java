package Constructor;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of ChildClass using the constructor with both parameters
        ChildClass childInstance1 = new ChildClass(10, 20);
        System.out.println("ChildClass Instance 1 - Parent Variable: " + childInstance1.parentVariable +
                ", Child Variable: " + childInstance1.childVariable);

        // Creating an instance of ChildClass using the overloaded constructor with one parameter
        ChildClass childInstance2 = new ChildClass(30);
        System.out.println("ChildClass Instance 2 - Parent Variable: " + childInstance2.parentVariable +
                ", Child Variable: " + childInstance2.childVariable);
    }
}