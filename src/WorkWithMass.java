import java.util.Scanner;

public class WorkWithMass {
    public static void main(String[] args) {


       // Scanner scanner = new Scanner(System.in);
       // System.out.println("Введите длину массива");
      //  int x = scanner.nextInt();

        float [] tempr = new float[30];
        int zdorovie = 0;
        float sd = 0;
        System.out.print("Температуры пациентов: ");
        for (int i = 0; i < tempr.length; i++) {

            tempr[i] = ((float)  Math.random() * 7 + 34 );
            System.out.print(tempr[i] + " ");
            sd += tempr[i];
            if (tempr[i] >= 36.2 && tempr[i] <= 36.9)
            {
                zdorovie++;
            }

        }
        sd = sd / tempr.length;
        System.out.println("\nСредняя температура: " + sd);
        System.out.println("Количество здоровых: " + zdorovie);


    }
}
