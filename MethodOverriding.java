/* ******** Method Overriding In Java *************
When a SubClass provides a specific implementation for a method that is already defined in its parent class.
This allows the subClass to customize the behavior of that method

Rules:
1) same name, return type, parameter list
2) access modifier of the overriding method cannot be more restrictive than the access modifier of the method being overridden
3) Cannot Override a final and static method
4) Always Use @Override annotation 
 
*/

package myJavaTutorial;

class Vehicle{
    public void start(){
        System.out.println("The Vehicle Starts");
    }
}

class Car extends Vehicle{
    @Override
    public void start(){
        System.out.println("The Car Starts");
    }
    public void info(){
        System.out.println("I'm a Car");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.start();

        Car c = new Car();
        // c.info();
        c.start();
    }
}
