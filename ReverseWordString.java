package javaHackathon;

import java.util.Scanner;

public class ReverseWordString {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("Original string is  : ");
		str = sc.nextLine();
		String words[] = str.split("\\s");
		String reversedString = "";
		for (int i = 0; i < words.length; i++) {
			if (i == words.length - 1)
				reversedString = words[i] + reversedString;
			else
				reversedString = " " + words[i] + reversedString;

		}
		System.out.println("reversed String is : " + reversedString);

	}

}
