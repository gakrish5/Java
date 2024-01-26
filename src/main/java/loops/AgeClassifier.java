package loops;

import java.util.Scanner;

public class AgeClassifier {
    private static void classifyPerson(int age) {
        if (age < 13) {
            System.out.println("Kid");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teen");
        } else {
            System.out.println("Adult");
        }
    }

    public static void main(String[] args) {
        // Example usage
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the age: ");
        // to get the input from the user
        int age = scanner.nextInt();
        classifyPerson(age);
    }
}
