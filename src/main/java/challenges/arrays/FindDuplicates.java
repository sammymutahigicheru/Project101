package challenges.arrays;

import java.util.HashSet;
import java.util.Set;

/*
* Find Duplicates in a given Array
*
* */
public class FindDuplicates {
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
}
