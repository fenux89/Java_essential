package homework10.Doptask;


import java.util.Arrays;


public class MyArrayList<T> {
    private final int DEFAULT_SIZE = 4;
    T[] myArray = (T[])new Object[DEFAULT_SIZE];
    private int count = 0;

    public void add(T value) {
        if (count == myArray.length - 1) {
            resize(myArray.length * 2);
        }
        myArray[count++] = value;
    }

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(myArray, 0, newArray, 0, count);
        myArray = (T[]) newArray;
    }

    public void set(int index, T value) {
        this.myArray[index] = value;
    }

    public Object get(int index) {
        return this.myArray[index];
    }

    public void remove(int index) {
        for (int i = index; i < count - 1; i++) {

            myArray[i] = myArray[i + 1];
        }
        myArray[count - 1] = null;
        count--;
        if (myArray.length > DEFAULT_SIZE && count < myArray.length / 2) {
            resize(myArray.length / 2);
            count = 0;
        }
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] != null) {
                count++;
            }
        }
    }

    public int indexOF(T value) {
        for (int i = 0; i < count; i++) {
            if (this.myArray[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public int size() {
        return count;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "myArray=" + Arrays.toString(myArray) +
                '}';
    }

    public void clear() {
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = null;
        }
        count = 0;
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public void add(int index, T value) {
        Object[] newArray = new Object[myArray.length + 1];
        System.arraycopy(myArray, 0, newArray, 0, index);
        newArray[index] = value;
        System.arraycopy(myArray, index, newArray, index + 1, myArray.length - index);
        resize(myArray.length + 1);
        myArray = (T[]) newArray;
        count++;
    }

    public int lastIndexOf(T value) {
        for (int i = count; i >= 0; i--) {
            if (this.myArray[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public void trimToSize() {
        Object[] newArray = new Object[myArray.length];
        int s = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] != null) {
                newArray[s++] = myArray[i];
            }
        }
        resize(s);
        System.arraycopy(newArray, 0, myArray, 0, s);
    }
}