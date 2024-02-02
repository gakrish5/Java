package practise;

public class Strings {
    public static void main(String[] args){
        String name = new String("Hello World");
        String name2 = "Hello World";
        String name3 = "Hello World";

        System.out.println("1 " + (name == name2));
        System.out.println("2 " + name.equals(name2));

        System.out.println("3 " + (name2 == name3));
        System.out.println("4 " + name2.equals(name3));

        System.out.println("5 " + name.compareTo(name2));
        System.out.println("6 " + name.toUpperCase());

        System.out.println("7 " + name.contains("orld"));
        System.out.println("8 " + name.charAt(6));

        String name4 = " ";
        System.out.println("9 " + name4.equals(" "));
        System.out.println("10 " + name4.equals(null));
    }
}
