package javaHackathon;

import java.util.Scanner;

public class SplitString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.next();

		String[] result = str.split(",");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

	}

}
