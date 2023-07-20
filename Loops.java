/*****************Loops*********************
used to execute a particular part of the program repeatedly if a given condition evaluates to be true.

1)While Loop:
    Syntax:
        while(condition)
        {
            //block of code to be executed repeatedly, if condition is true
        }

2)Do-While Loop (execute at least one time):
    Syntax:
        do
        {
            //block of code to be executed repeatedly, if condition is true
        }
        while(condition);
3)For Loop:
    Syntax:
        for(initialization; check expression; update)
        {
            //block of code to be executed repeatedly, if condition is true
        }

*/
import java.util.Scanner;
public class Loops {
       public static void main(String[] args) {
        // While Loop
        // int a = 0;
        // while(a<100)
        // {
        //     System.out.println(a);
        //     a++;
        // }
        // Do-While Loop
    //     int a = 0;
    //     do
    //     {
    //         System.out.println(a);
    //         a++;
    //     }
    //     while(a>10);

    // For Loop
        // for(int a = 0; a<10; a++)
        // {
        //     System.out.println(a);
        // }

        // Practice Programs
        // While loop
        // int sum = 0;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Positive Integers: ");
        // int number = sc.nextInt();
        // while(number>=0)
        // {
        //     sum+=number;   //sum = sum + number;

        //     System.out.println("Enter Positive Integers: ");
        //     number = sc.nextInt();
        // }
        // System.out.println("The Sum is: " + sum);

        // Do While Loop
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter The Number");
        // int number = sc.nextInt();
        // int i = 1;
        // System.out.println("The Table of "+number+" is: ");
        // do{
        //     System.out.println(number+" * "+i+" = "+(number*i));
        //     i++;
        // }
        // while(i<=10);

        // For Loop
        int sum = 0;
        int number = 1000;
        for(int i = 1; i<=number; i++)
        {
            sum+=i;
        }
        System.out.println("The Sum IS: "+sum);
       }

}







