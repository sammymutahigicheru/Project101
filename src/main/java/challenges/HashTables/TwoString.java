package challenges.HashTables;

import java.util.HashMap;

/*
 * Given two strings, determine if they share a common substring.
 * A substring may be as small as one character.
 * */
public class TwoString {
    static String twoStrings(String s1, String s2) {
        //constraints
        if ((s1.length() < 1) || (s2.length() < 1) || (s1.length() > 100000)
                || (s2.length() > 100000)) {
            return "NO";
        }
        HashMap<Character, Integer> hash_s1 = new HashMap();
        for (int i = 0; i < s1.length(); i++) {
            if (hash_s1.get(s2.charAt(i)) != null) {
                if (hash_s1.containsKey(s2.charAt(i))) {
                    return "YES";
                }
                hash_s1.put(s1.charAt(i), 1);
            } else {
                hash_s1.put(s1.charAt(i), 1);
            }
        }
        return "NO";
    }
}
