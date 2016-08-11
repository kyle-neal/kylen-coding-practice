/*
Suppose we could access yesterday's stock prices as a list, where:

The indices are the time in minutes past trade opening time, which was 9:30am local time.
The values are the price in dollars of Apple stock at that time.
So if the stock cost $500 at 10:30am, stock_prices_yesterday[60] = 500.

Write an efficient function that takes stock_prices_yesterday and returns the best profit I could have made from 1
purchase and 1 sale of 1 Apple stock yesterday.

Ex) stock_prices_yesterday = [10, 7, 5, 8, 11, 9]

get_max_profit(stock_prices_yesterday)
# returns 6 (buying for $5 and selling for $11)
 */

package main.java.problems;

import main.java.util.*;

import java.util.Scanner;

public class Problem1 extends Problem {
    @Override
    public void solve() {
        int[] stockPrices = Utilities.createArray(getArraySize());
        int maxProfit = getMaxProfit(stockPrices);
        System.out.print("Max profit given:\n[ ");
        for (int i :
                stockPrices) {
            System.out.print(i + " ");
        }
        System.out.println("]\nis -> " + maxProfit);
    }

    private static int getArraySize() {
        System.out.println("Enter a positive integer representing the number of time slots.");
        do {
            Scanner in = new Scanner(System.in);
            System.out.print("time slots> ");

            if (in.hasNextInt()) {
                int size = in.nextInt();
                if (size > 0) {
                    return size;
                } else {
                    System.out.println("Sorry, couldn't understand you!");
                }
            } else {
                System.out.println("Sorry, couldn't understand you!");
            }
        } while (true);
    }

    private static int getMaxProfit(int[] stock_prices_yesterday) {
        int bought = stock_prices_yesterday[0];
        int maxProfit = 0;
        for (int i = 1; i < stock_prices_yesterday.length; i++) {
            int profit = stock_prices_yesterday[i] - bought;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
            if (bought > stock_prices_yesterday[i]) {
                bought = stock_prices_yesterday[i];
            }
        }
        return maxProfit;
    }
}
