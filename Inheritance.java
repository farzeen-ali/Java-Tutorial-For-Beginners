/* ********************* Inheritance In Java **********************
key feature of Object Oriented Programming(OOP)
A Concept that acquires the features from one class to another class

1)SuperClass (Parent Class): the class being inherited from (Base Class)
2)SubClass (Child Class): the class that inherits from another class (Derived Class)
*/

package myJavaTutorial;

class Base{
    public int a;
    protected int b;
    int c;
    private int d;

    public void setD(int d){
        this.d = d;
    }

    public int getD(){
        return this.d;
    }

}

class Derived extends Base{
    public int e;
}

public class Inheritance{
     public static void main(String[] args) {
        Base bs = new Base();
        

        Derived de = new Derived();
        de.a = 1;
        de.b = 2;
        de.c = 3;
        // de.d = 4;--->error
        de.setD(4);
        System.out.println(de.getD());
        de.e = 5;

        System.out.println(de.a);
        System.out.println(de.b);
        System.out.println(de.c);
        System.out.println(de.e);
        
     }
}
