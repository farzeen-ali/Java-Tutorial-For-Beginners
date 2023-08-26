/******** Getters And Setters In Java *******************
used to protect your data, particularly when creating classes
getters are also known as accessors 
setters are also known as mutators
*/

package myJavaTutorial;

class Employee{
   private int id;
   private String name;

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
      // name = n;
      name = n.toUpperCase();
   }

   //Getter for name
   public String getName(){
      return name;
   }

}

public class GettersAndSetters {
   public static void main(String[] args) {
   Employee emp = new Employee();
   // emp.id = 1;
   // emp.name = "Farzeen";

   // System.out.println(emp.id);
   // System.out.println(emp.name);


   emp.setId( 10 );
   emp.setName("Farzeen Ali");

   System.out.println(emp.getId());
   System.out.println(emp.getName());



   }
}
