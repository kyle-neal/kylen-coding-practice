package main.java.util;

import java.util.Random;

public class Utilities {

    public static int[] createArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = randomNumber();
        }
        return arr;
    }

    public static int randomNumber() {
        return randomNumber(50);
    }

    public static int randomNumber(int max) {
        Random rand = new Random();
        return rand.nextInt(max) + 1;
    }
}
