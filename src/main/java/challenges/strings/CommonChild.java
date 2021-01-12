package challenges.strings;

import java.util.HashMap;

public class CommonChild {
    static int commonChild(String s1, String s2){
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (int i=0;i<s1.length();i++){
            if(hashMap.containsKey(s1.charAt(i))){
                hashMap.replace(s1.charAt(i),i);
            }
            hashMap.put(s1.charAt(i),i);
        }
        for (int j=0;j<s2.length();j++){
            if (hashMap.containsKey(s2.charAt(j))){
                continue;
            }else{
                hashMap.remove(s1.charAt(j));
            }
        }
        return hashMap.size();
    }
}
