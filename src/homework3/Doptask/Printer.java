package homework3.Doptask;

public class Printer {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public void print(String value) {
        System.out.println(ANSI_RED + value + ANSI_RESET);

    }

    public void print(String value1, String value2) {
        System.out.println((char) 27 + "[32m" + value1 + (char) 27 + "[35m" + value2);
    }
}

