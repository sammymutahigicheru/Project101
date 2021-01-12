package challenges.strings;

import java.util.HashMap;


/*
* A string is said to be a child of a another string if it can be formed by deleting 0 or more characters from the other string. Given two strings of equal length, what's the longest string that can be constructed such that it is a child of both?

For example, ABCD and ABDC have two children with maximum length 3, ABC and ABD. They can be formed by eliminating either the D or C from both strings. Note that we will not consider ABCD as a common child because we can't rearrange characters and ABCD  ABDC.
*
*
* */

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
