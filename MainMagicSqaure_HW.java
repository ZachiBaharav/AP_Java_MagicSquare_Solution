/*

Idea from Mr. Paley, AP-CS Gunn HS.

A magic square is an nxn array of squares which has the following properties:
Each integer from 1 to n^2 appears in the array exactly once; and
The sum of each row is equal to the sum of each column is equal to the sum of each diagonal.
Here is an example of a 3x3 magic square:
2 7 6
9 5 1
4 3 8
If you add up any row, colum, or diagonal, the sum of the numbers will be 15.
Magic squares come in all sizes--they are not all 3x3.

Write the predicate isMagicSquare(int[][] square) that takes an nxn array of ints 
and returns 'true' if the array contains a magic square and 'false' otherwise. 
You may assume that the input to isMagicSquare has the same number of rows as it does columns.

isMagicSquare needs to work on ALL squares, not just the example or 3x3 squares. 

*/

public class MainMagicSqaure {
    
    
    public static void main(String[] args) 
    {

        int[][] test = { {2, 7, 6},     // Nothing wrong with this sample 3x3 array,
                {9, 5, 1},              // but isMagicSquare needs to work for ANY
                {4, 3, 8} };            // nxn array

        print2DArray(test);

        System.out.println(isMagicSquare(test));
        
        
        int[][] test2= { 
                {2,9,4},  
                {7,5,3},  
                {6,1,8} };

        print2DArray(test2);

        System.out.println(isMagicSquare(test2));

        int[][] test3= { 
                {2,9,4},  
                {7,5,4},  
                {6,1,8} };

        print2DArray(test3);

        System.out.println(isMagicSquare(test3));
    }

    
    
    public static boolean isMagicSquare(int[][] arr) 
    {
        // Find the sum of row[0]
        int sum = 0;
        for (int column = 0; column < arr[0].length; column++) {
            sum += arr[0][column];  
        }
        
        return (rowsOK(arr, sum) && colsOK(arr, sum) && diagsOK(arr, sum) && correctElements(arr));

    }
    
    public static boolean rowsOK(int[][] arr, int trueSum) {
        // ToDo: You code here
        return false; 
    }

    public static boolean colsOK(int[][] arr, int trueSum) {
        // ToDo: You code here
        return false; 
    }

    public static boolean diagsOK(int[][] arr, int trueSum) {
        // ToDo: You code here
        return false; 
    }

    public static boolean correctElements(int[][] arr) {
        // Verify that the numbers from 1 to n^2 are all in the array
        // ToDo: You code here
        return false; 
    }



    // Print utility for a 2-dimensional array of ints
    public static void print2DArray(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
