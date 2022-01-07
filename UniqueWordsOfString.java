package javaHackathon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueWordsOfString {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("Original string is  : ");
		str = sc.nextLine();
		Set<String> myset = new HashSet<>();
		String s[] = str.split(" ");

		for (int i = 1; i < s.length; i++) {

			myset.add(s[i]);

		}

		for (String s1 : myset) {

			System.out.println(s1);

		}


	}

}
