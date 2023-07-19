/****************Conditional Statement*****************************
*****************Switch Case Statement*****************************
executes one statement from multiple ones

Syntax:
switch(expression)
{
    case x:
    //code of block executed if the case matches
    break;
    case y:
    //code of block executed if the case matches
    break;
     .
     .
     .
    default:
    //code of block executed if none of above cases match
}
*/

public class SwitchCaseStatement {
    public static void main(String[] args) {
        int age = 20;
        switch(age)
        {
            case 10:
            System.out.println("Your Age Is 10");
            break;
            case 20:
            System.out.println("Your Age is 20");
            break;
            case 30:
            System.out.println("Your Age is 30");
            break;
            default:
            System.out.println("Invalid Age");
        }
    }     
}
