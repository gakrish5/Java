package maps;

import java.util.HashMap;

class Student {
    private static HashMap<String, Student> studentMap = new HashMap<>();

    static {
        // Initializing the HashMap with 8 students
        studentMap.put("John", new Student("John", "Doe", 3.5));
        studentMap.put("Jane", new Student("Jane", "Smith", 3.8));
        studentMap.put("Bob", new Student("Bob", "Johnson", 3.2));
        studentMap.put("Alice", new Student("Alice", "Williams", 3.9));
        studentMap.put("Charlie", new Student("Charlie", "Brown", 3.1));
        studentMap.put("Eva", new Student("Eva", "Davis", 3.7));
        studentMap.put("Frank", new Student("Frank", "Taylor", 3.4));
        studentMap.put("Grace", new Student("Grace", "Miller", 3.6));
    }

    private String firstName;
    private String lastName;
    private double GPA;

    public Student(String firstName, String lastName, double GPA) {
        if (firstName == null || lastName == null) {
            throw new IllegalArgumentException("First name and last name cannot be null.");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.GPA = GPA;
    }

    public static HashMap<String, Student> getStudentMap() {
        return new HashMap<>(studentMap);
    }

    // Method to get a Student object by first name
    public static Student getStudentByName(String firstName) {
        return studentMap.get(firstName);
    }

    // Getter methods for attributes
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGPA() {
        return GPA;
    }
}

