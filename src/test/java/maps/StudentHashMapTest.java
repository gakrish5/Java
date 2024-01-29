package maps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentHashMapTest {

    @Test
    void testGetStudentByName() {
        // Arrange
        Student john = new Student("John", "Doe", 3.5);
        Student jane = new Student("Jane", "Smith", 3.8);
        Student bob = new Student("Bob", "Johnson", 3.2);

        // Act
        Student retrievedJohn = Student.getStudentMap().get("John");
        Student retrievedJane = Student.getStudentMap().get("Jane");
        Student retrievedBob = Student.getStudentMap().get("Bob");
        Student retrievedNonexistent = Student.getStudentMap().get("Nonexistent");

        // Assert
        assertNotNull(retrievedJohn);
        assertEquals(john.getGPA(), retrievedJohn.getGPA(), 0.001);

        assertNotNull(retrievedJane);
        assertEquals(jane.getGPA(), retrievedJane.getGPA(), 0.001);

        assertNotNull(retrievedBob);
        assertEquals(bob.getGPA(), retrievedBob.getGPA(), 0.001);

        assertNull(retrievedNonexistent);
    }
}
