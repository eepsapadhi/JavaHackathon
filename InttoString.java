package javaHackathon;

import java.util.Scanner;

public class InttoString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter numbers : ");
		int i = sc.nextInt();

		String s = String.valueOf(i);
		System.out.println(i + 100);
		System.out.println(s + 100);


	}

}
