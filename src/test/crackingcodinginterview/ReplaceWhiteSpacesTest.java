package crackingcodinginterview;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReplaceWhiteSpacesTest{
    private ReplaceWhiteSpaces replaceWhiteSpaces;
    private String test_string = "Mr John Smith   ";
    @Before
    public void setUp(){
        replaceWhiteSpaces = new ReplaceWhiteSpaces();
    }
    @Test
    public void inputStringWithWhiteSpaces_ReturnsCorrectOutput(){
        Assert.assertEquals("Mr%20John%20Smith",replaceWhiteSpaces.replaceString(test_string));
    }
}