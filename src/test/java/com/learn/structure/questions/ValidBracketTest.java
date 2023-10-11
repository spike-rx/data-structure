package com.learn.structure.questions;

import com.learn.questions.day01.ValidBracket;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidBracketTest {
    private ValidBracket underTest;

    @BeforeEach
    public void setUnderTest(){
        underTest = new ValidBracket();
    }

    @Test
    public void validBracketTest() {
        String s = "([])[]{}";
        System.out.println(underTest.isValid(s));
        assertTrue(underTest.isValid(s));

    }
}
