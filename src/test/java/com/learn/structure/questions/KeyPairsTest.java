package com.learn.structure.questions;

import com.learn.questions.day01.KeyPairs;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class KeyPairsTest {

    public KeyPairs keyPairs;

    @BeforeEach
    public void setBeforeTest() {
        keyPairs = new KeyPairs();
    }

//    [[1,2],[1,4],[1,6]]
    @Test
    @DisplayName("Test case 1")
    public void keyPairsTestExample1() {
        int[] num1 = {1,7,11};
        int[] num2 = {2,4,6};
        int k =3;
        List<int[]> result = keyPairs.kSmallestPairs(num1, num2, k);
        int[] result1 = {1,2};
        int[] result2 = {1,4};
        int[] result3 = {1,6};
        List<int []> excepted = Arrays.asList(result1, result2, result3);
        assertArrayEquals(excepted.toArray(), result.toArray());


    }

    // [[1,1],[1,1]]
    @Test
    @DisplayName("Test case 2")
    public void keyPairsTestExample2() {
        int[] num1 = {1,1,2};
        int[] num2 = {1,2,3};
        int k =2;
        List<int[]> result = keyPairs.kSmallestPairs(num1, num2, k);
        int[] result1 = {1,1};
        int[] result2 = {1,1};
        List<int []> excepted = Arrays.asList(result1, result2);
        assertArrayEquals(excepted.toArray(), result.toArray());

    }

    // [[1,3],[2,3]]
    @Test
    @DisplayName("Test case 3")
    public void keyPairsTestExample3() {
        int[] num1 = {1,2};
        int[] num2 = {3};
        int k =3;
        List<int[]> result = keyPairs.kSmallestPairs(num1, num2, k);
        int[] result1 = {1,3};
        int[] result2 = {2,3};

        List<int []> excepted = Arrays.asList(result1, result2);
        assertArrayEquals(excepted.toArray(), result.toArray());

    }
}
