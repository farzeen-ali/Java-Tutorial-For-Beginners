/****************** Recursion In Java *****************
A Function call itself.
A recursive Algorithm must have a base case
*/
public class Recursion{
    // static void display(int count)
    // {
    //     if(count<5) //base case
    //     {
    //         System.out.println("Hello World From Recursion " + count);
    //         count++;
    //         display(count); //recursive call
    //     }
    // }

        //Factorial of a number
        // 5! = 5*4*3*2*1 ------> 1 = 1 0 = 1
        static int factorial(int num)
        {
            if(num == 1 || num == 0) //base case
            {
                return 1;
            }
            else{
                return num*factorial(num - 1); //recursive call
            }
        }
    public static void main(String[] args) {
        System.out.println("Recursion In Java");
        // display(0);
        System.out.println("The Factorial of a number is: " + factorial(5));
    }
}    