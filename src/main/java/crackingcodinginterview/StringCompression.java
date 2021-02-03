package crackingcodinginterview;

/*
*
* Compress String eg aabccccdaaa = a2b1c4d1a3
*
* */
public class StringCompression {
    private final StringBuilder stringBuilder = new StringBuilder();
    private int count = 1;
    String compressString(String s){

        for (int i=0;i<s.length();i++){

            if ( i+1<s.length()&&s.charAt(i) == s.charAt(i+1) ){
                count++;
            }else{
                stringBuilder.append(s.charAt(i)).append(count);
                count = 1;
            }
        }
        return stringBuilder.toString();
    }
}
