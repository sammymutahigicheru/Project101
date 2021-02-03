package crackingcodinginterview;

/*
*
* Compress String eg aabccccdaaa = a2b1cccc4d1a3
*
* */
public class StringCompression {
    private StringBuilder stringBuilder = new StringBuilder();
    private int count = 1;
    String compressString(String s){

        for (int i=0;i<s.length()-1;i++){
            if (s.charAt(i) == s.charAt(i+1)){
                count++;
            }else{
                stringBuilder.append(s.charAt(i)).append(count);
                count = 1;
            }
        }
        return stringBuilder.toString();
    }
}
