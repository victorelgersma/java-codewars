package dev.victor;

import java.util.Arrays;

public class Kata {

    public static int[] sortArray(int[] arr) {

        // Find all the odd numbers and sort them
        int[] sortedOdds = Arrays.stream(arr).filter(num -> num % 2 != 0).sorted().toArray();

        // Reconstruct the sorted array by placing the sorted odd numbers back into their positions

        int oddIndex = 0;
        for (int i = 0; i< arr.length; i++) {
            if (arr[i] %2 != 0) {
                arr[i] = sortedOdds[oddIndex++];
            }
        }

        return arr;

    }
}
