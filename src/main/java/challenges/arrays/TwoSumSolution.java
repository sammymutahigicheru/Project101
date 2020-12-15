package challenges.arrays;

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
}
