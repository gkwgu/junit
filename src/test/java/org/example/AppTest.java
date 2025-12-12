package org.example;

import org.example.util.StringUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    private final StringUtil stringUtil = new StringUtil();
    @Test
    void reverseLetters_shouldReturnReverseString_ifContainsString() {
        assertEquals("t@eb eht av$J!123", stringUtil.reverseLetters("J@va the be$t!123"));
    }

    @Test
    void reverseLetters_shouldReturnEmptyString_ifContainsEmptyString(){
        assertEquals("",stringUtil.reverseLetters(""));
    }
    @Test
    void reverseLetters_shouldReturnEmptyString_ifContainsNullInput() {
        assertEquals("", stringUtil.reverseLetters(null));
    }

    @Test
    void reverseLetters_shouldReturnReverseString_ifContainsOneLetter() {
        assertEquals("a", stringUtil.reverseLetters("a"));
    }

    @Test
    void reverseLetters_shouldReturnString_ifContainsOnlyNoLetters() {
        assertEquals("123!@#", stringUtil.reverseLetters("123!@#"));
    }

    @Test
    void reverseLetters_shouldReturnString_ifContainsWithSpacesAndPunctuation() {
        assertEquals("egAelp! miS", stringUtil.reverseLetters("Simple! Age"));
    }
}