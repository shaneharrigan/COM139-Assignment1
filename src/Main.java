//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Create example array
        int [][] array = new int[][] { {1,8,3}, {-7,5,2}, {4,0,2} };

        // Print max and min
        System.out.println("Array max = " + array2DMax(array));
        System.out.println("Array min = " + array2DMin(array));

        // Print row 0 sum and column 2 sum from arr2d.
        System.out.println("\nRow 0 sum = " + rowSum(array,0));
        System.out.println("Col 2 sum = " + colSum(array,2));

        // Get all row sums and all col sums and print
        int [] rowsum = allRowSums(array);
        int [] colsum = allColSums(array);

        System.out.print("\nAll rows sums = [");
        for(int i = 0; i < rowsum.length; i++)
            System.out.print(rowsum[i]+" ");
        System.out.print("]\n");

        System.out.print("All cols sums = [");
        for(int i = 0; i < colsum.length; i++)
            System.out.print(colsum[i]+" ");
        System.out.print("]\n");

        // Test row magic and col magic arrays
        int [][] rowmagic = new int[][] { {1,2,3}, {-1,5,2}, {4,0,2} };
        int [][] colmagic = new int[][] { {1,-1,4,10}, {3,5,0,-6} };

        System.out.println("\nCheck row magic array");
        System.out.println("Row magic = " + isRowMagic(rowmagic));
        System.out.println("Col magic = " + isColMagic(rowmagic));

        System.out.println("\nCheck col magic array");
        System.out.println("Row magic = " + isRowMagic(colmagic));
        System.out.println("Col magic = " + isColMagic(colmagic));

        // Test row even sum increasing and col odd sum decreasing arrays
        int [][] arrayIncDec = new int[][] { {1,-2,3}, {7,5,2}, {4,0,2} };
        System.out.println("\nCheck row even sum increasing array");
        System.out.println("array = " + isRowEvenInc(arrayIncDec));

        System.out.println("\nCheck col odd sum decreasing array");
        System.out.println("array = " + isColOddDec(arrayIncDec));
    }
    public static int array2DMax(int[][] a) {

        // Q1. Complete this method
        // Returns int maximum value in passed 2d array a.
        // Solution should work for any 2d array.

        //int [][] array = new int[][] { {1,8,3}, {-7,5,2}, {4,0,2} };

        int max=a[0][0];
        for (int i=0; i<a.length; i++)
        {
            for (int j=0; j<a[0].length; j++)
            {
                if(a[i][j]>max)
                {
                    max=a[i][j];
                }
            }
        }


        return max;

        //return 0; // return your own value here
    }
    public static int array2DMin(int[][] a) {

        // Q1. Complete this method
        // Returns int minimum value in passed 2d array a.
        // Solution should work for any 2d array.

        //int [][] array = new int[][] { {1,8,3}, {-7,5,2}, {4,0,2} };

        int min = a[0][0];

        for(int i=0;i<a.length;i++){

            for(int j=0;j<a[0].length;j++)

                if(a[i][j] < min){

                    min = a[i][j];
                }
        }

        return min;

        //return 0; // return your own value here
    }
    public static int rowSum(int[][] a, int x)  {

        // Q2. Complete this method
        // Returns int sum of row x in passed 2d array a.
        // Solution should work for any 2d array.

        return 0; // return your own value here
    }
    public static int colSum(int[][] a, int x) {

        // Q2. Complete this method
        // Returns int sum or of col x in passed 2d array a.
        // Solution should work for any 2d array.

        return 0; // return your own value here
    }
    public static int[] allRowSums(int[][] a){

        // Q3. Complete this method
        // Returns int[] 1D array corresponding to every row sum in 2d array a.
        // Solution should work for any 2d array.

        int[] val={0};
        return val; // return your own value here
    }
    public static int[] allColSums(int[][] a){

        // Q4. Complete this method
        // Returns int[] 1D array corresponding to every col sum in 2d array a.
        // Solution should work for any 2d array.

        int[] val={0};
        return val; // return your own value here
    }
    public static boolean isRowMagic(int[][] a){

        // Q5. Complete this method
        // Returns true if array is row magic - otherwise return false.
        // Solution should work for any 2d array.

        return false; // return your own value here
    }
    public static boolean isColMagic(int[][] a){

        // Q6. Complete this method
        // Returns true if array is col magic - otherwise return false.
        // Solution should work for any 2d array.

        return false; // return your own value here
    }
    public static boolean isRowEvenInc(int[][] a){

        // Q7. Complete this method
        // Returns true if array is row sum evens increasing - otherwise return false.
        // Solution should work for any 2d array.

        return false; // return your own value here
    }
    public static boolean isColOddDec(int[][] a){

        // Q8. Complete this method
        // Returns true if array is col sum odds decreasing - otherwise return false.
        // Solution should work for any 2d array.

        return false; // return your own value here
    }

    // Helper methods - you can include your own helper methods here
    //
    //

}