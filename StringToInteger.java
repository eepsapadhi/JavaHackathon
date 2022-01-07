package javaHackathon;

import java.util.Scanner;

public class StringToInteger {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("Original string is  : ");
		str = sc.nextLine();
		int i=Integer.parseInt(str);
		System.out.println(i);

	}

}
