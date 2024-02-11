package lesson2Homework;

public class Lesson2Homework {
    public static void main(String[] args) {
        // Task 1
        firstNameLastNameAge( "Roman", "Zakharyan", 39);
        System.out.println("----------------------------------------------------------");
        //Task2
        String s="The entrance is forbidden today";
        System.out.println(s.replace("forbidden", "allowed"));
        //Task 3
        System.out.println("-------------------------------------------------------------");
        System.out.println("The length of the circle in case of r=5: " + circleLength(5.0));
        System.out.println("-----------------------------------------------------------------------");

    }
    public static void firstNameLastNameAge (String firstName, String lastName, int age){
        System.out.println("first name: " + firstName.toUpperCase());
        System.out.println("last name: " + lastName.toUpperCase());
        System.out.println("age: " + age);
    }
    public static double circleLength (double r){
        double l=2*3.14*r;
        return l;
    }


}
