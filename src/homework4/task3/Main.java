package homework4.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Boolean st = true;
        String play;
        Scanner in = new Scanner(System.in);
        Player player = new Player();

        while (st) {
            System.out.println("Введите действие");
            play = in.next();

            switch (play) {

                case "play": {
                    System.out.println();
                    player.play();
                    System.out.println();
                    break;
                }

                case "stop": {
                    System.out.println();
                    player.stop();
                    System.out.println();
                    break;
                }

                case "record": {
                    System.out.println();
                    player.record();
                    System.out.println();
                    break;
                }

                case "pause": {
                    System.out.println();
                    player.pause();
                    System.out.println();
                }

                default: {
                    System.out.println();
                    System.out.println("Такой команды нет, выход");
                    st = false;
                    break;
                }
            }
        }
    }
}