package challenges.arrays;

/*
*Find pair with given sum in an array
* */

public class PairChallenge {
    /*
    * Takes O(n log n)
    * */
    static void findPairWithGivenSum(int[] arr,int sum){
        int low = 0;
        int high = arr.length -1;
        while(low < high){
            if (arr[low] + arr[high] == sum){
                System.out.printf("Found Pair at Index %d and %d",low,high);
                return;
            }
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 8, 7, 2, 5, 3, 1 };
        int sum = 10;
        findPairWithGivenSum(arr,sum);
    }
}
