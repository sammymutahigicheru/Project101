package challenges.strings;

/*
* A string is said to be a special string if either of two conditions is met:

All of the characters are the same, e.g. aaa.
All characters except the middle one are the same, e.g. aadaa.
A special substring is any substring of a string which meets one of those criteria.
* Given a string, determine how many special substrings can be formed from it.
*
* */

public class SpecialStringAgain {
    // Brute force solution
    static long substrCount(int n, String s) {
        long ans = n;
        for (int i = 0; i < n; i++) {
            int repeat = 0;
            while (i + 1 < n && s.charAt(i) == s.charAt(i + 1)) {
                repeat++;
                i++;
            }
            ans += (repeat * (repeat + 1)) / 2;
            int pointer = 1;
            while (i - pointer >= 0 && i + pointer < n
                    && s.charAt(i + pointer) == s.charAt(i - 1)
                    && s.charAt(i - pointer) == s.charAt(i - 1)) {
                ans++;
                pointer++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "aaaa";
        long count = substrCount(4, s);
        System.out.println(count);
    }
}
