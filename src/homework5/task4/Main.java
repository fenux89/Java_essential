package homework5.task4;

import java.util.ArrayList;
import java.util.ListIterator;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < 11; i++) {
            list.add(i);
        }

        System.out.println(list);


        ListIterator<Integer> li = list.listIterator();

        while (li.hasNext()) {
            list.set(li.nextIndex(), li.nextIndex() + 2);
            System.out.println(li.next());
        }
    }
}