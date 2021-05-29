package com.registration;

import java.util.Scanner;

import java.util.regex.Pattern;

@FunctionalInterface
interface MobileNum {
public abstract void valid_Mobile();	
}

public class RegistrationUC4 {

public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		MobileNum myLamda = () -> {
		
		String Regex = "^[91]{2}\s{0,1}[789]{1}[0-9]{9}$";
		System.out.println("Enter a Mobile Number:");
		String Mob = scn.next();
		Pattern pt =Pattern.compile(Regex);
		if (Pattern.matches(Regex, Mob)) {
		System.out.println(" Mobile Number is Valid");
		} else {
		System.out.println("Mobile Number is  InValid");
		}
		};
		myLamda.valid_Mobile();
		}
		}

