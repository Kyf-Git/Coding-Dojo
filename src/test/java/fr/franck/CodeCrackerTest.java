package fr.franck;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class CodeCrackerTest {

    @Test
    public void crackingWord() {
        String[] codedWord1 = { "%", ">", "c", "d" };
        String[] codedWord2 = { "*", "g", "!", "c", "\"", "@" };
        assertArrayEquals(codedWord1, CodeCracker.crackingWord("gino"));
        assertArrayEquals(codedWord2, CodeCracker.crackingWord("franck"));
    }
}
