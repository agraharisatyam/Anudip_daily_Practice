package anudip;

import java.util.Scanner;

public class SumTillZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();

        if (num >= 0) {
            int sum = 0;
            for (int i = 0; i <= num; i++) {
                sum += i;
            }
            System.out.println("Sum from 0 to " + num + " = " + sum);
        } else {
            System.out.println("Please enter a positive number.");
        }

        sc.close();
    }
}

