package javaHackathon;

import java.util.Scanner;

public class LowerCaseToUpperCase {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.print("Enter a String in to upper case : ");
		String S= sc.next(); 
		System.out.print("Converting the input string to Lower case : ");
		System.out.println(S.toUpperCase());

	}

}
