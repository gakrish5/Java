package Inheritence;

public class Main {
    public static void main(String[] args) {
        SubDept subDept = new SubDept(50);
        int size = subDept.getDepartmentSize();
        System.out.println("Department Size: " + size);
    }
}