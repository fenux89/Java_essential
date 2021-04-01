package homework4.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String formatDoc;
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Введите нужный формат");
            formatDoc = in.next();

            if (formatDoc.equals("DOC")) {
                AbstractHandler doc = new DOCHandler();
                doc.open();
                doc.create();
                doc.change();
                doc.save();
            } else if (formatDoc.equals("XML")) {
                AbstractHandler xml = new XMLHandler();
                xml.open();
                xml.create();
                xml.change();
                xml.save();
            } else if (formatDoc.equals("TXT")) {
                AbstractHandler txt = new TXTHandler();
                txt.open();
                txt.create();
                txt.change();
                txt.save();
            } else if (formatDoc.equals("Q")) {
                break;
            } else
                System.out.println("Такого формата нет, введите другой формат!");
        }

    }
}
