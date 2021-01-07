package challenges.strings;

/*
* You are given a string containing characters A and B only.
*  Your task is to change it into a string such that there are no matching adjacent characters.
* To do this, you are allowed to delete zero or more characters in the string.
* Your task is to find the minimum number of required deletions.
*
* */
public class AlternatingCharacters {

    static int alternatingCharacters(String s){
        int count = 0;
        for(int i=0;i<s.length()-1;i++){ //we going up to length - 1 since we are doing characters check up to length + 1
            if(s.charAt(i) != s.charAt(i+1)){
                continue;
            }else{
                count++;
            }
        }
        return count;
    }
}
