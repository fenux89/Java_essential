package homework10.task1;

import java.util.Arrays;

public class MyDictionary<Tkey, Tvalue> implements IDictionary<Tkey, Tvalue> {
    private int count = 0;
    private Tkey[] tkeys;
    private Tvalue[] tvalues = null;

    public MyDictionary(int a) {
        this.tkeys = (Tkey[]) new Object[a];
        this.tvalues = (Tvalue[]) new Object[a];
    }

    public static void main(String[] args) {
        MyDictionary myD = new MyDictionary(3);

        myD.add(12, "12t");
        myD.add(13, "13t");
        myD.add(13, "13t");

        System.out.println(myD.getValueOfTkIndex(1));
        System.out.println(myD.getValueOfTvIndex(0));

        System.out.println(myD.getCount());
        System.out.println(myD);
    }

    @Override
    public int getCount() {
        return this.count;
    }

    @Override
    public void add(Tkey tkey, Tvalue tvalue) {
        int c = 0;
        for (Tkey value : tkeys) {
            if (value == tkey) {
                System.out.println("tkey = " + tkey + " уже содержится в массиве, придумайте другой");
                break;
            } else c++;
        }
        if (c == tkeys.length) {
            this.tkeys[count] = tkey;
            this.tvalues[count] = tvalue;
            count++;
        }

    }

    @Override
    public Tkey getValueOfTkIndex(int a) {
        return this.tkeys[a];
    }

    @Override
    public Tvalue getValueOfTvIndex(int a) {
        return this.tvalues[a];
    }

    @Override
    public String toString() {
        return "MyDictionary{" +
                "tkeys=" + Arrays.toString(tkeys) +
                ", tvalues=" + Arrays.toString(tvalues) +
                '}';
    }
}
