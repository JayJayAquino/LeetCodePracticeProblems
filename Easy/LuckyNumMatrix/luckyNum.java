// Given a m * n matrix of distinct numbers,
// return all lucky numbers in the matrix in any order.
// A lucky number is an element of the matrix such that
// it is the minimum element in its row and maximum in its column.

import java.util.*;

public class luckyNum {

    
    public static void main(String [] args)
    {
        int [][] test1 = {
            {3,7,8},
            {9,11,13},
            {15,16,17}
        };

        int [][] test2 = {
            {1,10,4,2},
            {9,3,8,7},
            {15,16,17,12}
        };

        int[][] test3 = {
            {7,8},
            {1,2}
        };

        System.out.println("LuckyNums");
        System.out.println(luckyNumbers(test1));
        System.out.println(luckyNumbers(test2));
        System.out.println(luckyNumbers(test3));

  
    }

    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> luckyNums = new ArrayList<Integer>();
        int rowPos, min, max, CurPos;
        boolean isLucky;

       

        for(int i=0; i < matrix.length; i++){
            //init vals
            min = matrix[i][0];
            rowPos = 0;
            max = min;
            isLucky = true;

            //find min in row
            for(int j=0; j < matrix[i].length; j++){
                if (matrix[i][j] < min){
                    min = matrix[i][j];
                    rowPos = j;
                }
            }

            //see if min is also max in column
            for(int k=0; k < matrix.length; k++){
                max = min;
                if(max < matrix[k][rowPos] ){
                    isLucky = false;
                }
            }

            if(isLucky) luckyNums.add(max);
        }
        return luckyNums;
    }

}