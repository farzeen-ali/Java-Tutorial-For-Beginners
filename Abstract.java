/* ************* Abstract Methods & Abstract Classes In Java ***************
*)Abstract ---> existing in thought or as an idea but not having a physical or concrete existence

*)Abstract Methods In Java ---> A method that does not have its implementation or body
e.g: 
    public abstract returnType methodName(parameterList);
                        or
    abstract public returnType methodName(parameterList);
*)Abstract Class In Java ----> a class that is declared abstract, abstract class cannot be instantiated, but they can be subclasses
*/
package myJavaTutorial;

abstract class Vehicle1{
    abstract public void start();
}

class Car1 extends Vehicle1{
    @Override
    public void start(){
        System.out.println("Car starts");
    }
}

class Bike1 extends Vehicle1{
    @Override
    public void start(){
        System.out.println("Bike starts");
    }
}

public class Abstract {
   public static void main(String[] args) {
    // Car1 c1 = new Car1();
    // c1.start();
    // Bike1 b1 = new Bike1();
    // b1.start();

    //Dynamic Method Dispatch
    // Vehicle1 car = new Car1();
    // car.start();
    // Vehicle1 bike = new Bike1();
    // bike.start();

    // Vehicle1 v = new Vehicle1();----error
   } 
}
