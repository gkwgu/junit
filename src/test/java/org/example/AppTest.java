package org.example;

import org.example.util.StringUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    void myFirstTest() {
        assertEquals("t@eb eht av$J!123", new StringUtil().reverseLetters("J@va the be$t!123"));
    }
}