package homework5.Doptask;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Мельникова Ксения Витальевна");
        list.add("Иванова София Ивановна");
        list.add("Буракшаева Юлия Сергеевна");
        list.add("Фурсова Елизавета Владимировна");
        list.add("Сапсай Иван Алексеевич");
        list.add("Богословский Артем Михайлович");

        System.out.println("Самый лучший учитель  " + list.indexOf("Иванова София Ивановна"));
        System.out.println("Самый не очень учитель   " + list.indexOf("Сапсай Иван Алексеевич"));

        System.out.println();
        for (String arr : list) {
            System.out.println(arr);
        }
    }
}
