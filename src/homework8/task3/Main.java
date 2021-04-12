package homework8.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        Price[] prices = new Price[2];

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String nameShop;
        for (int i = 0; i < prices.length; i++) {

            System.out.println("Продукт = ");
            String name = in.readLine();
            System.out.println("Название магазина = ");
            String shop_name = in.readLine();
            System.out.println("Цена = ");
            double price = Double.parseDouble(in.readLine());

            prices[i] = new Price(name, shop_name, price);
        }

        Arrays.sort(prices, Price::compareTo);

        for (Price pr : prices) {
            System.out.println(pr);
        }

        System.out.println("Введите название магазина");
        nameShop = in.readLine();
        for (int i = 0; i < prices.length; i++) {

            if (prices[i].shopName.equals(nameShop)) {
                System.out.println(prices[i]);
            } else {
                try {
                    throw new MyException();
                } catch (MyException e) {
                    e.myExc();
                }
            }

        }
    }
}
    class MyException extends Exception {

        public void myExc(){
            System.out.println("Такого магазина нет");
        }
    }


