package javaHackathon;

import java.util.Scanner;

public class NoOfOccuranceOfAllChar {

	public static int count(String s, char c) {
		int Result = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				Result++;
			}

		}
		return Result;
	}
	public static void main(String[] args) {
		
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("Original string is  : ");
		str = sc.nextLine();
		char c = 'm';
		System.out.println(count(str, c));

	}

}
