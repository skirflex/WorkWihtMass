import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;

public class Cross {
    public static void main(String[] args) {

        HashSet<String> emailList = new HashSet<>();
        emailList.add("Skirflex1488@gmail.com");
        String command;
        String comm;
        String email;
        while (true)
        {
            System.out.println("Введите команду");
            Scanner scanner = new Scanner(System.in);
            command = scanner.nextLine();
            if (command.indexOf(" ") <= 0)
            {
                comm = command.toUpperCase(Locale.ROOT).trim();
            }
            else {
                comm = command.substring(0, command.indexOf(" ")).toUpperCase(Locale.ENGLISH).trim();

            }
            switch (comm)
            {
                case "ADD":
                    if (command.lastIndexOf(" ") < 0)
                    {
                        System.out.println("Проверьте правильности ввода команды");
                        break;
                    }

                    email = command.substring(command.lastIndexOf(" ")).trim();
                    if (email.indexOf("@") <= 0 || email.indexOf(".") <= 0  )
                    {
                        System.out.println("Адрес введён неверно");
                        break;
                    }
                    emailList.add(email);
                    System.out.println("Добавлено");
                    break;


                case "LIST":
                    for (String list : emailList)
                    {
                        System.out.println(list);

                    }
                    break;

            }
        }

    }

}








