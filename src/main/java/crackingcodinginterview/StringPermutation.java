package crackingcodinginterview;

import java.util.HashMap;
import java.util.Map;

public class StringPermutation {
    private Map<Character,Integer> map = new HashMap<>();
    private int count = 0;
    boolean isPermutation(String s1,String s2) {
        for (int i=0;i<s1.length();i++){
            map.put(s1.charAt(i),i++);
        }
        for (int i=0;i<s2.length();i++){
            if (!map.containsKey(s2.charAt(i))){
                count++;
            }
        }
        return count <= 1;
    }


}
