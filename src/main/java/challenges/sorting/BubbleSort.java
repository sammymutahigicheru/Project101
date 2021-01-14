package challenges.sorting;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
*Count the total number of swaps needed to sort the array
* */
public class BubbleSort {
    //Takes O(n^2) time complexity and O(n) space complexity
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
        String[] data = "".split(",");
        String C = "Age";
        for (int i=0;i<data.length;i++){
            if(data[i] == C){
                BufferedReader reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream("".getBytes())));
                String line;

                while (true) {
                    try {
                        if (!((line = reader.readLine()) != null)) break;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    // b =8
    //a =4
}
