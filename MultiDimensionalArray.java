/********************MultiDimensional Array****************************
An Array of Arrays.
Each Element of a multidimensional array is an array itself.
It is useful when you want to store data as a tabular form, like table with rows and columns
e.g:
1D array
2D array
3D array
.
.
.
nD array
*******************2D Array******************************
                            (rows)(columns)
int [][] arrayName = new int[2][3];
arrayName[0][0] = 100;
arrayName[0][1] = 200;
arrayName[0][2] = 300;
arrayName[1][0] = 400;
arrayName[1][1] = 500;
arrayName[1][2] = 600;

*************2D Array Visualization*******************
            column 1         column 2         column 3               
row 1-->  arrayName[0][0]  arrayName[0][1]  arrayName[0][2] 

row 2-->  arrayName[1][0]  arrayName[1][1]  arrayName[1][2]
*/
// import java.util.Scanner;
public class MultiDimensionalArray {
       public static void main(String[] args) {
        int [][] arrayName = new int[2][3];
        arrayName[0][0] = 100;
        arrayName[0][1] = 200;
        arrayName[0][2] = 300;
        arrayName[1][0] = 400;
        arrayName[1][1] = 500;
        arrayName[1][2] = 600;

        // System.out.println(arrayName[0].length);

        // Scanner sc = new Scanner(System.in);

        // for(int i = 0; i < arrayName.length; i++)//length-2(row)
        // {
        //     for(int j = 0; j < arrayName[i].length; j++)//length-3(column)
        //     {
        //         arrayName[i][j] = sc.nextInt();
        //     }
        // }

        // for(int i = 0; i < arrayName.length; i++)//length-2(row)
        // {
        //     for(int j = 0; j < arrayName[i].length; j++)//length-3(column)
        //     {
        //         System.out.print(arrayName[i][j]);
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }

        //using foreach loop
        for(int[] innerArray : arrayName)
        {
            for(int data : innerArray)
            {
                System.out.println(data);
            }
        }

            // Second Program
            // int [][] age = {
            //     {20,22,24},
            //     {30,32,34,36},
            //     {55}
            // };

            // for(int i = 0; i < age.length; i++)
            // {
            //    for(int j = 0; j < age[i].length; j++) 
            //    {
            //     System.out.println(age[i][j]);
            //    }
            // }

                // 3D Array
            // int [][][] arr = {
            //     {
            //        {1,2,3,4},{5,6,7,8},{9,10,11,12}
            //     },
            //     {
            //         {13,14,15,16},{17,18,19,20},{21,22,23,24}
            //     }
            // };

            
            // for(int i = 0; i<2; i++)
            // {
            //     for(int j = 0; j<3; j++)
            //     {
            //         for(int k = 0; k<4; k++)
            //         {
            //             System.out.println("arr[" + i + "][" + j + "][" + k + "] = " + arr[i][j][k]);
            //         }
            //     }
            // }
       }
}
