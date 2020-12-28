package challenges.HashTables;

import java.util.HashMap;

/*
* Harold is a kidnapper who wrote a ransom note, but now he is worried it will be traced back to him through his handwriting. He found a magazine and wants to know if he can cut out whole words from it and use them to create an untraceable replica of his ransom note. The words in his note are case-sensitive and he must use only whole words available in the magazine. He cannot use substrings or concatenation to create the words he needs.

Given the words in the magazine and the words in the ransom note, print Yes if he can replicate his ransom note exactly using whole words from the magazine; otherwise, print No.

For example, the note is "Attack at dawn". The magazine contains only "attack at dawn". The magazine has all the right words, but there's a case mismatch. The answer is No.
*
* */
public class RansomNotes {
    /*
    * Takes O(m+n) time complexity
    * */
    static void checkMagazine(String[] magazine, String[] note) {
        //first constraint
        if((magazine.length == 0 || note.length == 0) ||
                (magazine.length > 30000 || note.length > 30000) ){
            System.out.println("No");
            return;
        }
        HashMap<String,Integer> magazineWords = new HashMap();
        for(int i=0;i<magazine.length;i++){
            if(magazineWords.get(magazine[i]) != null){
                int count = magazineWords.get(magazine[i]);
                magazineWords.put(magazine[i],++count);
            }else{
                magazineWords.put(magazine[i],1);
            }
        }
        for(int j=0;j<note.length;j++){
            if(magazineWords.get(note[j]) == null){
                System.out.println("No");
                return;
            }else if(magazineWords.get(note[j]) != null){
                int count = magazineWords.get(note[j]);
                if(magazineWords.get(note[j]) > 0){
                    magazineWords.put(note[j],--count);
                }else{
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }
}
