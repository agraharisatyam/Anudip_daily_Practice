package anudip;

import java.util.Scanner;

public class smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int smallest;
        System.out.println("Enter 5 numbers:");
        int num = sc.nextInt();
        smallest = num;

        for (int i = 1; i < 5; i++) {
            num = sc.nextInt();
            if (num < smallest) {
                smallest = num;
            }
        }

        System.out.println("Smallest number is: " + smallest);
        sc.close();
    }
}

