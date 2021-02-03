package crackingcodinginterview;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringCompressionTest {
    private StringCompression stringCompression;
    private String test_string1 = "aabccccaaa";
    private String test_string2 = "aabcccdaaa";
    private String fake_test_string = "aabccccdaaa";
    @Before
    public void setUp(){
        stringCompression = new StringCompression();
    }
    @Test
    public void givenAString_ReturnACompressedStringVersion(){
        Assert.assertEquals("a2b1c4a3",stringCompression.compressString(test_string1));
    }
    @Test
    public void inputString2_ReturnCompressedString(){
        Assert.assertEquals("a2b1c3d1a3",stringCompression.compressString(test_string2));
    }
    @Test
    public void inputWrongExpectation_ReturnCorrectCompressedString(){
        Assert.assertNotEquals("a2b1c3d1a3",stringCompression.compressString(fake_test_string));
    }
}