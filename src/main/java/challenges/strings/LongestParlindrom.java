package challenges.strings;

public class LongestParlindrom {
    /*
    * Optimal solution
    * Takes O(n) time complexity and O(1) space complexity
    * */
    static String longestPalindrome(String s){
        StringBuilder longest_palindrom = new StringBuilder();
        int length = s.length();
        if (length == 0){
            return "";
        }else if (length == 1){
            return s;
        }
        else if (length == 2 && s.charAt(0) != s.charAt(1)){
            return ""+s.charAt(0);
        }
        for(int i = 0;i< length -2;i++){
            //second case
            if (s.charAt(i) == s.charAt(i+2)){
                longest_palindrom.append(s.charAt(i));
                longest_palindrom.append(s.charAt(i + 1));
                longest_palindrom.append(s.charAt(i + 2));
                break;
            }
            //third case
            if (s.charAt(i) == s.charAt(i+1) && s.length() > 2){
                longest_palindrom.append(s.charAt(i));
                longest_palindrom.append(s.charAt(i + 1));
                break;
            }
        }
        return longest_palindrom.toString();
    }

    public static void main(String[] args) {
        //first test case
        String s = "babad";
        String longestPalindrom = longestPalindrome(s);
        System.out.println(longestPalindrom);

        // second test case
        String s1 = "cbbd";
        String longestPalindrom1 = longestPalindrome(s1);
        System.out.println(longestPalindrom1);

        //third test case
        String s2 = "a";
        String longestPalindrom2 = longestPalindrome(s2);
        System.out.println(longestPalindrom2);
        //fourth test case
        String s3 = "ac";
        String longestPalindrom3 = longestPalindrome(s3);
        System.out.println(longestPalindrom3);
    }
}
