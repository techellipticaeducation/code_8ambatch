package ScannerDemo;

import java.util.Scanner;

public class ScannerDemoClass {
	public static void main(String[] args) {
		// to take input from user
		// We are taking 2 number from users and we are adding that 
		
		int k = 10;
		System.out.println("Welcome to our addition algorithm");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		int i = scan.nextInt();
		System.out.println("Enter Second number");
		int j = scan.nextInt();
		int sum = i + j;
		System.out.println("Sum is " + sum);
		
	}
}
