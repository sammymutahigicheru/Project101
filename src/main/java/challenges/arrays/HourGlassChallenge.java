package challenges.arrays;

/*
* The purpose of this challenge is to show the understanding of 2D arrays
*
*Takes O(n^2) time complexity and O(n) space complexity
* */

public class HourGlassChallenge {
    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        //step 1,get the length of the rows and columns
        int rows = arr.length;
        int col = arr[0].length;
        //step 2,get the minimum possible integer value
        int max_hour_glass_sum = Integer.MIN_VALUE;
        //step 3,loop through the entire 2D array
        for(int i=0;i<rows-2;i++){
            for(int j = 0;j<col - 2;j++){
                /*
                * Get the sum up to the third column in first and third rows.
                * For the second row we are only interested with the 2nd column since our hour glass is illustrated as follows
                *  2 4 4
                *    2
                *  1 2 4
                *  the sum should be 19
                * */
                int current_hour_glass_sum = arr[i][j] + arr[i][j+1] + arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                /*
                *Update the max sum by comparing the sum of current hour glass and the initially stored max hour glass sum
                * */
                max_hour_glass_sum = Math.max(max_hour_glass_sum,current_hour_glass_sum);
            }
        }
        //return the maximum hour glass sum
        return max_hour_glass_sum;

    }
}
