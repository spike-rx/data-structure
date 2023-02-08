package com.learn.structure.questions;

import com.learn.structure.quesions.ValidBracket;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ValidBracketTest {
    private ValidBracket underTest;

    @Before
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
