package challenges.arrays;

public class MinimumSwaps {
    /*
    * Brute force solution
    * O(n) time complexity
    * O(1) space complexity
    * */
    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int swaps = 0;
        for(int i=q.length-1;i>=0;i--){
            if(q[i] != i+1){
                if((i-1)>=0 && q[i-1] == i+1){
                    int temp = q[i-1];
                    q[i-1] = q[i];
                    q[i] = temp;
                    swaps++;
                }else if((i-2)>=0 && q[i-2]==i+1){
                    q[i-2] = q[i-1];
                    q[i-1]=q[i];
                    q[i] = q[1-2];
                    swaps += 2;
                }else{
                    System.out.println("Too chaotic");
                    return;
                }
            }
        }
        System.out.println(swaps);

    }
}
