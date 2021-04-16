package homework10.task2;

import java.util.Arrays;

public class Between {
    public static int[] between(int a, int b) {
        int c = b - a;
        c++;
        int[] mas = new int[c];
        for (int i = 0; i < c; i++) {
            if (a > b) {
                break;
            } else {
                mas[i] = a;
                a++;
            }
        }
        return mas;
    }
}

