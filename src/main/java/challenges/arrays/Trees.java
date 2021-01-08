package challenges.arrays;

import java.util.Arrays;
import java.util.Collections;

public class Trees {
    static int treesCount(Integer[] arr){
       int count = 0;
       int max = Collections.max(Arrays.asList(arr));
       int min = Collections.min(Arrays.asList(arr));
       int difference = max - min;
       for (int j=0;j<arr.length;j++){
           if(arr[j] != difference){
               arr[j] = difference;
               count++;
           }
       }
       return count;
    }

    public static void main(String[] args) {
        Integer[] arr = {1,2,2,4};
        int min = treesCount(arr);
        System.out.println(min);
    }
}
