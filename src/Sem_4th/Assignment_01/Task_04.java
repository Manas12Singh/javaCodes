package Sem_4th.Assignment_01;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            Calendar calendar = Calendar.getInstance();
            System.out.println("Options:\n 1. Current Year\n 2. Current Month\n 3. Current Day\n 4. Exit");
            while (true) {
                System.out.print("Enter your option(1 to 4): ");
                int n = scan.nextInt();
                switch (n) {
                    case 1:
                        System.out.println(calendar.get(Calendar.YEAR));
                        break;
                    case 2:
                        System.out.println(calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault()));
                        break;
                    case 3:
                        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Not applicable.");
                        break;
                }
            }
        }
    }
}
