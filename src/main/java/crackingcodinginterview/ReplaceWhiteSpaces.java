package crackingcodinginterview;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
* Replace All white spaces with %20
*
* */
public class ReplaceWhiteSpaces {
    String replaceString(String s){
        Pattern pattern = Pattern.compile("\\s");
        Matcher matcher = pattern.matcher(s);
        return matcher.replaceAll("%20");
    }
}
