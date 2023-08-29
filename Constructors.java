/* **************** Constructor In Java *********************
It is a special method that is used to initialize objects.
It is automatically called (invoked) when an object of a class is created.

What is Special????
1) Same name as Class Name
2) Automatically Invoked
3) No Return type
*/

package myJavaTutorial;

class MyEmployee{
   private int id;
   private String name;
   private int salary;

   //Constructor
   public MyEmployee(){
      // System.out.println("Hello I'm Constructor");
      id = 10;
      name = "Ali";
      salary = 4000;
   }

   public MyEmployee(int i, String n, int s){
      id = i;
      name = n;
      salary = s;
   }

   //Setter for Id
   public void setId(int i){
      id = i;
   }
   //Getter for Id
   public int getId(){
      return id;
   }

    //Setter for Name
   public void setName(String n){
      name = n;
   }

   //Getter for name
   public String getName(){
      return name;
   }

   //Setter for salary
   public void setSalary(int s){
      salary = s;
   }
   //Getter for salary
   public int getSalary(){
      return salary;
   }

}

public class Constructors {
    public static void main(String[] args) {
       MyEmployee emp = new MyEmployee(2,"Huzaifa",70000);
      //  System.out.println(emp.getId());
      //  System.out.println(emp.getName());
      //  System.out.println(emp.getSalary());
       emp.setId(1);
       emp.setName("Farzeen");
       emp.setSalary(50000);
       System.out.println(emp.getId());
       System.out.println(emp.getName());
       System.out.println(emp.getSalary());
    }
}
