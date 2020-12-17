package challenges.arrays;

public class RemoveDuplicates {
    public int removeAllDuplicates(int[] input){
        int targetIndex = 0;
        int noDuplicates = input[1];
        for (int i=1;i<input.length;i++){
            if(input[i] != noDuplicates){
                noDuplicates = input[i];
                input[targetIndex] = input[i];
                targetIndex++;
            }
        }
        return targetIndex;
    }
}
