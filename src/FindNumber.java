import java.lang.reflect.Array;
import java.util.*;

public class FindNumber {
    public static void main(String[] args) {

        String[] letters = {"A", "C", "M", "T", "B", "P", "O", "H", "E", "Y", "K", "X"};
        Arrays.sort(letters);
        String[] numbers = {"111", "222", "333", "444", "555", "666", "777", "888", "999"};
        ArrayList<String> number = new ArrayList<>();
        HashSet<String> numberlist = new HashSet<>();
        TreeSet<String> numberList = new TreeSet<>();

        for (int i = 1; i <= 197; i++) {
            for (int j = 0; j < letters.length; j++) {
                for (int z = 0; z < numbers.length; z++) {
                    for (int j1 = 0; j1 < letters.length; j1++) {
                        for (int j2 = 0; j2 < letters.length; j2++) {
                            Integer sh = i;
                            String region = sh.toString();
                            number.add(letters[j] + numbers[z] + letters[j1] + letters[j2] + region);
                            }
                        }
                    }
                }
            }
            Collections.sort(number);
            numberlist.addAll(number);
            numberList.addAll(number);

            System.out.println("Введите автомобильный номер");
            for (; ; ) {

                long start = System.nanoTime();
                Scanner scanner = new Scanner(System.in);
                String text = scanner.nextLine();
                System.out.println("Способ прямого перебора");
                if (number.contains(text)) {
                    System.out.println("Такой номер есть");
                    System.out.println(text);
                } else {
                    System.out.println("Такой номер не найден");
                }
                long finish = System.nanoTime();
                System.out.println((finish - start));
                System.out.println("====================");
                // ============================================================
                System.out.println("Способ с применением бинарного поиска");
                long start1 = System.nanoTime();
                int index = Collections.binarySearch(number, text);
                System.out.println(index);
                if (index >= 0) {
                    System.out.println("Такой номер есть");
                } else {
                    System.out.println("Номер отсутствует");
                }
                long finish1 = System.nanoTime();
                System.out.println((finish1 - start1));

                // ============================================
                System.out.println("=============");
                System.out.println("Поиск с помощью Hashset");
                long start2 = System.nanoTime();
                if (numberList.contains(text))
                {
                    System.out.println("Номер найден");
                }
                else
                {
                    System.out.println("Не найден");
                }
                long finish2 = System.nanoTime();
                System.out.println((finish2 - start2));
                // ============================================
                System.out.println("=============");
                System.out.println("Поиск с помощью Treeset");
                long start3 = System.nanoTime();
                if (numberlist.contains(text))
                {
                    System.out.println("Номер найден");
                }
                else
                {
                    System.out.println("Не найден");
                }
                long finish3 = System.nanoTime();
                System.out.println((finish3 - start3));

            }


        }


    }






