package javaHackathon;

import java.util.Scanner;

public class TotalNoOfIntLowerCaseUpperCase {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("Original string is  : ");
		str = sc.nextLine();
		int upper = 0, lower = 0, number = 0, special = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z')
				upper++;
			else if (ch >= 'a' && ch <= 'z')
				lower++;
			else if (ch >= '0' && ch <= '9')
				number++;
			else
				special++;
		}
		System.out.println("Lower case letters : " + lower);
		System.out.println("upper case letters :" + upper);
		System.out.println("Tota numbers:" + number);
		System.out.println("total special characters:" + special);

	}

}
