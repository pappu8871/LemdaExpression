package com.registration;

import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
	interface LastName {
	public abstract void validate_LastName();
	}

	public class RegistrationUC2 {
	public static void main(String[] args){
	Scanner scn = new Scanner(System.in);
	LastName myLamda = () -> {
	String Regex = "^[A-Z]{1}[a-zA-Z]{2,25}$";
	System.out.println("Enter a Last name:");
	String LastName = scn.next();
	Pattern pt =Pattern.compile(Regex);
	if (Pattern.matches(Regex, LastName)) {
	System.out.println("valid LastName");
	} else {
	System.out.println("Invalid LastName");
	}
	};
	myLamda.validate_LastName();
	}
	}


