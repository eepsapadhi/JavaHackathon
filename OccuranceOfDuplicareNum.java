package javaHackathon;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class OccuranceOfDuplicareNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of element in array");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("enter elements of array");
		
		for(int i =0;i<n;i++) {
			a[i]=sc.nextInt();
			}
 HashMap<Integer , Integer> hm = new HashMap<Integer , Integer>();
 for(int i = 0;i<n;i++) {
	 if(hm.containsKey(a[i])) {
		 hm.put(a[i], hm.get(a[i])+1);
	 }
	 else {
		 hm.put(a[i], 1);
	 }
	 }
 System.out.println("print unique element");
		Iterator<Integer> iterator=hm.keySet().iterator();
		while(iterator.hasNext()) {
			int key = iterator.next();
			if(hm.get(key) == 1) {
				System.out.println(key);;
			}
		}
		System.out.println("printing no of occurance of duplicate element");
		System.out.println("no of times");
		iterator = hm.keySet().iterator();
		while(iterator.hasNext()) {
			int key = iterator.next();
			if(hm.get(key) != 1) {
				System.out.println(key +hm.get(key));;
		
			
			
		}
		
	}
	}
}


