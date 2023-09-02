/* ************ Constructors In Inheritance ********************** */
package myJavaTutorial;

class Parent{
    Parent(){
        System.out.println("Parent Class Constructor With No Parameters");
    }
    //Overloaded Constructor
     Parent(int a){
        System.out.println("Parent Class Constructor With Parameter " + a);
    }
}

class Child extends Parent{
    Child(){
        System.out.println("Child Class Constructor With No Parameters");
    }

    Child(int a, int b){
        super(a);
        System.out.println("Child Class Constructor With Parameter " + b);
    }
}

class GrandChild extends Child{
    GrandChild(){
        System.out.println("Grand Child Class Constructor With No Parameters");
    }

    GrandChild(int a, int b, int c){
        super(a,b);
        System.out.println("Grand Child Class Constructor With Parameter " + c);
    }
}

public class InheritanceConstructors {
    public static void main(String[] args) {
        // Parent pc = new Parent();

        // Child cc = new Child(1,2);

        // GrandChild gc = new GrandChild();
        GrandChild gc = new GrandChild(10,20,30);
    }
}
