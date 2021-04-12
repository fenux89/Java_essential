package homework8.task3;

public class Price implements Comparable<Price> {
    String name;
    String shopName;
    double price;

    public Price(String name, String shopName, double price) {
        this.name = name;
        this.shopName = shopName;
        this.price = price;
    }

    @Override
    public int compareTo(Price o) {
        return this.shopName.compareTo(o.shopName);
    }

    @Override
    public String toString() {
        return "Продукт = " + this.name + "; Название магазина = " + this.shopName + "; Цена = " + this.price + " UAH";
    }
}
