package javaHackathon;

import java.util.Scanner;

public class SubSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.next();
		System.out.print("Return value : ");
		System.out.println(str.subSequence(0, 5));

		System.out.print("Return value : ");
		System.out.println(str.subSequence(0, 4));

	}

}
