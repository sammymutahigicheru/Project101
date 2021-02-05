package crackingcodinginterview;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringPermutationTest{
    private StringPermutation stringPermutation;
    @Before
    public void setUp(){
       stringPermutation = new StringPermutation();
    }
    @Test
    public void compareStringPermutations_ReturnsTrue(){
        Assert.assertTrue(stringPermutation.isPermutation("pale","pales"));
    }
    @Test
    public void compareFakeStringpermutation_ReturnsFalse(){
        Assert.assertFalse(stringPermutation.isPermutation("pale","paless"));
    }

}