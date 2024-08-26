package lab3;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String Name = sc.nextLine();
        System.out.println("Enter your Nationality: ");
        String Nationality = sc.nextLine();
        System.out.println("Enter your age: ");
        int Age = sc.nextInt();
        Citizen citizen = new Citizen(Name,Nationality, Age );
        citizen.IsEligible();
        sc.close();
    }

}
