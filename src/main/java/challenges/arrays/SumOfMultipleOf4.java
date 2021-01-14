package challenges.arrays;

public class SumOfMultipleOf4 {
    static int solution(int[] A){
        int sum = 0;
        for (int i=0;i<A.length;i++){
            if((A[i] % 4) == 0){
                sum += A[i];
            }
        }
        return sum;
    }
}
