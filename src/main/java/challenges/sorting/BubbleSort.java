package challenges.sorting;
/*
*Count the total number of swaps needed to sort the array
* */
public class BubbleSort {
    static void countSwaps(int[] a) {
        int swaps = 0;
        for(int i=0;i<a.length;i++){
            for(int j=1;j<a.length-i;j++){
                if(a[j-1]>a[j]){
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j]=temp;
                    swaps++;
                }
            }
        }
        if(swaps>=1){
            System.out.println("Array is sorted in "+swaps+" swaps.");
            System.out.println("First Element: "+a[0]);
            System.out.println("Last Element: "+a[a.length-1]);
        }else{
            System.out.println("Array is sorted in 0 swaps.");
            System.out.println("First Element: "+a[0]);
            System.out.println("Last Element: "+a[a.length-1]);
        }
    }
}
