package ObjectArrays.Person;

public class PersonEqualsExample {
    public static void main(String[] args) {
        // Creating persons with different attributes
        Person person1 = new Person(175.0, 70.0, "123-45-6789", "123-456-7890");
        Person person2 = new Person(180.0, 65.0, "987-65-4321", "987-654-3210");
        Person person3 = new Person(165.0, 75.0, "123-45-6789", "555-555-5555");

        // Testing the equals method
        System.out.println("person1 equals person2: " + person1.equals(person2)); // false
        System.out.println("person1 equals person3: " + person1.equals(person3)); // true
    }
}