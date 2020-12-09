package challenges;

/*
* The purpose of this challenge is to show the understanding of 2D arrays
*
*
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
                //get the sum
                int current_hour_glass_sum = arr[i][j] + arr[i][j+1] + arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                //get the max sum
                max_hour_glass_sum = Math.max(max_hour_glass_sum,current_hour_glass_sum);
            }
        }
        return max_hour_glass_sum;

    }
}
