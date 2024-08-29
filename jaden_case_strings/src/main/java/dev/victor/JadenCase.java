package dev.victor;

public class JadenCase {

    public String toJadenCase(String phrase) {

        if (phrase == null || "".equals(phrase)) {
            return null;
        }

        else {
            String[] words = phrase.split(" ");
            for (int i = 0; i < words.length; i++) {
                words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1);
            }
            // currently each "word" isn't actually being written to the "words" array. How come?
            return String.join(" ", words);
        }
    }

}
