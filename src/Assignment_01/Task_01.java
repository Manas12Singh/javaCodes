package Assignment_01;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter String 1: ");
            String s1=scan.next();
            System.out.print("Enter String 2: ");
            String s2=scan.next();
            if(s1.compareTo(s2)==0)
                System.out.println("Strings are equal.");
            else
                System.out.println("Strings are not equal.");
        }
    }
}
