package javaHackathon;

import java.util.Scanner;

public class RwmoveGivenCharFromString {

	public static void main(String[] args) {
		
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("Original string is  : ");
		str = sc.nextLine();
		System.out.println(removeCharAt(str,3));
		
	}
	public static String removeCharAt(String s,int pos) {
		return s.substring(0,pos)+s.substring(pos+1);
		

	}

}
