package ArrayList.Student;

import java.util.ArrayList;

public class RemoveStudentsBelowAverage {

    public static void main(String[] args) {
        // Creating an ArrayList of Student objects
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("John", "Doe", 3.5));
        studentList.add(new Student("Jane", "Smith", 3.2));
        studentList.add(new Student("Bob", "Johnson", 3.8));
        studentList.add(new Student("Alice", "Williams", 3.0));

        // Displaying the ArrayList before removal
        System.out.println("Students before removal:");
        printStudents(studentList);

        // Calculate the average GPA
        double averageGPA = calculateAverageGPA(studentList);

        // Remove students with GPA less than the average GPA
        removeStudentsBelowAverage(studentList, averageGPA);

        // Displaying the ArrayList after removal
        System.out.println("\nStudents after removal:");
        printStudents(studentList);
    }

    // Method to calculate the average GPA of students
    private static double calculateAverageGPA(ArrayList<Student> students) {
        if (students.isEmpty()) {
            return 0.0;
        }

        double totalGPA = 0.0;
        for (Student student : students) {
            totalGPA += student.GPA;
        }

        return totalGPA / students.size();
    }

    // Method to remove students with GPA less than the average GPA
    private static void removeStudentsBelowAverage(ArrayList<Student> students, double averageGPA) {
        students.removeIf(student -> student.GPA < averageGPA);
    }

    // Method to print the list of students
    private static void printStudents(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println("Name: " + student.firstName + " " + student.lastName + ", GPA: " + student.GPA);
        }
    }
}
