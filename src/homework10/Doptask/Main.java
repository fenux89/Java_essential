package homework10.Doptask;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myArr = new MyArrayList<>();
        myArr.add(1);
        myArr.add(2);
        myArr.add(3);
        myArr.add(4);
        myArr.add(5);
        myArr.add(6);
        myArr.set(1, 555);
        myArr.add(2, 999);
        System.out.println(myArr.lastIndexOf(1));
        System.out.println(myArr);
        System.out.println(myArr.size());
        myArr.trimToSize();
        System.out.println(myArr);
        myArr.remove(2);
        System.out.println(myArr);
        System.out.println(myArr.get(2));
    }
}
