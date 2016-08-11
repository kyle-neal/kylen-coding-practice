package test.java;

import static org.junit.Assert.*;
import org.junit.*;
import main.java.util.BinaryTree;

public class BinaryTreeTests {
    //Tests
    @Test
    public void test345() {
        BinaryTree tree = new BinaryTree();
        tree.add(3);
        tree.add(4);
        tree.add(5);
        assertEquals("[null,3,[null,4,[null,5,null]]]", tree.toString());
    }

    @Test
    public void test453() {
        BinaryTree tree = new BinaryTree();
        tree.add(4);
        tree.add(5);
        tree.add(3);
        assertEquals("[[null,3,null],4,[null,5,null]]", tree.toString());
    }
}