package javaHackathon;

import java.util.Scanner;

public class Palindrome {
	public static boolean palin(String str) {
		int i=0;
		int j =str.length()-1;
		while(i<j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
			}
		return true;
		}
	     public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.next();
		if(palin(str)) {
			System.out.println("palindrome checked:yes");

		}
		else {
			System.out.println("palindrome checked:no");
		}


	}

}
