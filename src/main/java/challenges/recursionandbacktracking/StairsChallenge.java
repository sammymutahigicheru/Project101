package challenges.recursionandbacktracking;

/*
* Davis has a number of staircases in his house and he likes to climb each staircase 1 , 2, or 3 steps at a time. Being a very precocious child, he wonders how many ways there are to reach the top of the staircase.

Given the respective heights for each of the  staircases in his house, find and print the number of ways he can climb each staircase, module  on a new line.
*
* */
public class StairsChallenge {
    static int stepPerms(int n){
        int[] arr = new int[n];
        if(n == 0){
            return 0;
        }else if(n==1){
            return 1;
        }else if(n==2){
            return 2;
        }else if(n==3){
            return 4;
        }
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        for(int i=3;i<n;i++){
            arr[i] = arr[i-1] + arr[i-2]+arr[i-3];
        }

        return arr[arr.length-1];
    }
}
