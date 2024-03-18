package Sem_4th.Practical;

import java.util.Scanner;

public class P_02 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter no of lines to print: ");
            int n = scan.nextInt(), k = 1;
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < i; j++)
                    System.out.print(k++ + " ");
                System.out.println();
            }
        }
    }
}
