package constructor;

class ChildClass extends ParentClass {
    // Instance variable in the child class
    public int childVariable;

    // Constructor to initialize both instance variables
    public ChildClass(int parentVariable, int childVariable) {
        // Calling the constructor of the parent class
        super(parentVariable);
        this.childVariable = childVariable;
    }

    // Overloaded constructor with only one parameter
    public ChildClass(int childVariable) {
        // Calling the constructor of the parent class with a default value for parentVariable
        super(0); // You can choose a suitable default value
        this.childVariable = childVariable;
    }
}