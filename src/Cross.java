import java.util.ArrayList;
import java.util.Scanner;

public class Cross {
    public static void main(String[] args) {

        ArrayList<String> todoList = new ArrayList<>();
        todoList.add("Тест");
        String add = "ADD";
        String LIST = "LIST";
        String edit = "EDIT";
        String delete = "DELETE";
        String exit = "EXIT";
        int i=0;


            for (; i <= 1 ; ) {
                System.out.println("Введите команду");
                Scanner scanner = new Scanner(System.in);
                String text = scanner.nextLine();
                if (text.equalsIgnoreCase(add)) {
                    System.out.println("Какую строчку добавить?");
                    Scanner scanner1 = new Scanner(System.in);
                    todoList.add(scanner1.nextLine());

                } else if (text.equalsIgnoreCase(LIST)) {
                    for (int j = 0; j < todoList.size(); j++) {
                        System.out.println(j + " - " + todoList.get(j));
                    }

                } else if (text.equalsIgnoreCase(edit)) {
                    System.out.println("Введите номер строки и текст");
                    Scanner scanner2 = new Scanner(System.in);
                    String edittext = scanner2.nextLine();
                    int index = Integer.parseInt(edittext.substring(0, edittext.indexOf(" ")).trim());
                    String text1 = edittext.substring(edittext.indexOf(" ")).trim();
                    todoList.remove(index);
                    todoList.add(index,text1);


                } else if (text.equalsIgnoreCase(delete)) {

                    System.out.println("Какую строчку удалить?");
                    Scanner scanner1 = new Scanner(System.in);
                    int ind = scanner1.nextInt();
                    if (ind >= todoList.size())
                    {
                        System.out.println("Такой строки нет");
                        continue;
                    }
                    else
                    {
                        todoList.remove(ind);
                        System.out.println("Успешно");
                    }


                } else if (text.equalsIgnoreCase(exit)) {
                    i++;
                } else {
                    System.out.println("Введите корректную команду");

                }
            }

    }


    }



