package org.example;

public class MyArrayListRunner {

    public static void main(String[] args) {

        addElements();


    }

    private static void addElements() {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        for (int i = 0; i < 100000; i++) {
            myArrayList.add(i);
        }
        System.out.println("Size: " + myArrayList.size());
    }


}

