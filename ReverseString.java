package javaHackathon;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String str, rev = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string to Reverse : ");
		str = sc.nextLine();
		int n = str.length();
		for (int i = n - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("Reverse string is : " + rev);

	}

}
