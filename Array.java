/*****************Arrays************************
used to store multiple elements(values) in a single variable having same data type;
**********Syntax***************
Declaration:
    dataType [] arrayName;
Declaration + Memory Allocation:
    dataType [] arrayName = new dataType[size of an array];
Declaration + Initialization:
    dataType [] arrayName = {1elements,2elements,......,N-elements};
*****Array Indexes Starts from 0 and goes till (n-1) where n is the size of an array
1--->0
2--->1
3--->2
4--->3
5-->4
*/
public class Array{
    public static void main(String[] args) {
        // First Method
        // int [] age;//Declare
        // age = new int[6];//Memory Allocate
        // age[0] = 20;
        // age[1] = 30;
        // age[2] = 40;
        // age[3] = 50;
        // age[4] = 60;
        // age[5] = 70;

        // System.out.println(age[3]);
        // Second Method
        int [] marks = {55,67,45,78,88};
        System.out.println(marks[3]);

        System.out.println(marks.length);

    }
}




