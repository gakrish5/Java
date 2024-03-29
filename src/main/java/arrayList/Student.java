package arrayList;

import java.util.ArrayList;

public class Student {
    public static ArrayList<Student> studentArrayList = new ArrayList<>();
    private String firstName;
    private String lastName;
    private float gpa;
    public Student(String firstName, String lastName, float gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public static void display() {
        for (Student obj : studentArrayList
        ) {
            System.out.println(obj);
        }
    }

    public static ArrayList<Student> belowAverageStudents(ArrayList<Student> arrayList) {
        float avg = 0.0f;
        float sum = 0;

        for (Student obj : arrayList) {
            sum += obj.getGpa();
        }

        avg = sum / arrayList.size();
        ArrayList<Student> newArrayList = new ArrayList<>();

        for (Student obj : arrayList
        ) {
            if (obj.getGpa() > avg) {
                newArrayList.add(obj);
            }
        }
        return newArrayList;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public float getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName() + " " + this.getGpa();
    }
}
