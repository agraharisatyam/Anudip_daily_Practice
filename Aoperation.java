package anudip;

import java.util.Scanner;

class Aoperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        //operations
        double sum = num1 + num2;
        double Substraction = num1 - num2;
        double Multiplication = num1 * num2;
        

       
    //output for the empoloyee detai;
        System.out.println( sum);
        System.out.println(Substraction);
        System.out.println(Multiplication);
        sc.close();
    }
}
