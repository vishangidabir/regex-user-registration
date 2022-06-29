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
		System.out.println("Enter Mobile Number :");
		String mobileno = scanner.next();
		System.out.println(Pattern.matches("[+]91 [6789]\\d{9}", mobileno));
		System.out.println("Enter Password 1 :");
		String password1 = scanner.next();
		System.out.println(Pattern.matches("[a-z]{8,}", password1));
		System.out.println("Enter Password 2 :");
		String password2 = scanner.next();
		System.out.println(Pattern.matches("(?=.*[A-Z])[A-Z a-z]{8,}", password2));
		System.out.println("Enter Password 3 :");
		String password3 = scanner.next();
		System.out.println(Pattern.matches("(?=.*[A-Z])(?=.*\\d)[A-Z a-z \\d]{8,}", password3));
	}
}
