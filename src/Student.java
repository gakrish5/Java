public class Student {
    public String name; //Variable

    public Student(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Aravinda Krishna");
        System.out.println("Student Name: "+student1.getName());
    }
}