package Sem_4th.Practical;

import java.util.Scanner;

public class P_01 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int a, b, choice;
            System.out.println(
                    "Operations:\n 1. Add(+)\n 2. Subtract(-)\n 3. Divide(/)\n 4. Multiply(*)\n 5. Modulo(%)\n 6. Exit");
            while (true) {
                System.out.print("Enter your choice(1 to 6): ");
                choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter first number: ");
                        a = scan.nextInt();
                        System.out.print("Enter second number: ");
                        b = scan.nextInt();
                        System.out.println("Result: " + (a + b));
                        break;
                    case 2:
                        System.out.print("Enter first number: ");
                        a = scan.nextInt();
                        System.out.print("Enter second number: ");
                        b = scan.nextInt();
                        System.out.println("Result: " + (a - b));
                        break;
                    case 3:
                        System.out.print("Enter first number: ");
                        a = scan.nextInt();
                        System.out.print("Enter second number: ");
                        b = scan.nextInt();
                        if (b == 0)
                            System.out.println("Cannot divide by zero.");
                        else
                            System.out.println("Result: " + (a / b));
                        break;
                    case 4:
                        System.out.print("Enter first number: ");
                        a = scan.nextInt();
                        System.out.print("Enter second number: ");
                        b = scan.nextInt();
                        System.out.println("Result: " + (a * b));
                        break;
                    case 5:
                        System.out.print("Enter first number: ");
                        a = scan.nextInt();
                        System.out.print("Enter second number: ");
                        b = scan.nextInt();
                        System.out.println("Result: " + (a % b));
                        break;
                    case 6:
                        return;
                    default:
                        System.out.println("Invalid Choice.");
                        break;
                }
            }
        }
    }
}
