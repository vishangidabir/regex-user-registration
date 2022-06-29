package com.bridgelabz;

import java.util.regex.Pattern;
import java.util.Scanner;

public class UserRegistration {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to UserRegistration program using Regex !");
		System.out.println("Enter First Name :");
		String firstName = scanner.next();
		System.out.println(Pattern.matches("[A-Z][a-z]{3,}", firstName));
	}
}
