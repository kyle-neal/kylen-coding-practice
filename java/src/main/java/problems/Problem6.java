/*
Write a program that, given two arguments to STDIN

a list of coins c1, c2, c3, ..
and an amount n
Prints out how many different ways you can make change from the coins to STDOUT.

The problem can be formally stated:

Given a value N, if we want to make change for N cents, and we have infinite supply of each of C = { C1, C2, .. , Cm} valued coins, how many ways can we make the change? The order of coins doesn’t matter.

Example 1:

For N = 4 and C = {1,2,3} there are four solutions: {1,1,1,1},{1,1,2},{2,2},{1,3}

So given the input

1, 2, 3
4
your program should output:

4
Example 2:

For N = 10 and C = {2, 5, 3, 6} there are five solutions: {2,2,2,2,2}, {2,2,3,3}, {2,2,6}, {2,3,5} and {5,5}

So given the input

2, 5, 3, 6
10
your program should output:

5
 */

package main.java.problems;

public class Problem6 extends Problem {
    @Override
    public void solve() {
        int[] arr = {1, 2, 3};
        int n = 4;
//        int sum = 0;
//        for (int i = arr.length -1; i >= 0; i--){
//            System.out.println("found " + count(n, 0, i, arr) + " using " + arr[i]);
//            sum += count(n, 0, i, arr);
//        }
        System.out.print("Given:\n[ ");
        for (int i :
                arr) {
            System.out.print(i + " ");
        }
        System.out.println("]\nwhere n = " + n + "\nresult is " + countOptimal(arr, n));
    }

    public static int countOptimal(int[] coins, int amt) {
        // solutions[i] contains the no. of solutions for value i.
        // We build from bottom up using the base case (n = 0)
        int solutions[] = new int[amt + 1];
        solutions[0] = 1;

        for (Integer i : coins)
            for (int j = i; j <= amt; j++)
                solutions[j] += solutions[j - i];

        return solutions[amt];
    }

    // @todo recursive style is no worky :(
    private static int count(int n, int sum, int index, int[] arr) {
        if (index < 0) return 0;
        else if (sum % n == 0 && sum != 0) return 1 + count(n, 0, index - 1, arr);
        else if (sum == 0) return count(n, sum + arr[index], index, arr);
        else if (sum % n != 0 && n / sum > 1) return count(n, sum + arr[index], index, arr);
        else return count(n, 0, index - 1, arr);
    }
}
