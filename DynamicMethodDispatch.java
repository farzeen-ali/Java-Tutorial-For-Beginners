/* ************** Dynamic Method Dispatch *******************
It is also called "Run-Time Polymorphism".
It is the process through which a call to an overridden method is resolved at runtime.

Trick:
SuperClass obj = new SubClass();-----> allow
SubClass obj = new SuperClass();-----> not allow
*/

package myJavaTutorial;

class Phone{
    public void call(){
        System.out.println("Calling Using Phone.........");
    }
}

class SmartPhone extends Phone{
    @Override
    public void call(){
        System.out.println("Calling Using SmartPhone.........");
    }

    public void selfie(){
        System.out.println("Taking Selfie Using SmartPhone..");
    }

}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        // Phone p = new Phone();
        // p.call();        

        Phone p = new SmartPhone(); //allowed
        p.call();
        //p.selfie();---> error

        //SmartPhone sp = new Phone();//not allowed
    }
}
