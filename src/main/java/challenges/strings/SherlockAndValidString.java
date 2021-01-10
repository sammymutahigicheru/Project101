package challenges.strings;

import java.util.*;

/*
*
* Sherlock considers a string to be valid if all characters of the string appear the same number of times.
* It is also valid if he can remove just  character at  index in the string, and the remaining characters will occur the same number of times.
* Given a string s, determine if it is valid. If so, return YES, otherwise return NO.
*
* */

public class SherlockAndValidString {
    static String isValid(String s) {
        //Takes O(m+n) time complexity and O(n) space complexity
        HashMap<Character, Integer> count = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            if (count.containsKey(s.charAt(i))) {
                count.replace(s.charAt(i), count.get(s.charAt(i)) + 1); //frequencies
            } else {
                count.put(s.charAt(i), 1);
            }

        }
        HashSet<Integer> hashSet = new HashSet(count.values());
        if (hashSet.size() == 1){
            return "YES";
        }else{
            ArrayList<Integer> list = new ArrayList(count.values());
            int max = Collections.max(list);
            int min = Collections.min(list);
            int maxc = 0;
            int minc = 0;
            for (int i=0;i<list.size();i++){
                if (list.get(i) == max){
                    maxc++;
                }else if (list.get(i)==min){
                    min++;
                }
            }
            if (minc == maxc){
                return "NO";
            }
            if (minc == 1 || (maxc == 1) && (max - min)==1 ){
                return "YES";
            }
        }
        return "NO";
    }
}
