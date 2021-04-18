package homework10.Doptask;

import java.util.ListIterator;

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
        System.out.println(myArr.size());

        MyArrayList.MyIterator inter = myArr.returnIterator();
        System.out.println(inter.next());
        Integer[] ww = (Integer[]) myArr.toArray(new Integer[0]);

        for (Integer word : ww) {
            System.out.println(word);
        }
        try {
            System.out.println(inter.next());
            System.out.println(inter.next());
            System.out.println(inter.hasNext());
            System.out.println(inter.hasPrevious());
            System.out.println(inter.previous());
            System.out.println(inter.previous());
            System.out.println(inter.previous());
            System.out.println(inter.previous());
        } catch (Exception e){
            System.out.println("Сработало исключение");
        }
    }
}
