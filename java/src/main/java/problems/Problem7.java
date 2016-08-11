/*
n factorial (written as n!) is the number we get when we multiply every positive number from 1 up to n together. In this problem, your code will do the grunt work of computing the factorial.

Problem Statement

Write a program that, given a number n from STDIN, prints out the factorial of n to STDOUT:

If n is 0, n factorial is 1
n! is not defined for negative numbers.
Example 1:

3! = 3 × 2 × 1 = 6
So given the input 3, your program should output:

6
Example 2:

7! = 7 × 6 × 5 × 4 × 3 × 2 × 1 = 5040
So given the input 7, your program should output:

5040
 */
package main.java.problems;

import main.java.util.Utilities;

public class Problem7 extends Problem {
    @Override
    public void solve() {
        int n = Utilities.randomNumber(10);
        System.out.println("Factorial iterative given " + n + " is " + factIterative(n));
        System.out.println("Factorial iterative given " + n + " is " + factRecursive(n));
    }

    private int factIterative(int n) {
        int product = n;
        for (int i = n - 1; i >= 1; i--)
            product = product * i;
        return product;
    }


    private int factRecursive(int n){
        if(n == 1) return n;
        else return n * factRecursive(n - 1);
    }
}
