package crackingcodinginterview;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringCompressionTest {
    private StringCompression stringCompression;
    private String test_string1 = "aabccccaaa";
    @Before
    public void setUp(){
        stringCompression = new StringCompression();
    }
    @Test
    public void givenAString_ReturnACompressedStringVersion(){
        Assert.assertEquals("a2b1c4a3",stringCompression.compressString(test_string1));
    }
}