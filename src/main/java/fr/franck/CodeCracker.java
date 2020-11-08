package fr.franck;

import java.util.Arrays;
import java.util.List;

public class CodeCracker {

    public static void main(String[] args) {
    }

    public static String[] crackingWord(String word) {
        String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z", };

        String[] defaultKey = { "!", ")", "\"", "(", "£", "*", "%", "&", ">", "<", "@", "a", "b", "c", "d", "e", "f",
                "g", "h", "i", "j", "k", "l", "m", "n", "o", };

        List<String> alphabetList = Arrays.asList(alphabet);
        String[] letterOfWord = word.split("");
        int[] positionOfLetter = new int[letterOfWord.length];
        String[] codedWord = new String[letterOfWord.length];

        for (int i = 0; i < letterOfWord.length; i++) {
            positionOfLetter[i] = alphabetList.indexOf(letterOfWord[i]);
        }

        for (int i = 0; i < letterOfWord.length; i++) {
            codedWord[i] = defaultKey[positionOfLetter[i]];
        }
        return codedWord;
    }
}