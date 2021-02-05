package crackingcodinginterview;


public class Substrings {
    boolean isRotational(String s1,String s2){
       String s3 = s1+s1;
       if (s3.contains(s2)){
           return true;
       }else{
           return false;
       }
    }
}
