/* ************** Interfaces *****************
  Interfaces: A set of rules that a class promises to follow, outlining what methods it must have without specifying how they should be implemented. It is used to achieve abstraction.
  
    Multiple Inheritance:
    Supports multiple inheritance.

    Methods:
    Can only declare method signatures.

    Constructor:
    Cannot have constructors.

    Abstract Methods:
    All methods are implicitly abstract. (public abstract type)

    Static And Default Methods are also allowed
    default void run(){

    }
    public static void run(){

    }
*/

package myJavaTutorial;

interface I1{
    int age = 21; //public static final
    void show();
    default void sayGoodBye(){
        System.out.println("Good Bye!!!");
    }
    static void sayHi(){
        System.out.println("Hi");
    }
}

interface I2{
    void display();
}

class Test implements I1, I2{
    @Override
    public void show(){
        System.out.println("Hello");
    }

    @Override
    public void display(){
        System.out.println("I'm a Display Method");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Test t = new Test();
        t.show();
        System.out.println(I1.age);
        t.sayGoodBye();
        I1.sayHi();
        t.display();
    }
}













