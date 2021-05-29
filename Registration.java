package com.registration;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
@FunctionalInterface
interface FirstName {
	
	public abstract void validate_FirstName();
}
public class RegistrationUC1 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		FirstName myLamda = () -> {
			String Regex = "^[A-Z]{1}[a-zA-Z]{2,25}$";
			System.out.println("Enter a First name:");
			String FirstName = scn.next();
			Pattern pt =Pattern.compile(Regex);
			if (pt.matches(Regex, FirstName)) {
				System.out.println("valid FirstName");
			} else {
				System.out.println("Invalid FirstName");
			}
		};
		myLamda.validate_FirstName();
	}
}
