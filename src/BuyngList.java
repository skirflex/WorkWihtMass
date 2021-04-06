import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BuyngList {
    public static void main(String[] args) {

        HashMap<String,Integer> buyingList = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        for (;;)
        {
            String buyingName = scanner.nextLine();
            if (buyingName.equalsIgnoreCase("LIST"))
            {
                printmap(buyingList);
                continue;
            }
            if (buyingList.containsKey(buyingName))
            {
                buyingList.put(buyingName,buyingList.get(buyingName) + 1);

            }
            else
            {
                buyingList.put(buyingName,1);
            }
        }
    }
    private static void printmap (Map<String,Integer> map)
    {
        for (String key : map.keySet())
        {
            System.out.println(key + "=>" + map.get(key));
        }
    }
}
