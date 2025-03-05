package org.example;

public class MyArrayList<T> {

    private T[] objects;
    private int size;

    public MyArrayList(int initialSize) {
        this.objects = (T[]) new Object[initialSize];
        this.size = 0;
    }

    /**
     * добавить элемент
     *
     * @param object элемент для добавления
     */
    public void add(T object) {
        if (size == objects.length) {
            // увеличить размер списка
            T[] newObjects = (T[]) new Object[objects.length * 2];
            System.arraycopy(objects, 0, newObjects, 0, objects.length);
            objects = newObjects;
        }
        objects[size] = object;
        size++;
    }

    /**
     * добавить элемент по индексу
     *
     * @param index  индекс, по которому нужно добавить элемент
     * @param object элемент для добавления
     */
    public void addIndex(int index, T object) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (size == objects.length) {
            // увеличить размер списка
            T[] newObjects = (T[]) new Object[objects.length * 2];
            System.arraycopy(objects, 0, newObjects, 0, objects.length);
            objects = newObjects;
        }
        System.arraycopy(objects, index, objects, index + 1, size - index);
        objects[index] = object;
        size++;
    }

    /**
     * Получить элемент по индексу
     *
     * @param index индекс элемента
     * @return элемент по индексу
     */
    public T getIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return objects[index];
    }

    /**
     * Удалить элемент
     *
     * @param object элемент для удаления
     */
    public void remove(T object) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (objects[i].equals(object)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.arraycopy(objects, index + 1, objects, index, size - index - 1);
            size--;
        }
    }

    /**
     * Очистить всю коллекцию
     */
    public void clear() {
        size = 0;
    }

    /**
     * Замена элемента по индексу
     *
     * @param index  индекс элемента для замены
     * @param object новый элемент
     */
    public void set(int index, T object) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        objects[index] = object;
    }

    /**
     * Размер
     */
    public int size() {
        return size;
    }


}
