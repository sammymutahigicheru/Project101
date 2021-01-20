package trees;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
class BinaryTreeTest {
    BinaryTree bt = new BinaryTree();

    @Before
    void setUp() {
        bt.createBinaryTree();
    }
    @Test
    public void givenABinaryTree_WhenAddingElements_ThenTreeContainsThoseElements(){
        assertTrue(bt.containsNode(6));
        assertTrue(bt.containsNode(4));

        assertFalse(bt.containsNode(1));
    }
}