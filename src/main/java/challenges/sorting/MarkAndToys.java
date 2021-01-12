package challenges.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MarkAndToys {

    static int maximumToys(int[] prices, int k) {
        Arrays.sort(prices);
        int sum = 0;
        int count = -1;
        for (int i = 0; i < prices.length; i++) {
            if(sum <= k){
                sum += prices[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,12,5,111,200,1000,10};
        int max = maximumToys(arr,50);
        System.out.println(max);
    }
}
