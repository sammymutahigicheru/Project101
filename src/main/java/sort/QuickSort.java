package sort;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    /*
    * Takes O(n log n) time complexity
    *
    * */
    public void quickSort(int[] A){
        quickSort(A,0,A.length-1);
    }

    private void quickSort(int[] a, int low, int high) {
        if (low < high+1){
            int p = partition(a,low,high);
            //left
            quickSort(a,low,p-1);
            //right
            quickSort(a,p+1,high);
        }
    }

    private void swap(int[] A,int index1,int index2){
        int temp = A[index1];
        A[index1] = A[index2];
        A[index2] = temp;
    }
    //return random pivot between low and high
    private int getPivot(int low,int high){
        Random random = new Random();
        return random.nextInt((high-low)+1)+low;
    }

    private int partition(int[] A, int low, int high) {
        swap(A,low,getPivot(low,high));
        int border = low + 1;
        for (int i=border;i<=high;i++){
            if (A[i]<A[low]){
                swap(A,i,border++);
            }
        }
        swap(A,low,border-1);
        return border -1;
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] a = {9,0,1,3,4,5,2,9,8,7,6,5,9,1,0,9};
        quickSort.quickSort(a);
        System.out.println(Arrays.toString(a));
    }
}
