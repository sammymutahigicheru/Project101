package challenges.strings;

import java.util.HashMap;

public class CommonChild {
    /*
    * Takes O(n*m) time complexity
    * Takes O(n) space complexity
    *
    * */
    static int commonChild(String s1, String s2) {
        int n = s1.length();
        int[] memo = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int prev = 0;
            for (int j = 1; j <= n; j++) {
                int temp = memo[j];
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    memo[j] = prev + 1;
                } else {
                    memo[j] = Math.max(memo[j], memo[j - 1]);
                }
                prev = temp;
            }

        }
        return memo[n];
    }
}
