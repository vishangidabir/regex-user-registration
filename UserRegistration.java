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
		String mobileno = scanner.nextLine();
		System.out.println(Pattern.matches("[+]91 [6-7]\\d{9}", mobileno));
		System.out.println("Enter Password 1 :");
		String password1 = scanner.next();
		System.out.println(Pattern.matches("[a-z]{8,}", password1));
		System.out.println("Enter Password 2 :");
		String password2 = scanner.next();
		System.out.println(Pattern.matches("(?=.*[A-Z])[A-Z a-z]{8,}", password2));
		System.out.println("Enter Password 3 :");
		String password3 = scanner.next();
		System.out.println(Pattern.matches("(?=.*[A-Z])(?=.*\\d)[A-Z a-z \\d]{8,}", password3));
		System.out.println("Enter Password 4 :");
		String password4 = scanner.next();
		System.out.println(
				Pattern.matches("(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&-+=()])[A-Z a-z \\d !@#$%^&-+=()]{8,}", password4));
		System.out.println();

		System.out.println("\nAll valid email samples validation is as follows : ");
		boolean sample1 = Pattern.matches("[a-z]+[@][a-z]+[.][a-z]{2,3}", "abc@yahoo.com");
		System.out.println("Email ID 1 : " + sample1);
		boolean sample2 = Pattern.matches("[a-z]+[-][0-9]+[@][a-z]+[.][a-z]{2,3}", "abc-100@yahoo.com");
		System.out.println("Email ID 2 : " + sample2);
		boolean sample3 = Pattern.matches("[a-z]+[.][0-9]+[@][a-z]+[.][a-z]{2,3}", "abc.100@yahoo.com");
		System.out.println("Email ID 3 : " + sample3);
		boolean sample4 = Pattern.matches("[a-z]+[0-9]+[@][a-z]+[.][a-z]{2,3}", "abc111@abc.com");
		System.out.println("Email ID 4 : " + sample4);
		boolean sample5 = Pattern.matches("[a-z]+[-][0-9]+[@][a-z]+[.][a-z]{2,3}", "abc-100@abc.net");
		System.out.println("Email ID 5 : " + sample5);
		boolean sample6 = Pattern.matches("[a-z]+[.][0-9]+[@][a-z]+[.][a-z]{2,3}[.][a-z]{1,2}", "abc.100@abc.com.au");
		System.out.println("Email ID 6 : " + sample6);
		boolean sample7 = Pattern.matches("[a-z]+[@][0-9][.][a-z]{2,3}", "abc@1.com");
		System.out.println("Email ID 7 : " + sample7);
		boolean sample8 = Pattern.matches("[a-z]+[@][a-z]{5,}[.][a-z]{2,3}[.][a-z]{2,3}", "abc@gmail.com.com");
		System.out.println("Email ID 8 : " + sample8);
		boolean sample9 = Pattern.matches("[a-z]+[+][0-9]+[@][a-z]{5,}[.][a-z]{2,3}", "abc+100@gmail.com");
		System.out.println("Email ID 9 : " + sample9);
		System.out.println();

		System.out.println("\nAll Invalid email samples validation is as follows : ");
		boolean email1 = Pattern.matches("[a-z]{4,}@[a-z].[a-z]{2,}", "abc");	//must contains “@” symbol
		System.out.println("Email ID 1 :" + email1);
		boolean email2 = Pattern.matches("[a-z]{3,}@[a-z]{2,}.[a-z]{2,}", "abc@.com.my");	//tld can not start with dot
		System.out.println("Email ID 2 :" + email2);
		boolean email3 = Pattern.matches("[a-z\\d]{3,}@[a-z]{2,}.[a-z]", "abc123@.gmail.a");	//“.a” is not a valid tld,last tld must contains at least two character
		System.out.println("Email ID 3 :" + email3);
		boolean email4 = Pattern.matches("[a-z\\d]{3,}@[a-z]{2,}.[a-z]{2,}", "abc123@.com");	//tld can not start with dot
		System.out.println("Email ID 4 :" + email4);
		boolean email5 = Pattern.matches("[a-z\\d]{3,}@[a-z]{2,}.[a-z]{2,}", "abc123@.com.com");	//tld can not start with dot
		System.out.println("Email ID 5 :" + email5);
		boolean email6 = Pattern.matches("[a-z]{3,}@[a-z]{2,}.[a-z]{2,}", ".abc@abc.com");	//email’s 1st character can not start with
		System.out.println("Email ID 6 :" + email6);
		boolean email7 = Pattern.matches("[a-z]{3,}@[a-z]{3,}.[a-z]{2,}", "abc()*@gmail.com");	//email’s is only allow character, digit, underscore and dash
		System.out.println("Email ID 7 :" + email7);
		boolean email8 = Pattern.matches("[a-z]{3,}@[a-z]{3,}.[a-z]{2,}", "abc@%*.com");	//email’s tld is only allow character and digit
		System.out.println("Email ID 8 :" + email8);
		boolean email9 = Pattern.matches("[a-z\\d]{3,}@[a-z]{3,}.[a-z]{2,}", "abc..2002@gmail.com");	//double dots “.” are not allow
		System.out.println("Email ID 9 :" + email9);
		boolean email10 = Pattern.matches("[a-z]{3,}@[a-z]{2,}.[a-z]{2,}", "abc.@gmail.com");	//email’s last character can not end with dot “.”
		System.out.println("Email ID 10 :" + email10);
		boolean email11 = Pattern.matches("[abc]{3,}@[a-z]{2,}.[a-z]{2,}", "abc@abc@gmail.com");	//double “@” is not allow
		System.out.println("Email ID 11 :" + email11);
		boolean email12 = Pattern.matches("[a-z]{3,}@[a-z]{2,}.[a-z]{3,}.[a-z]{2,}", "abc@gmail.com.1a");	//email’s tld which has two characters can not contains digit
		System.out.println("Email ID 12 :" + email12);
		boolean email13 = Pattern.matches("[abc]{3,}@[a-z]{2,}.[a-z]{3,}.[a-z]{2,}", "abc@gmail.com.aa.au");	//cannont have multiple email’s tld
		System.out.println("Email ID 13 :" + email13);
	}
}
