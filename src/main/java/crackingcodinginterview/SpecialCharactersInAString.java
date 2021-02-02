package crackingcodinginterview;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
* Determine if a string has special string
* */
public class SpecialCharactersInAString {
    boolean containsSpecialString(String s){
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher = pattern.matcher(s);
        return matcher.find();
    }
}
