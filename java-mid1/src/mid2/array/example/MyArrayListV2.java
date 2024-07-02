package mid2.array.example;

import java.util.Arrays;

public class MyArrayListV2 {
    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elementData;
    private int size = 0;

    public MyArrayListV2() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV2(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(Object object) {
        //코드 추가
        if (size == elementData.length) {
            grow();
        }
        elementData[size] = object;
        size++;
    }

    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    public Object get(int index) {
        return elementData[index];
    }

    public Object set(int index, Object object) {
        Object oldValue = get(index);
        elementData[index] = object;
        return oldValue;
    }

    public int indexOf(Object target) {
        for (int i = 0; i < elementData.length; i++) {
            if (target.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size)) + ", size=" + size + ", capacity=" + elementData.length;
    }
}
