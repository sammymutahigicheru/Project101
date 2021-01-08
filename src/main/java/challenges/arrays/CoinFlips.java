package challenges.arrays;

public class CoinFlips {
    static int flipCoins(int[] arr){
        int flips = 0;
        for (int i=0;i<arr.length-1;i++){
            if(arr[i] == arr[i+1]){
               flips++;
            }else{
                continue;
            }
        }
        return flips;
    }

    public static void main(String[] args) {
        //first test case
        int[] arr = {1,0,1,0,1,1};
        int flips = flipCoins(arr);
        System.out.println("The number of flips needed in Test Case 1: "+flips);

        //second test case
        int[] arr1 = {1,1,0,1,1}; //1+
        int flips1 = flipCoins(arr1);
        System.out.println("The number of flips needed in the second test case: "+flips1);

        //Third test case
        int[] arr2 = {0,1,0};
        int flips2 = flipCoins(arr2);
        System.out.println("The number of flips in the third test case: "+flips2);


    }
}
