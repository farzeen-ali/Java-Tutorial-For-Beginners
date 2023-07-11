/*
    ***********************User Input*********************
    Java has a Scanner Class to read data from the keyboard
    import java.util.Scanner;
    Scanner sc = new Scanner(System.in);
    System.in-----> Read from the keyboard
    sc -----> obj of Scanner class
*/
import java.util.Scanner;
public class UserInput {
   public static void main(String[] args) {
    // System.out.println("Enter Your Age: ");
    // Scanner obj = new Scanner(System.in);
    // int age = obj.nextInt(); 
    // System.out.println("Your Age Is: ");
    // System.out.println(age);
    // String fullName = obj.next();
    // String fullName = obj.nextLine();
    // System.out.println("Your Name Is: ");
    // System.out.println(fullName);

    System.out.println("Calculate Your Result ");
    float totalMarks = 500;

    System.out.println("Enter Your 5 Subject Marks");
    Scanner m = new Scanner(System.in);
    float sub1 = m.nextFloat();
    float sub2 = m.nextFloat();
    float sub3 = m.nextFloat();
    float sub4 = m.nextFloat();
    float sub5 = m.nextFloat();

    float obtainedMarks = sub1 + sub2 + sub3 + sub4 + sub5;
    System.out.println("Your obtainedMarks is: ");
    System.out.println(obtainedMarks);

    float percentage = (obtainedMarks/totalMarks) * 100;
    System.out.println("Your percentage is:");
    System.out.println(percentage);
   }
}
