package challenges.strings;

/*
* A student is taking a cryptography class and has found anagrams to be very useful. Two strings are anagrams of each other if the first string's letters can be rearranged to form the second string. In other words, both strings must contain the same exact letters in the same exact frequency. For example, bacdc and dcbac are anagrams, but bacdc and dcbad are not.

The student decides on an encryption scheme that involves two large strings. The encryption is dependent on the minimum number of character deletions required to make the two strings anagrams. Determine this number.

Given two strings, a  and b , that may or may not be of the same length, determine the minimum number of character deletions required to make  and  anagrams. Any characters can be deleted from either of the strings.
*
*
* */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MakeAnagrams {
    //Takes O(m+n) time complexity
    static int makeAnagram(String a, String b){
        HashMap<Character,Integer> count = new HashMap();

        for(char ch: a.toCharArray()){
            int ct = count.containsKey(ch)?count.get(ch) : 0;
            count.put(ch,(ct + 1));
        }
        for(char ch: b.toCharArray()){
            int ct = count.containsKey(ch) ? count.get(ch) : 0;
            count.put(ch,(ct - 1));
        }
        List<Integer> value = new ArrayList(count.values());
        int total = 0;
        for(int v: value){
            total += Math.abs(v);
        }
        return total;
    }
}
