package Sem_4th.Assignment_01;

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter no of elements: ");
            int n = scan.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter the elements: ");
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            System.out.print("Enter the index to remove: ");
            int target = scan.nextInt();
            for (int i = target; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;
            System.out.print("Array after modifying: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
