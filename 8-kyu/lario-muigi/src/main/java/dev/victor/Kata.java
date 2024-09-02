package dev.victor;

public class Kata {
    public static int[] pipeFix(int[] numbers) {

        int min = numbers[0]; // Minimum value in the array
        int max = numbers[numbers.length - 1]; // Maximum value in the array

        int[] correctArray = new int[max - min + 1];

        for (int i = 0; i < correctArray.length ; i++) {
            correctArray[i] = min + i;
        }
        return correctArray;
    }
}
