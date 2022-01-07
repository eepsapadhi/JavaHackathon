package javaHackathon;

import java.util.Scanner;

public class ThreeBooleanVariable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first variable:");
		boolean a = sc.nextBoolean();
		System.out.println("enter the second variable:");
		boolean b = sc.nextBoolean();
		System.out.println("enter the third variable:");
		boolean c = sc.nextBoolean();
		boolean res;
		if(a) {
			res = b || c;
		}
		else {
			res = b && c;
		}
       if (res)
       { System.out.println("two out of three boolean are true");
       
       }
       else {
    	   System.out.println("two boolean are false");
       }
	}

}
