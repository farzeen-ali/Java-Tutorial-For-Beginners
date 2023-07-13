/* 
******************Precedence & Associativity**************
Precedence: priority for grouping different types of operators with their operands
Associativity: left to right or right to left order for grouping operands to operators that have the same precedence

**********Table For Precedence & Associativity*****************
     Operator         Precedence           Associativity
     !,++,--           10000                 right -> left
     *,/,%             1000                  left -> right
     +,-               100                   left -> right
     <,>,<=,>=         10                    left -> right
     ==,!=             1                     left -> right
*/

public class PrecedenceAndAssociativity {
    public static void main(String[] args) {
        System.out.println("Precedence And Associativity");
        // int result = 2 * 4/2;
        // int result = 16 / 4*2;
        int result = 2*2 + 4*4 - 2/2;
        /*
         4 + 16 - 2/2
         4 + 16 - 1
         20 - 1
         19
         */
        System.out.println(result);
    }
}
