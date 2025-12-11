package org.example;

import org.example.util.StringUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    void reverseLetters_shouldReturnReverseString_ifContainsString() {
        assertEquals("t@eb eht av$J!123", new StringUtil().reverseLetters("J@va the be$t!123"));
    }

    @Test
    void reverseLetters_shouldReturnEmptyString_ifContainsEmptyString(){
        assertEquals("",new StringUtil().reverseLetters(""));
    }
    @Test
    void reverseLetters_shouldReturnEmptyString_ifContainsNullInput() {
        assertEquals("", new StringUtil().reverseLetters(null));
    }

    @Test
    void reverseLetters_shouldReturnReverseString_ifContainsOneLetter() {
        assertEquals("a", new StringUtil().reverseLetters("a"));
    }

    @Test
    void reverseLetters_shouldReturnString_ifContainsOnlyNoLetters() {
        assertEquals("123!@#", new StringUtil().reverseLetters("123!@#"));
    }

    @Test
    void reverseLetters_shouldReturnString_ifContainsWithSpacesAndPunctuation() {
        assertEquals("egAelp! miS", new StringUtil().reverseLetters("Simple! Age"));
    }
}