public class ForEachLoop {
   public static void main(String[] args) {
    System.out.println("Traversing an Elements of an Array");
    String [] firstName = {"Farzeen","Nabiha","Tehreem","KuchBhi","Huzaifa"};

    // // System.out.println(firstName[1]);
    // for(int i = 0; i < firstName.length; i++) //length = 5
    // {
    //     System.out.println("The Elements Are: " + firstName[i]);
    // }
    // System.out.println("The Elements After Reversing: ");
    // for(int i =  firstName.length - 1; i>=0; i--)
    // {
    //     System.out.println("The Elements Are on "+ i + " index is: " + firstName[i]);
    // }

        // For Each Loop
        System.out.println("Using For Each Loop");
        for(String element: firstName)
        {
           System.out.println(element); 
        }
   } 
}