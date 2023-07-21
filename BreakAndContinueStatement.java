/***************Break and Continue Keywords**************************
Break:
Stops the entire process of the loop
Continue:
only stops the current iteration of the loop
*/
public class BreakAndContinueStatement {
    public static void main(String[] args) {
        // for(int i =0; i<10; i++)
        // {
        //     System.out.println(i);
        //     System.out.println("Loop Ka Jalwa");
        //     if(i==4)
        //     {
        //         break;
        //     }
        // }
        // System.out.println("End Of Loop");

        // Continue
        // for(int i = 0; i < 5; i++)
        // {
        //     if(i==3)
        //     {
        //         continue;
        //     }
        //     System.out.println(i);
        //     System.out.println("Me Loop Hoon");
        // }

        // while
        // int i = 0;
        // while(i<10)
        // {
        //     System.out.println(i);
        //     if(i==7)
        //     {
        //         break;
        //     }
        //     i++;
        // }

      bahar:  for(int i = 1; i<=3; i++)  //outer loop
        {
            //INNER LOOP
          andar:  for(int j = 1; j<=3; j++)
            {
                if(i==2&&j==2)
                {
                    break bahar;
                }
                System.out.println(i + " " + j);
            }
        }
      
    }
}
