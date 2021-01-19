package challenges.arrays;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReverseString {
    static String reverse(String s){
        s=s.trim();
        String []arr=s.split("\\s+");
        String ans="";
        for(String i:arr){
            ans=i+" "+ans;
            //System.out.println(ans);
        }

        return ans;
    }

    public static void main(String[] args) {
        String s = "a good   example";
       System.out.println( reverse(s));
    }
}
