/* ****************** Access Modifiers In Java *********************
Are the keywords that can be used to control the visibility of fields methods etc.
    Modifier    Class   Package     Subclass    world     SubClass (same Pack)       
                                   (Diff.Packages)   
    public       Yes     Yes          Yes        Yes       yes
    protected    Yes     Yes          Yes        No        yes
    private      Yes     No           No         No        no
    default      Yes     Yes          No         No        yes
*/
package myJavaTutorial;
class Student{
    public int a = 2;
    protected int b = 3;
    int c = 4;
    private int d = 5;

    public void display()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
public class AccessModifiers {
    public static void main(String[] args) {
        Student std = new Student();
        // std.display();
        System.out.println(std.a);
        System.out.println(std.b);
        System.out.println(std.c);
        // System.out.println(std.d);
    }
}
