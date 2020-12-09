package challenges.arrays;
/*
* A left rotation operation on an array shifts each of the array's elements 1 unit to the left.
* For example, if 2 left rotations are performed on array[1 2 3 4 5] , then the array would become[ 3 4 5 1 2]
 *
*
*
* */
/*
* Takes O(m+n) time complexity and O(n) space complexity
* Still a brute force solution which can be optimized further
* */
public class LeftRotationChallenge {
    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        //grab the size
        int size = a.length;
        //create array to store the index
        int[] rotated_array = new int[size];
        //initialize the index that will be handling our rotations to the number of rotations
        int rotate_index = d;
        int i = 0;
        //copy down the array starting from index == d (number of rotations)
        while(rotate_index < size){
            rotated_array[i] = a[rotate_index];
            i++;
            rotate_index++;
        }
        rotate_index = 0;
        //add the values prior to index == d to the back of the rotated_array
        while(rotate_index < d){
            rotated_array[i] = a[rotate_index];
            i++;
            rotate_index++;
        }
        return rotated_array;

    }
}
