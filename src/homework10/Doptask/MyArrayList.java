package homework10.Doptask;


import java.util.*;


public class MyArrayList<T> {
    private final int DEFAULT_SIZE = 4;
    T[] myArray = (T[]) new Object[DEFAULT_SIZE];
    private int count = 0;

    MyIterator returnIterator() {
        return new MyIterator();
    }

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

        }
        count = 0;
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
        String str = "[ ";
        for (int i = 0; i < count; i++) {
            if (i == count - 1) {
                str += myArray[i] + " ]";
            } else str += myArray[i] + ", ";
        }
        return str;
    }

    public void clear() {
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = null;
        }
        count = 0;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void add(int index, T value) {
        Object[] newArray = new Object[myArray.length + 1];
        System.arraycopy(myArray, 0, newArray, 0, index);
        newArray[index] = value;
        System.arraycopy(myArray, index, newArray, index + 1, myArray.length - index);
        resize(myArray.length + 1);
        myArray = (T[]) newArray;
        if (count == myArray.length) {
            resize(myArray.length + 2);
        }
//        for (int i = count - 1; i > index; i--) {
//            myArray[i] = myArray[i - 1];
//        }
//        myArray[index] = value;
        count++;
    }

    public <T> T[] toArray(T[] a) {
        if (a.length < count)

            return (T[]) Arrays.copyOf(myArray, count, a.getClass());
        System.arraycopy(myArray, 0, a, 0, count);
        if (a.length > count)
            a[count] = null;
        return a;
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
        count = s;
        resize(s);
        System.arraycopy(newArray, 0, myArray, 0, s);
    }

    class MyIterator implements ListIterator<T> {
        int cursor;
        int index;

        MyIterator() {
            System.out.println("in iterator constructor = " + cursor);
        }

        @Override
        public boolean hasNext() {
            return cursor < myArray.length;
        }

        @Override
        public T next() {
            index = cursor++;

            return myArray[index];
        }

        @Override
        public boolean hasPrevious() {
            return cursor != 0;
        }

        @Override
        public T previous() {

            int i = cursor - 1;
            if (i < 0)
                throw new NoSuchElementException();
            Object[] newArray = myArray;
            if (i >= newArray.length)
                  throw new ConcurrentModificationException();
                cursor = i;
            return (T) newArray[index = i];
        }

        @Override
        public int nextIndex() {
            return cursor;
        }

        @Override
        public int previousIndex() {
            return cursor - 1;
        }

        @Override
        public void remove() {
            for (int i = index; i < count - 1; i++) {

                myArray[i] = myArray[i + 1];
            }
            myArray[count - 1] = null;
            count--;
            if (myArray.length > DEFAULT_SIZE && count < myArray.length / 2) {
                resize(myArray.length / 2);

            }
            count = 0;
            for (int i = 0; i < myArray.length; i++) {
                if (myArray[i] != null) {
                    count++;
                }
            }
        }

        @Override
        public void add(T t) {
            if (count == myArray.length - 1) {
                resize(myArray.length * 2);
            }
            myArray[count++] = t;
        }

        @Override
        public void set(T num) {
            myArray[index] = num;
        }

    }
}
