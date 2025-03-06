package org.example;

public class MyArrayListRunner {

    public static void main(String[] args) {

        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        for (int i = 0; i < 10000; i++) {
            myArrayList.add(i);
        }
        System.out.println("Size: " + myArrayList.size());

        MyArrayList<String> arrayList = new MyArrayList<String>(10000);
        arrayList.add("яблоко");
        arrayList.add("банан");
        arrayList.add("конфета");
        arrayList.add("пряник");
        arrayList.add("чипсы");

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.getIndex(i) + " ");
        }

        MyArrayList<String> list = new MyArrayList<>(23);
        list.add("banana");
        list.add("apple");
        list.add("cherry");
        list.add("date");
        list.add("elderberry");

        QuickSort.sort(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.getIndex(i));
        }

        MyArrayList<Integer> integerMyArrayList = new MyArrayList<Integer>(5000);
        integerMyArrayList.add(23000);
        integerMyArrayList.add(3000);
        integerMyArrayList.add(12200);
        QuickSort.sort(integerMyArrayList);
        for (int i = 0; i < integerMyArrayList.size(); i++) {
            System.out.println(integerMyArrayList.getIndex(i));
        }


//        System.out.println(arrayList.getIndex(2));
//        arrayList.addIndex(2, "хлеб");
//        System.out.println(arrayList.getIndex(2));
//        System.out.println(arrayList.getIndex(3));
//        System.out.println(arrayList.size());
//
//
//        arrayList.remove("яблоко");
//        System.out.println(arrayList.size());
//
//
//        arrayList.set(0,"масло");
//        System.out.println(arrayList.getIndex(0));
//        System.out.println(arrayList.size());
//        arrayList.clear();
//        System.out.println(arrayList.size());
//

    }
}

