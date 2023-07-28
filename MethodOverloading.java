/*********************Method Overloading**************************
 Two or more methods can have same name but different parameters.
**********Important Point***********
Method Overloading cannot be performed by changing the return type of methods.
For Example:
    //Not Allowed
    static void message(int a)
    {
        //code
    }
    static int message(int a)-------->Error
    {
        //code
    }

    //Allowed
    static void message(int a)
    {
        //code
    }
    static int message(int a, int b)
    {
        //code
    }

*/

public class MethodOverloading {
    // static void changeVariable(int a)
    // {
    //     a = 20;
    // }
    // static void changeArrayElement(int [] arr)
    // {
    //     arr[0] = 20;
    // }

        // Method Overloading
    static void message()
    {
        System.out.println("Welcome To My YouTube Channel");
    }

    static int message(int a)
    {
        System.out.println("Hi"+a);
        return 0;
    }

    // static void message(String a)
    // {
    //     System.out.println("Hi " + a);
    // }

    // static void message(String a, String b)
    // {
    //     System.out.println("Hi " +a + " Bye " + b);
    // }

    public static void main(String[] args) {
        // Change Variable
        // int age = 45;
        // System.out.println("The Age is: " + age);
        // changeVariable(age);
        // System.out.println("The Age is After Change Variable: " + age);

        //Change Array Element
        // int [] age = {25,35,45,55,65};
        // System.out.println("The Age on first Index is: " + age[0]);
        // changeArrayElement(age);
        // System.out.println("The Age on First Index After Change Method is: " + age[0]);


        // Method Overloading
        message();
        // message("Farzeen");
        // message("Farzeen","Ali");
        message(100);

    }
}
