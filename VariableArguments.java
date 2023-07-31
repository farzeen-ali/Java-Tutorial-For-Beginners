/****************** Variable Arguments (VarArgs) *************************
The VarArgs allows the method to accept zero or multiple arguments.
Syntax: 
returnType methodName(dataType ...variableName)
{
    //block of code
}
***********Important Points**********
1) A method can declare only one argument
2) It is placed at the last parameter in a method's parameters list.
*/
public class VariableArguments {
    // static int add(int a, int b)
    // {
    //     int sum = 0;
    //     sum = a + b;
    //     return sum;
    // }
    // static int add(int a, int b, int c)
    // {
    //     int sum = 0;
    //     sum = a + b + c;
    //     return sum;
    // }

    // Use VarArgs
    // static int add(int ...arg)
    // {
    //     int sum = 0;
    //     // for(int i = 0; i < arg.length; i++)
    //     // {
    //     //     sum+= arg[i]; //sum = sum + arg[i]
    //     // }
    //     for(int i : arg){
    //        sum+=i; 
    //     }
    //     return sum;
    // }
    // Atleast take one argument
    static int add(int a, int ...arg)
    {
        int sum = a;
        // for(int i = 0; i < arg.length; i++)
        // {
        //     sum+= arg[i]; //sum = sum + arg[i]
        // }
        for(int i : arg){
           sum+=i; 
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Variable Arguments");
        int result;
        // result = add(1,2,3,4,5);
        // result = add();
        result = add(1);
        System.out.println(result);
    }
}
