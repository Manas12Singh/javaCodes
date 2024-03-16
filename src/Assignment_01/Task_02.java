package Assignment_01;

import java.util.Arrays;
import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter no of elements: ");
            int n = scan.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter the elements: ");
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            Arrays.sort(arr);
            System.out.print("Duplicate elements: ");
            for (int i = 0; i < n; i++) {
                int j = i;
                while (j < n - 1 && arr[j] == arr[j + 1]) {
                    j++;
                }
                if (i != j) {
                    System.out.print(arr[i] + " ");
                    i = j;
                }
            }
            System.out.println();
        }
    }
}
