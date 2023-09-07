/* ************** This & Super Keyword************ 
 This: 
    Helps distinguish between instance variables and method parameters
    improves code clarity and readability

Super:
    refers to the parent class (super class)
    used to access superClass Constructors, Methods....
*/

package myJavaTutorial;

class One{
    //For This Keyword
    // int a;
    // public void setA(int a){
    //     this.a = a;
    // }

    // public int getA(){
    //     return a;
    // }

    // One(){
        //Default Constructor
    // }

    One(int a){
        System.out.println("One Class Constructor With Value a = " + a);
    }

}

class Two extends One{
    Two(int b){
        super(b);
        System.out.println("Two Class Constructor With Value b = " + b);
    }
}

public class ThisAndSuperKeyword {
    public static void main(String[] args) {
        // One o = new One();
        // o.setA(7);
        // System.out.println(o.getA());

        // Two t = new Two(3);
    }
}
