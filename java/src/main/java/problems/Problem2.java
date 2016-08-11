/*
Array Rotation

This problem is to rotate a given array to the right by n steps.

For example:

Given [1, 2, 3] and n = 1, you should return [3, 1, 2]

Each step, the last element in the array is moved to the front of the array, and the rest are shifted right.

Another example:

Given [1, 2, 3, 4, 5] and n = 3, you should return [3, 4, 5, 1, 2]
 */

package main.java.problems;

import main.java.util.Utilities;


public class Problem2 extends Problem {
    public void solve() {
        int size = Utilities.randomNumber(10);
        int n = Utilities.randomNumber(20);
        int[] arr = Utilities.createArray(size);
        System.out.print("Given:\n[ ");
        for (int i :
                arr) {
            System.out.print(i + " ");
        }
        System.out.print("]\nwhere n = " + n + "\nRotated array:\n[ ");
        for (int i :
                rotate(arr, n)) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }

    private int[] rotate(int[] arr, int n){
        for (int x = 0; x < n; x++){
            int previous = arr[0];
            arr[0] = arr[arr.length - 1];
            for(int y = 1; y < arr.length; y++){
                int pre = arr[y];
                arr[y] = previous;
                previous = pre;
            }
        }
        return arr;
    }
}
