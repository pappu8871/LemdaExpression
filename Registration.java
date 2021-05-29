package com.registration;

import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
interface Emailid {
public abstract void validate_email();
}
public class RegistrationUC3 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		Emailid myLamda = () -> {
		
		String Regex = "^[a-z]{3,15}[.][a-z]{3,15}+[@][a-z]{5,10}[.][a-z]{2}[.][a-z]{2}$";
		System.out.println("Enter a email id:");
		String Emailid = scn.next();
		Pattern pt =Pattern.compile(Regex);
		if (Pattern.matches(Regex, Emailid)) {
		System.out.println("valid emailid");
		} else {
		System.out.println("Invalid emailid");
		}
		};
		myLamda.validate_email();
		}
		}

