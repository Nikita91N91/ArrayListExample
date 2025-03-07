package com.bulka.junit;

import org.example.MyArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyArrayListRunnerTest {
    @Test
    public void testAddElements() {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        for (int i = 0; i < 100000; i++) {
            myArrayList.add(i);
        }
        assertEquals(100000, myArrayList.size());
        for (int i = 0; i < 100000; i++) {
            assertEquals(i, myArrayList.getIndex(i).intValue());
        }
    }

}



