package homework7.task2;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ErrorPrinter er = new ErrorPrinter() {
            @Override
            public void printError(String error) {
                System.out.println("\u001B[31m" + error + "\u001B[0m");
            }
        };

        er.printError("Error");
    }
}
