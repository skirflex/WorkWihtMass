import java.util.*;
import java.util.stream.Collectors;

public class TelephonesBook {
    public static void main(String[] args) {

        TreeMap<String,String> phoneBook = new TreeMap<>();

        System.out.println("Введите ФИО или номер телефона");
        for (;;)
        {
            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine().trim();
            String phone = text.replaceAll("[^(?:(?:\\+?1\\s*(?:[.-]\\s*)?)?(?:\\(\\s*([2-9]1[02-9]|[2-9][02-8]1|[2-9][02-8][02-9])\\s*\\)|([2-9]1[02-9]|[2-9][02-8]1|[2-9][02-8][02-9]))\\s*(?:[.-]\\s*)?)?([2-9]1[02-9]|[2-9][02-9]1|[2-9][02-9]{2})\\s*(?:[.-]\\s*)?([0-9]{4})(?:\\s*(?:#|x\\.?|ext\\.?|extension)\\s*(\\d+))?$]" , "").trim();
            String name = text.substring(0, text.length() - phone.length()).trim();




            if (name.length() == 0 && phone.length() == 0) {
                System.out.println("Строка не может быть пустой");
                return;

            }
                if (text.equalsIgnoreCase("LIST")) {
                    checkBook(phoneBook);
                    continue;
                }
                //---------------------------------------
                if (name.length()!=0) {

                    if (phone.length() == 0 && phoneBook.containsKey(name) == false) {
                        System.out.println("Введите сотовый");
                        phone = scanner.nextLine().trim();
                        phoneBook.put(name, phone);
                    }
                    else if (phoneBook.containsKey(name) && phone.length()==0)
                    {
                        System.out.println(name + " " + phoneBook.get(name));
                    }
                    else if (phoneBook.containsKey(name) && phone.length() != 0){
                        System.out.println("Хотите изменить существующий контакт?");
                        text = scanner.nextLine();
                        if (text.equalsIgnoreCase("YES"))
                        {
                            phoneBook.put(name,phone);
                        }
                        else if (text.equalsIgnoreCase("NO"))
                        {
                            return;
                        }
                        else
                        {
                            System.out.println("\n");
                            return;
                        }
                    }
                    else
                    {
                        phoneBook.put(name,phone);
                        System.out.println("Добавлен новый контакт");
                    }
                }
                else
                {
                   if (phoneBook.containsValue(phone))
                    {
                        String finalPhone = phone;
                        System.out.println(phoneBook.entrySet().stream().filter(entry -> Objects.equals(entry.getValue(), finalPhone)).map(Map.Entry::getKey).collect(Collectors.toList()) + " " +  phone);

                    }
                   else {
                       System.out.println("Введите ФИО");
                       name = scanner.nextLine().trim();
                       phoneBook.put(name,phone);
                   }
                }
        }
    }
    private static void checkBook (Map <String,String> map )
    {
        for (String key : map.keySet())
        {
            System.out.println(key + " " + map.get(key));
        }

    }


}
