package challenges.arrays;

import java.util.HashMap;
import java.util.Map;

/*
* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
* */
public class TwoSumSolution {
    /*
     * A brute force solution
     * Takes O(n^2) time complexity
     * and
     * O(1) space complexity
     *
     * */
    int[] indexes = new int[2];

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) { //two pointer
                if (nums[j] == target - nums[i]) {
                    indexes[0] = i;
                    indexes[1] = j;
                }

            }

        }
        return indexes;

    }
   /*
   * Solution 2
   * Optimal Solution
   * O(n) time complexity
   * O(n) space complexity
   *
   * */
    Map<Integer,Integer> map = new HashMap<>();
    public int[] twoSumHashTable(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i); //store all elements in the array
        }
        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement) && map.get(complement) != i){ //lookup takes O(1) time complexity assuming there is no collision
                return new int[]{i,map.get(complement)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");

    }
}
