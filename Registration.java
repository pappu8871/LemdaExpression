package com.registration;

import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
interface Password {

public abstract void validate_Pass();
}

public class RegistrationUC5 {

public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		Password myLamda = () -> {
		
		String Regex = "^[a-zA-Z]{8,25}$";
		System.out.println("Enter your Password:");
		String password = scn.next();
		Pattern pt =Pattern.compile(Regex);
		if (Pattern.matches(Regex, password)) {
		System.out.println("valid password");
		} else {
		System.out.println("Invalid password");
		}
		};
		myLamda.validate_Pass();
		}
		}

