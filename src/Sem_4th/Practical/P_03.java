package Sem_4th.Practical;

import java.util.Scanner;

public class P_03 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter no of students: ");
            int n = scan.nextInt();
            int[] marks = new int[n];
            int m81_100 = 0, m61_80 = 0, m41_60 = 0, m0_40 = 0;
            for (int i = 0; i < n; i++)
                marks[i] = scan.nextInt();
            for (int i : marks) {
                if (i <= 40)
                    m0_40++;
                else if (i <= 60)
                    m41_60++;
                else if (i <= 80)
                    m61_80++;
                else
                    m81_100++;
            }
            System.out.println("Students in range 81-100: " + m81_100);
            System.out.println("Students in range 61-80: " + m61_80);
            System.out.println("Students in range 41-60: " + m41_60);
            System.out.println("Students in range 0-40: " + m0_40);
        }
    }
}
