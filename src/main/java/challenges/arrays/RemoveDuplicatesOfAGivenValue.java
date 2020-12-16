package challenges.arrays;
/*
* Remove duplicates of a given value element from the array
*
*
* */
public class RemoveDuplicatesOfAGivenValue {

    public int removeElement(int[] nums,int val){
        //our pointer
        int targetIndex = 0;
        for (int i=0;i<nums.length;i++){
            if(nums[i] != val){
                nums[targetIndex] = nums[i];
                targetIndex++;
            }
        }
        return targetIndex;
    }
}
