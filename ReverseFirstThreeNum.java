package javaHackathon;

import java.util.Scanner;

public class ReverseFirstThreeNum {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number of elements in the Array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.print("Enter elements of the Array");
		for(int index=0; index<n; index++)
		{
			arr[index] = sc.nextInt();
		}
		
		System.out.println("Enter the value of K");
		int k = sc.nextInt();
		
		int start_index=0;
		int end_index=k-1;
		
		while(end_index < arr.length)
		{
			reverseArray(arr, start_index, end_index);
			start_index=start_index+k;
			end_index=end_index+k;
		}
		
		System.out.println("Printing output Array");
		for(int i:arr)
		{
			System.out.print(i+",");
		}
	}
	public static void reverseArray(int[] arr, int start_index, int end_index)
	{
		while(start_index < end_index)
		{
			int temp = arr[start_index];
			arr[start_index] = arr[end_index];
			arr[end_index] = temp;
			
			start_index++;
			end_index--;
			
		}

	}

}
