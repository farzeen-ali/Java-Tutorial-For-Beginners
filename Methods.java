/**************Methods In Java**************************
Block of Code which only runs when it is called 
used to perform certain actions
It defines once and use it many times
using camelCaseConvention

Types of Methods:
1) User-defined Methods
2) Standard Library Methods (Builtin Methods | Pre-Defined Methods)

Syntax:
returnType methodName(parameters)
{
    //block of code
}  
*/
/**
 * Methods
 */
public class Methods {
// static int addNumbers(int a, int b) //Parameters
//    {
//     int sum = a + b;
//     return sum;
//    }
 int addNumbers(int a, int b) //Parameters
   {
    int sum = a + b;
    return sum;
   }

static int square(int num)
{
    return num*num;
}

    public static void main(String[] args) {
        // int a = 3;
        // int b = 5;
        // int sum = a + b;
        // System.out.println(sum);
        int x = 3;
        int y = 8;
        int result;
        // result = addNumbers(x,y);//arguments
        // result = addNumbers(6,7);
        // System.out.println(result);

        Methods obj = new Methods();
        result = obj.addNumbers(x,y);
        System.out.println(result);

        int sqr = square(8);
        System.out.println(sqr);

    }
}