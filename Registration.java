package com.registration;

import java.util.Scanner;
import java.util.regex.Pattern;
@FunctionalInterface
interface Password3 {

public abstract	void validate_pass();

}
public class RegistrationUC8 {
public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		Password3 myLamda = () -> {
			
			String Regex = "^[a-zA-Z0-9@#$%^&+=_-]{8,25}$";
			System.out.println("Enter Your Password:");
			String password = scn.next();
			Pattern pt =Pattern.compile(Regex);
			if (pt.matches(Regex, password)) {
				System.out.println("valid Password");
			} else {
				System.out.println("Invalid Password");
			}
		};
		myLamda.validate_pass();
	}
}
