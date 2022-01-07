package javaHackathon;

import java.util.Scanner;

public class DuplicateCharInString {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("Original string is  : ");
		str = sc.nextLine();
		char[] dup = str.toCharArray();
		System.out.print("Duplicate character in a string is  : ");
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (dup[i] == dup[j]) {
					System.out.print(dup[j]);
				}

	}

}
	}
}
