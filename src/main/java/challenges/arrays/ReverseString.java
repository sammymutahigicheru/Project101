package challenges.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
* Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
* */
public class ReverseString {
    static String reverse(String s){
        String reversed = "";
        String[] stringArray = s.trim().split("\\s+");
        for (int i=stringArray.length-1;i>=0;i--){
            reversed += stringArray[i]+ " ";
        }
        return reversed;
    }

    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverse(s));
    }
}
