/************************OOP Pillars***********************
4 Terminologies (Pillars) in OOP are:
1) Abstraction----> hiding internal details----> (car)
2) Encapsulation----> putting various components together in a capsule & sensitive data can be hidden from the user----> (Laptop)
3) Inheritance----> deriving new things from existing things ----> (phone->smartphone applications etc...)
4) Polymorphism----> one entity many forms----> (Me)
*/
class Student{
    int id;
    String name;
    int age;

    public void showDetails()
    {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public void sayPresent()
    {
        System.out.println("Present Sir");
    }

}
public class CustomClass {
    public static void main(String[] args) {
        System.out.println("Custom Class In Java");

        Student farzeen = new Student();
        farzeen.id = 1;
        farzeen.name = "Farzeen Ali";
        farzeen.age = 22;

        // System.out.println(farzeen.id);
        // System.out.println(farzeen.name);
        // System.out.println(farzeen.age);

        farzeen.showDetails();
        farzeen.sayPresent();

        System.out.println("-----------------");

        Student ali = new Student();
        ali.id = 2;
        ali.name = "Ali Khan";
        ali.age = 20;

        ali.showDetails();
        ali.sayPresent();
    }
}
