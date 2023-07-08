/*
**********************Variables*********************
a container to store data
Declaration:
Syntax-> datatype variableName;
Initialization:
Syntax-> variableName = value;
        or
Declaration + Initialization:
Syntax-> dataType variableName = value;

Data Type: refers to the type of a value a variable has
Two Types:
1)Primitive Data Types
2)Non-Primitive Data Types

1)Primitive Data Types:
*)int->integer values(4bytes)
*)float->decimal values(4bytes)
*)char->single character(2bytes)
*)byte->stores whole numbers(1byte)
*)boolean->true false
*)short->integer values(2bytes)
*)long->integer values(8bytes)
*)double->decimal nos(8bytes)


Variables Name:
1)donot start with a number
2)case sensitive e.g farzeen Farzeen 
3) should not a keyword e.g static void
4) white spaces not allowed e.g first name->firstName
5) numbers characters middle and end of variable -> var1, num2;
*/
public class VariablesDataTypes {
       public static void main(String[] args) {
        System.out.println("***********Variables And Data Types In Java************");

        // // declaration
        // int age;
        // // Initialize
        // age = 10;

        // Declaration + Initialization

        int age = 8;
        char ch = 'f';
        float fl = 5.6f;
        double dl = 4.6d;
        byte a = 3;
        long l = 56666l;
        short s = 56;
        System.out.println("The Results Are: ");
        System.out.println(age);
        System.out.println(ch);
        System.out.println(fl);
        System.out.println(dl);
        System.out.println(a);
        System.out.println(l);
        System.out.println(s);
       } 
}
