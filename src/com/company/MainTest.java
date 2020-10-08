package com.company;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MainTest {
    private int[] arr;
    private int[] expectedOutput;

    @BeforeEach
    void init() {
        arr = new int[]{65, 25, 34, 2, 56};
        expectedOutput = new int[]{2, 25, 34, 56, 65};
    }

    @Test
    public void bubbleTest() {
        Sorting.bubble(arr);
    }

    @Test
    public void quickSortTest() {
        Sorting.quickSort(arr);
    }

    @AfterEach
    void check() {
        assertArrayEquals(expectedOutput, arr);
    }



}