package com.bulka.junit;

import org.example.MyArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {

    @Test
    void testAdd() {
        MyArrayList<String> list = new MyArrayList<>(1);
        list.add("Элемент 1");
        list.add("Элемент 2");
        assertEquals(2, list.size());
        assertEquals("Элемент 1", list.getIndex(0));
        assertEquals("Элемент 2", list.getIndex(1));
    }

    @Test
    void testAddIndex() {
        MyArrayList<String> list = new MyArrayList<>(1);
        list.add("Элемент 1");
        list.addIndex(0, "Элемент 0");
        assertEquals(2, list.size());
        assertEquals("Элемент 0", list.getIndex(0));
        assertEquals("Элемент 1", list.getIndex(1));
    }

    @Test
    void testGetIndex() {
        MyArrayList<String> list = new MyArrayList<>(1);
        list.add("Элемент 1");
        assertEquals("Элемент 1", list.getIndex(0));
    }

    @Test
    void testRemove() {
        MyArrayList<String> list = new MyArrayList<>(1);
        list.add("Элемент 1");
        list.add("Элемент 2");
        list.remove("Элемент 1");
        assertEquals(1, list.size());
        assertEquals("Элемент 2", list.getIndex(0));
    }

    @Test
    void testClear() {
        MyArrayList<String> list = new MyArrayList<>(1);
        list.add("Элемент 1");
        list.add("Элемент 2");
        list.clear();
        assertEquals(0, list.size());
    }

    @Test
    void testSet() {
        MyArrayList<String> list = new MyArrayList<>(1);
        list.add("Элемент 1");
        list.set(0, "Новый элемент");
        assertEquals("Новый элемент", list.getIndex(0));
    }

    @Test
    void testSize() {
        MyArrayList<String> list = new MyArrayList<>(1);
        list.add("Элемент 1");
        list.add("Элемент 2");
        assertEquals(2, list.size());
    }

    @Test
    void testIndexOutOfBoundsExceptionAddIndex() {
        MyArrayList<String> list = new MyArrayList<>(1);
        assertThrows(IndexOutOfBoundsException.class, () -> list.addIndex(-1, "Элемент"));
    }

    @Test
    void testIndexOutOfBoundsExceptionGetIndex() {
        MyArrayList<String> list = new MyArrayList<>(1);
        assertThrows(IndexOutOfBoundsException.class, () -> list.getIndex(-1));
    }

    @Test
    void testIndexOutOfBoundsExceptionSet() {
        MyArrayList<String> list = new MyArrayList<>(1);
        assertThrows(IndexOutOfBoundsException.class, () -> list.set(-1, "Элемент"));
    }
}