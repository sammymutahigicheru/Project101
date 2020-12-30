package challenges.HashTables;

import java.util.Arrays;
import java.util.HashMap;

/*
*Two strings are anagrams of each other if the letters of one string can be rearranged to form the other string.
* Given a string, find the number of pairs of substrings of the string that are anagrams of each other.
* */
public class SherlockAnagramChallenge {
    //Takes O(n) time complexity
    static int sherlockAndAnagrams(String s){
        HashMap<String,Integer> hash_map = new HashMap();
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                char[] c = s.substring(i,j+1).toCharArray();
                Arrays.sort(c);
                String k = new String(c);
                if(hash_map.containsKey(k)){
                    hash_map.put(k,hash_map.get(k)+1);
                }else{
                    hash_map.put(k,1);
                }
            }
        }
        int anagramPairs = 0;
        for(String k:hash_map.keySet()){
            int v = hash_map.get(k);
            anagramPairs += (v * (v-1))/2;
        }

        return anagramPairs;
    }
}
