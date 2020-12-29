package challenges.HashTables;

import java.util.HashMap;
import java.util.List;

/*
* You are given an array and you need to find number of tripets of indices  such that the elements at those indices are in geometric progression for a given common ratio  and .
* */
public class CountTriplets {
    /*
    * Takes O(n) time complexity
    * */
    static long countTriplets(List<Long> arr, long r){
        HashMap<Long,Long> prev = new HashMap();
        HashMap<Long,Long> next = new HashMap();
        long sum = 0L;
        //transfer all items of the arr into next hashmap with their frequencies
        for(long a:arr){
            next.put(a,next.getOrDefault(a,0L)+1);
        }
        //iterate through the array
        for(int i=0;i<arr.size();i++){
            long current = arr.get(i);
            long right_count = 0;
            long left_count = 0;
            //subtract the frequency of the next hashmap
            next.put(current,next.getOrDefault(current,0L)-1);
            //check a/r
            if(prev.containsKey(current/r) && current%r==0){
                left_count = prev.get(current/r);
            }
            //check ar
            if(next.containsKey(current*r)){
                right_count = next.get(current*r);
            }
            sum += right_count * left_count;
            prev.put(current,prev.getOrDefault(current,0L)+1);
        }

        return sum;
    }
}
