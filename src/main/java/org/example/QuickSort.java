package org.example;

public class QuickSort {


    /**
     * Сортировка quicksort с использованием Comparable
     *
     * @param list список для сортировки
     */
    public static <T extends Comparable<T>> void sort(MyArrayList<T> list) {
        quickSort(list, 0, list.size() - 1);
    }

    private static <T extends Comparable<T>> void quickSort(MyArrayList<T> list, int low, int high) {
        if (low < high) {
            int pi = partition(list, low, high);
            quickSort(list, low, pi - 1);
            quickSort(list, pi + 1, high);
        }
    }

    private static <T extends Comparable<T>> int partition(MyArrayList<T> list, int low, int high) {
        T pivot = list.getIndex(high);
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (list.getIndex(j).compareTo(pivot) < 0) {
                i++;
                swap(list, i, j);
            }
        }
        swap(list, i + 1, high);
        return i + 1;
    }

    private static <T extends Comparable<T>> void swap(MyArrayList<T> list, int i, int j) {
        T temp = list.getIndex(i);
        list.set(i, list.getIndex(j));
        list.set(j, temp);
    }
}
