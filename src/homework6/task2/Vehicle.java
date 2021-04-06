package homework6.task2;

public class Vehicle {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    Wheel wh = new Wheel();
    Door dr = new Door();

    void printWheelColor() {
        System.out.println(ANSI_BLUE + wh.color + ANSI_RESET);
    }

    void printDoorColor() {
        System.out.println(ANSI_RED + dr.color + ANSI_RESET);
    }

    private class Wheel {
        String color = "синий";
    }

    private class Door {
        String color = "красный";
    }

}
