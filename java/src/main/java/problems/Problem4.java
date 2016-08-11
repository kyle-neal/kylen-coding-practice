/*
Given a binary search tree root, count the total number of nodes in the tree.
 */

package main.java.problems;

import main.java.util.BinaryTree;
import main.java.util.Utilities;

public class Problem4 extends Problem{
    @Override
    public void solve(){
        int arr[] = Utilities.createArray(Utilities.randomNumber(100));
        BinaryTree tree = new BinaryTree();
        tree.add(arr);
        System.out.print("Given:\n[ ");
        for (int i :
                arr) {
            System.out.print(i + " ");
        }
        System.out.println("]\nCount is: " + tree.count() + "\nArray Size: " + arr.length);
        System.out.println(tree.toString());
    }

}
