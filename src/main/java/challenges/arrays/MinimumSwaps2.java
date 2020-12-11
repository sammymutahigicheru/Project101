package challenges.arrays;

/*
* You are given an unordered array consisting of consecutive integers  [1, 2, 3, ..., n] without any duplicates.
* You are allowed to swap any two elements.
* You need to find the minimum number of swaps required to sort the array in ascending order.

For example, given the array [7 1 3 2 4 5 6]  we perform the following steps
*
* */

public class MinimumSwaps2 {
    static int minimumSwaps(int[] arr) {
        int swaps = 0;
        for(int i=arr.length-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swaps++;
                }
            }
        }
        return swaps;
    }
}
