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

    private static int randomNumber() {
        Random rand = new Random();
        return rand.nextInt(50) + 1;
    }
}
