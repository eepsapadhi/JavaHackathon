package javaHackathon;

import java.util.Scanner;

public class sortIntValue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of  elements");
		int n = sc.nextInt();
		int a[]  = new int[n];
		System.out.println("enter all elements");
		for(int i =0;i<n;i++) {
			a[i]=sc.nextInt();
			
		}
		for(int i =0;i<n;i++) {
			for(int j =i+1;j<n;j++) {
				if(a[i] > a[j]) {
				int temp = a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		}
		
		System.out.println("sort the elements in ascending order");
		for( int i =0;i<n;i++) {
			System.out.println(a[i]);
		
	}
	}
	}
