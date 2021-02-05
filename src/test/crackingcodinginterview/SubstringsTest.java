package crackingcodinginterview;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SubstringsTest{
    private Substrings substrings;
    @Before
    public void setUp(){
        substrings = new Substrings();
    }
    @Test
    public void checkIfS1IsSubstringOfs2_ReturnTrue(){
        Assert.assertTrue(substrings.isRotational("waterbottle","erbottlewat"));
    }
    @Test
    public void checkIfWrongRotation_ReturnsFalse(){
        Assert.assertFalse(substrings.isRotational("waterbottle","myssa"));
    }

}