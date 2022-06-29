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
		System.out.println("Enter Last Name :");
		String lastName = scanner.next();
		System.out.println(Pattern.matches("[A-Z][a-z]{3,}", lastName));
		System.out.println("Enter Email ID :");
		String emailid = scanner.next();
		System.out.println(Pattern.matches("[a-z\\d]{5,}@[a-z]{5}.[a-z]{2,}.[a-z]{2,}", emailid));
	}
}
