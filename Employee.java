package anudip;

import java.util.Scanner;

class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name, address,department;
        long phoneNumber;
        char gender;
        int sal;
        
        
        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter your phone number: ");
        phoneNumber = sc.nextLong();
        sc.nextLine(); 

        System.out.print("Enter your address: ");
        address = sc.nextLine();

        System.out.print("Enter your gender: ");
        gender = sc.next().charAt(0);

        System.out.print("Enter your address: ");
        department = sc.nextLine();
        
        System.out.print("Enter your address: ");
        sal=sc.nextInt();



        //print the details
        System.out.println( name);
        System.out.println( phoneNumber);
        System.out.println( address);
        System.out.println( gender);
        System.out.println( department);
        System.out.println( sal);
        
        sc.close();
    }
}
