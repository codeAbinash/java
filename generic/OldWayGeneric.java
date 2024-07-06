package generic;

class SimpleList {
    private Object[] elements;
    private int size = 0;

    public SimpleList(int initialCapacity) {
        elements = new Object[initialCapacity];
    }

    public void add(Object element) {
        if (size == elements.length) {
            increaseCapacity();
        }
        elements[size++] = element;
    }

    public Object get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return elements[index];
    }

    private void increaseCapacity() {
        int newSize = elements.length * 2;
        Object[] newElements = new Object[newSize];
        System.arraycopy(elements, 0, newElements, 0, elements.length);
        elements = newElements;
    }

    public int size() {
        return size;
    }

}

public class OldWayGeneric {
    public static void main(String[] args) {
        SimpleList list = new SimpleList(2);

        // Adding elements of different types
        list.add("Hello");
        list.add(123);
        list.add(45.67);

        // Retrieving and printing elements with explicit casting
        String strElement = (String) list.get(0);
        Integer intElement = (Integer) list.get(1);
        Double doubleElement = (Double) list.get(2);

        System.out.println(strElement);
        System.out.println(intElement);
        System.out.println(doubleElement);
    }
}