package dev.victor;

import java.util.HashSet;
import java.util.Set;

public class PangramChecker {

    public boolean check(String sentence){
        Set<Character> fullAlphabetSet = new HashSet<>();
        for (char c = 'a'; c <= 'z'; c++) {
            fullAlphabetSet.add(c);
        }
        System.out.println(fullAlphabetSet);
        System.out.println(fullAlphabetSet.toArray().length);

        Set<Character> uniqueLettersInThisString = new HashSet<>();

        for (char c : sentence.toLowerCase().toCharArray()) {
            if (fullAlphabetSet.contains(c)) {
                uniqueLettersInThisString.add(c);
            }
        }
        return uniqueLettersInThisString.containsAll(fullAlphabetSet);
    }
}
