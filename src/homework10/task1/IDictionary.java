package homework10.task1;

public interface IDictionary<Tkey, Tvalue> {
    int getCount();

    void add(Tkey tkey, Tvalue tvalue);

    Tkey getValueOfTkIndex(int a);

    Tvalue getValueOfTvIndex(int a);
}
