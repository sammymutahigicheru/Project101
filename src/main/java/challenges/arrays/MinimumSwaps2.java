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
        int min_index=0;
        int min = arr[0];
        int swaps = 0;
        //update min index and min value
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min_index = i;
                min = arr[i];
            }
        }
        //swap as long as minimum index is not equal to 0
        if(min_index != 0){
            int temp = arr[0];
            arr[0] = arr[min_index];
            arr[min_index] = temp;
            swaps++;
        }
        for(int j=1;j<arr.length-1;j++){
            //calculate the position
            int pos = arr[j]-arr[0];
            while(arr[pos] != arr[j]){
                int temp = arr[pos];
                arr[pos] = arr[j];
                arr[j] = temp;
                swaps++;
                pos = arr[j]-arr[0];
            }
            j = pos;
        }
        return swaps;
    }
}
