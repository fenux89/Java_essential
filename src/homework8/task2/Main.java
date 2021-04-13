package homework8.task2;

import javax.xml.crypto.Data;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Worker[] workers = new Worker[5];
        int value=0;
        int yearNow = Calendar.getInstance().get(Calendar.YEAR);

        for (int i = 0; i < workers.length; i++) {
            String fio;
            String post;
            String year;

            System.out.println("ФИО = ");
            fio = in.readLine();
            System.out.println("Должность = ");
            post = in.readLine();
            System.out.println("Год = ");
            year = in.readLine();

            dateFormat(year, "yyyy");

            workers[i] = new Worker(fio, post, year);
        }
        Arrays.sort(workers, Worker::compareTo);

        for (Worker wr : workers) {
            System.out.println(wr);
        }

        System.out.println("Введите значение по условию");
        try {
            value = Integer.parseInt(in.readLine());
        } catch (Exception e){
            System.out.println("Ввели не верный формат");
        }
        for (Worker worker : workers) {

            int staj = yearNow - Integer.parseInt(worker.year);


            if (staj > value) {
                System.out.println(worker);
            }
        }
    }

    static public boolean dateFormat(String year, String format) {

        SimpleDateFormat simF = new SimpleDateFormat(format);
        simF.setLenient(false);

        try {
            Date date = simF.parse(year);
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
