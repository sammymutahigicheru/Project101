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
        StringBuilder stringBuilder = new StringBuilder();
        long count = 0;
        for (int i=0;i<n;i++){
            stringBuilder.append(s.charAt(i));
            count++;
        }
        for (int i = 0;i<n-1;i++){
            if (s.charAt(i) == s.charAt(i+1)){
                stringBuilder.append(s,i,i+1);
                count++;
            }
        }
        for (int i=0;i<n-2;i++){
            if (s.charAt(i) == s.charAt(i+2)){
                stringBuilder.append(s, i, i+2);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "aaaa";
        long count = substrCount(4,s);
        System.out.println(count);
    }
}
