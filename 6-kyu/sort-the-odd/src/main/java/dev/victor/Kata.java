package dev.victor;

import java.util.ArrayList;

public class Kata {

    public static int[] sortArray(int[] arr) {

        // create new array with just the odds
        ArrayList<Integer> oddsArray = new ArrayList<>();

        for (int j : arr) {
            if (j % 2 != 0) {
                oddsArray.add(j);
            }
        }
        // sort this array in place
        oddsArray.sort(Integer::compareTo);

        // then combine the original array with the new array - whenever we encounter an odd number replace it with the ith number of our new array
        
        ArrayList<Integer> arrayWithOddsSorted = new ArrayList<>();

        int c = 0;
        for (int k : arr) {
            if (k % 2 == 0) {
                arrayWithOddsSorted.add(k);
            } else {
                arrayWithOddsSorted.add(oddsArray.get(c));
                c++;
            }
        }
        return arrayWithOddsSorted.stream().mapToInt(i -> i).toArray();
    }
}
