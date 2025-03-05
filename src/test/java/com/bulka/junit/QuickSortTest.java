package com.bulka.junit;

import org.example.MyArrayList;
import org.example.QuickSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    void testSortInteger() {
        MyArrayList<Integer> list = new MyArrayList<>(10);
        list.add(5);
        list.add(2);
        list.add(8);
        list.add(1);
        list.add(9);
        QuickSort.sort(list);
        assertEquals(1, list.getIndex(0));
        assertEquals(2, list.getIndex(1));
        assertEquals(5, list.getIndex(2));
        assertEquals(8, list.getIndex(3));
        assertEquals(9, list.getIndex(4));
    }

    @Test
    void testSortAlreadySorted() {
        MyArrayList<Integer> list = new MyArrayList<>(10);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        QuickSort.sort(list);
        assertEquals(1, list.getIndex(0));
        assertEquals(2, list.getIndex(1));
        assertEquals(3, list.getIndex(2));
        assertEquals(4, list.getIndex(3));
        assertEquals(5, list.getIndex(4));
    }

    @Test
    void testSortReverseSorted() {
        MyArrayList<Integer> list = new MyArrayList<>(10);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        QuickSort.sort(list);
        assertEquals(1, list.getIndex(0));
        assertEquals(2, list.getIndex(1));
        assertEquals(3, list.getIndex(2));
        assertEquals(4, list.getIndex(3));
        assertEquals(5, list.getIndex(4));
    }

    @Test
    void testSortDuplicateElements() {
        MyArrayList<Integer> list = new MyArrayList<>(10);
        list.add(5);
        list.add(2);
        list.add(8);
        list.add(2);
        list.add(5);
        QuickSort.sort(list);
        assertEquals(2, list.getIndex(0));
        assertEquals(2, list.getIndex(1));
        assertEquals(5, list.getIndex(2));
        assertEquals(5, list.getIndex(3));
        assertEquals(8, list.getIndex(4));
    }

    @Test
    void testSortEmptyList() {
        MyArrayList<Integer> list = new MyArrayList<>(10);
        QuickSort.sort(list);
        assertEquals(0, list.size());
    }

    @Test
    void testSortSingleElementList() {
        MyArrayList<Integer> list = new MyArrayList<>(10);
        list.add(5);
        QuickSort.sort(list);
        assertEquals(1, list.size());
        assertEquals(5, list.getIndex(0));
    }
}