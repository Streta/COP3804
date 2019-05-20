/*********************************************************************
 Author    : Roosevelt Mendieta
 Course    : COP-3804
 Professor : Michael Robinson 
 Program # : Program One 

 Due Date  : 05/13/2019 
Program Purpose:  
1 - Create a 15 x 15 two dimensional array of int data type
2 - Load each index in the array with the addition of each (row + column)*3 location
3 - Using System.out.printf display the content of each index, ALIGNED. 
4 - Create an algorithm that will add all the odd values in all (x,y) locations,
    display the values of all odd locations and display 3 spaces in all even locations
    at the end display the total of all odd values
    leave blank spaces for all other location, display results, ALIGNED. 
5 - Create an algorithm that will add all the even values in all (x,y) locations, 
    leave blank spaces for all other location, display results, ALIGNED. 
    display the values of all even locations and display 3 spaces in all odd locations
    at the end display the total of all even values
6 - Create an algorithm that will add all the values in all locations,  display results

 Certification: 
 I hereby certify that this work is my own and none of it is the work of any other person. 

 ..........{ Roosevelt.Mendieta }..........
*********************************************************************/

public class mendietaRpgm1
{
    public static void arrays( int array[][] )
    {
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length; j++)
            {
                array[i][j] = (i + j) * 3;
            }
        }
    }

    public static void printOut(int[][] inputArray)
    {
        for(int x = 0; x < inputArray.length; x++)
        {
            for(int y = 0; y < inputArray.length; y++)
            {
                System.out.printf("%3d", inputArray[x][y]);
            }
            System.out.printf("\n");
        }
    }

    public static void printOdd(int[][] inputArray)
    {
        int oddCounter = 0;

        for(int x = 0; x < inputArray.length; x++)
        {
            for(int y = 0; y < inputArray.length; y++)
            {
                if((inputArray[x][y] % 2) != 0)
                {
                    System.out.printf("%3d", inputArray[x][y]);
                    oddCounter += inputArray[x][y];
                }
                else
                {
                    String space = "   ";
                    System.out.printf("%s", space);
                }
            }
            System.out.printf("\n");
        }
        System.out.printf("\nTotal value of odd numbers: %d\n", oddCounter);
    }

    public static void printEven(int[][] inputArray)
    {
        int evenCounter = 0;

        for(int x = 0; x < inputArray.length; x++)
        {
            for(int y = 0; y < inputArray.length; y++)
            {
                if((inputArray[x][y] % 2) == 0)
                {
                    System.out.printf("%3d", inputArray[x][y]);
                    evenCounter += inputArray[x][y];
                }
                else
                {
                    String space = "   ";
                    System.out.printf("%s", space);
                }
            }
            System.out.printf("\n");
        }
        System.out.printf("\nTotal value of even numbers: %d\n", evenCounter);
    }

    public static void printAll(int[][] inputArray)
    {
        int total = 0;

        for(int x = 0; x < inputArray.length; x++)
        {
            for(int y = 0; y < inputArray.length; y++)
            {
                total += inputArray[x][y];
            }
        }
        System.out.printf("\nTotal values of all numbers: %d\n", total);
    }
    public static void main( String args[] )
    {
        int array[][] = new int[15][15];
        arrays(array);

        printOut(array);
        printOdd(array);
        printEven(array);
        printAll(array);
    }
}