package javaHackathon;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("e");
		a1.add("e");
		a1.add("p");
		a1.add("s");
		a1.add("a");
		Iterator<String> itr = a1.iterator();
		System.out.println("list elements-");
		while(itr.hasNext())
		System.out.println(itr.next());
	}

}
