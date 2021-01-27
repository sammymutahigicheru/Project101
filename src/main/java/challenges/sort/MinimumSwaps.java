package challenges.sort;


import java.util.Random;

/*
* You are given an unordered array consisting of consecutive integers  [1, 2, 3, ..., n] without any duplicates.
* You are allowed to swap any two elements.
* You need to find the minimum number of swaps required to sort the array in ascending order.
*
* */
public class MinimumSwaps {
    private static int swaps = 0;
    static int minimumSwaps(int[] arr){
        quickSort(arr,0,arr.length-1);
        return swaps;
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low<high){
            int p = partition(arr,low,high);
            quickSort(arr,low,p-1);
            quickSort(arr,p+1,high);
        }
    }
    private static void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        swaps++;
    }
    private static int getPivot(int low,int high){
        Random random = new Random();
        return random.nextInt((high-low)+1)+low;
    }

    private static int partition(int[] arr, int low, int high) {
        swap(arr,low,getPivot(low,high));
        int border = low + 1;
        for (int i=border;i<=high;i++){
            if (arr[i]<arr[low]){
                swap(arr,i,border++);
            }
        }
        swap(arr,low,border-1);
        return border -1;
    }

    public static void main(String[] args) {
        MinimumSwaps minimumSwaps = new MinimumSwaps();
        int[] arr = {9,0,1,3,4,5,2,9,8,7,6,5,9,1,0,9};
        int swaps = minimumSwaps.minimumSwaps(arr);
        System.out.println(swaps);
    }
}
