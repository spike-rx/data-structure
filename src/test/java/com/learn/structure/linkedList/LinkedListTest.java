package com.learn.structure.linkedList;

import com.learn.structure.interview.LinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LinkedListTest {
    private LinkedList underTest;

    @BeforeEach
    public void setUnderTest() {
        underTest = new LinkedList();
    }



    @Test
    public void TestReverse() {
        underTest.add(1);
        underTest.add(2);
        underTest.add(3);
        underTest.reverse();
    }
}
