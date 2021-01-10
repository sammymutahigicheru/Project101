package challenges.strings;

import java.util.*;

public class SherlockAndValidString {
    static String isValid(String s) {
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
