package challenges.arrays;

import java.util.HashSet;
import java.util.Set;

/*
* Find Duplicates in a given Array
*
* */
public class FindDuplicates {
    /*
    * Takes O(n^2) time complexity
    * and
    * O(n) space complexity
    *
    * */
    Set<Integer> duplicates = new HashSet<>();
    public Set<Integer> findDuplicates(int[] input){
        //a two pointer problem
        for (int i=0;i<input.length;i++){
            for(int j=1;j<input.length;j++){
                if(input[i] == input[j] && i != j){
                    duplicates.add(input[j]);
                    break;
                }
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {
        FindDuplicates testFindDuplicates = new FindDuplicates();
        int[] input = {1,2,4,5,7,3,3,4,5,3,10,8};
        System.out.println("Found Duplicates: "+testFindDuplicates.findDuplicates(input));
    }
}
