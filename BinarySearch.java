package javaHackathon;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number of elements in the Array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter sorted elements of the Array");
		for(int index=0; index<n; index++)
		{
			arr[index] = sc.nextInt();}
		System.out.println("Enter elements to search");
		int tosearch = sc.nextInt();
System.out.println("The element is found at index : " + search(arr,tosearch));
    }
	public static int search(int[] arr, int tosearch)
	{
		return binarysearch(arr, 0, arr.length-1, tosearch);
	}
public static int binarysearch(int[] arr, int startindex, int endindex, int tosearch)
	{
		if(startindex == endindex && arr[startindex] != tosearch)
		{
			return -1;
		}
		int mid = (startindex + endindex)/2;
		if(tosearch < arr[mid])
		{
			return binarysearch(arr, startindex, mid-1, tosearch);
		}
		else if(tosearch > arr[mid])
		{
			return binarysearch(arr, mid+1, endindex, tosearch);
		}
		else
		{
			return mid;
		}


	}

}


