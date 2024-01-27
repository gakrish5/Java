package arrayList;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentTest {

    @Test
    public void Test1() {

        Student obj1 = new Student("Akhil", "Govada", 4.0f);
        Student obj2 = new Student("Manikanta", "Gadde", 3.0f);
        Student obj3 = new Student("Uday", "Varma", 3.7f);
        Student obj4 = new Student("Tarun", "Budiredla", 3.3f);

        ArrayList<Student> arr = new ArrayList<>();
        arr.add(obj1);
        arr.add(obj2);
        arr.add(obj3);
        arr.add(obj4);

        Student.studentArrayList = arr;
        Student.display();
        Assert.assertEquals(arr, Student.studentArrayList);
    }

    @Test
    public void Test2() {
        Student obj1 = new Student("Akhil", "Govada", 4.0f);
        Student obj2 = new Student("Manikanta", "Gadde", 3.0f);
        Student obj3 = new Student("Uday", "Varma", 3.7f);
        Student obj4 = new Student("Tarun", "Budiredla", 3.3f);

        ArrayList<Student> arr = new ArrayList<>();
        arr.add(obj1);
        arr.add(obj2);
        arr.add(obj3);
        arr.add(obj4);

        Student.studentArrayList = arr;

        Student.display();
        ArrayList<Student> arr1 = Student.belowAverageStudents(arr);
        ArrayList<Student> arr2 = new ArrayList<>();
        arr2.add(obj1);
        arr2.add(obj3);
        Assert.assertEquals(arr2, arr1);
    }


    @Test
    public void Test3() {

        Student obj1 = new Student("Akhil", "Govada", 4.0f);
        Student obj2 = new Student("Manikanta", "Gadde", 3.0f);
        Student obj3 = new Student("Uday", "Varma", 3.7f);
        Student obj4 = new Student("Tarun", "Budiredla", 3.3f);

        ArrayList<Student> arr = new ArrayList<>(Arrays.asList(obj1, obj2, obj3, obj4));
        Student.studentArrayList = arr;

        Student.display();
        ArrayList<Student> arr1 = Student.belowAverageStudents(arr);
        ArrayList<Student> arr2 = new ArrayList<>();
        arr2.add(obj3);

        boolean check = arr1.equals(arr2);
        Assert.assertFalse(check);

    }

    @Test
    public void Test4() {

        Student obj1 = new Student("Akhil", "Govada", 4.0f);
        Student obj2 = new Student("Manikanta", "Gadde", 3.0f);
        Student obj3 = new Student("Uday", "Varma", 3.7f);
        Student obj4 = new Student("Tarun", "Budiredla", 3.3f);

        ArrayList<Student> arr = new ArrayList<>(Arrays.asList(obj1, obj2, obj3, obj4));
        Student.studentArrayList = arr;
        Student.display();

        ArrayList<Student> arr1 = Student.belowAverageStudents(arr);
        ArrayList<Student> emptyArrayList = new ArrayList<>();
        boolean check = arr1.equals(emptyArrayList);
        Assert.assertFalse(check);
    }

    @Test
    public void Test5() {
        ArrayList<Student> emptyArray = new ArrayList<>();
        Student.studentArrayList = emptyArray;
        Student.display();

        ArrayList<Student> arr1 = Student.belowAverageStudents(emptyArray);
        boolean check = emptyArray.equals(arr1);
        Assert.assertTrue(check);
    }
}
