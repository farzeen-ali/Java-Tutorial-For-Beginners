/*
*****************Strings*********************
Sequence of character known as String
String has special support in Java
Declaration:
String variableName;
Initialization:
variableName = new String("Anything");
Declaration + Initialization:
1 Method:(Use String Class and make Object) 
String objName = new String("Anything");
2 Method: (Use as a Data Type)
String variableName = "Anything";

Note: Strings are immutable (can't be changed)

Printf and Format Functions:
use for printing a message with any dataType values by using format specifier

Format Specifiers:
%d----> int
%c----> char
%f----> float
%s----> string
*/
import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
        // class
        // String str = new String("Hello World");
        // System.out.println(str);
        // Primitive data type
        // String str = "Hello World";
        // System.out.println(str);

        // Scanner sc = new Scanner(System.in);
        // String fullName = sc.nextLine();
        // System.out.println(fullName);

        int age = 22;
        System.out.printf("Your Age is %d",age);

    }
}





