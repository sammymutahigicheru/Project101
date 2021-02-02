package crackingcodinginterview;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SpecialCharactersInAStringTest{

    private SpecialCharactersInAString specialCharactersInAString;
    private String correct_input = "Alive*is*Awesome$";
    private String fake_input = "AliveisAwesome";


    @Before
    public void setUp(){
        specialCharactersInAString = new SpecialCharactersInAString();
    }

    @Test
    public void inputAStringWithSpecialCharacters_OutPutTrue(){
        Assert.assertTrue(specialCharactersInAString.containsSpecialString(correct_input));
    }
    @Test
    public void inputStringWithoutSpecialCharacters_ReturnsFalse(){
        Assert.assertFalse(specialCharactersInAString.containsSpecialString(fake_input));
    }
    @Test
    public void inputEmptyString_ReturnsFalse(){
        Assert.assertFalse(specialCharactersInAString.containsSpecialString(""));
    }
}