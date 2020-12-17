package challenges.arrays;
/*
* Find max and Min Value in a given array
* */
public class FindMaxMinValues {
    /*
    * Takes O(n) time complexity
    * and
    * O(n) space complexity
    * */
    static void findMaxMinValue(int[] input){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i=0;i<input.length;i++){
            if(input[i]>max){
                max = input[i];
            }else if(input[i]<min){
                min = input[i];
            }
        }
        System.out.println("Maximum value is => "+max);
        System.out.println("**************************");
        System.out.println("Minimum value is => "+min);
    }

    public static void main(String[] args) {
        findMaxMinValue(new int[]{-20, 34, 21, -87, 92});
    }
}
