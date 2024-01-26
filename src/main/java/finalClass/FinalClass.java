package finalClass;

final class FinalClass {
    // Final variable
    public final int finalVariable = 42;

    // Final method accessible only within the same package
    final void finalMethod() {
        System.out.println("Final Method invoked. Final Variable value: " + finalVariable);
    }
}