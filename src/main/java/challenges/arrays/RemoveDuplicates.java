package challenges.arrays;

/*
* Remove All Duplicates From a given array
*
* */
public class RemoveDuplicates {
    /*
    * Takes O(n) time complexity
    * and
    * O(n) space complexity
    *
    *
    * */
    public int removeAllDuplicates(int[] input) {
        int targetIndex = 1;
        int noDuplicates = input[0];
        for (int i = 1; i < input.length; i++) {
            if (input[i] != noDuplicates) {
                noDuplicates = input[i];
                input[targetIndex] = input[i];
                targetIndex++;
            }
        }
        return targetIndex;
    }
}
