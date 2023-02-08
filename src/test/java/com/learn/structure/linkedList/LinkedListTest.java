package com.learn.structure.linkedList;

import com.learn.structure.interview.LinkedList;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {
    private LinkedList underTest;

    @Before
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
