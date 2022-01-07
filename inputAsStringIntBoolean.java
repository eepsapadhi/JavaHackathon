package javaHackathon;

import java.util.Scanner;

public class inputAsStringIntBoolean {

	 static boolean  isNumber(String s) {
			try {
				int i = Integer.parseInt(s);
			}catch(NumberFormatException nfe)
			{
			return false;
			}
			return true;
		}
		  static boolean  isBoolean(String s) {
			return Boolean.parseBoolean(s);
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter any type of input : ");
			String input =sc.nextLine();
			if(isNumber(input))
				System.out.println("Integer");
			else if(isBoolean(input))
				System.out.println("Boolean");
			else
				System.out.println("String");

	}

}
