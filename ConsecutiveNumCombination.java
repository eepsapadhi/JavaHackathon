package javaHackathon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsecutiveNumCombination {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.print("N= ");
		int n=Integer.parseInt(br.readLine());
		String seq=" ";
		for(int i = n - 1; i >= 1; i--){
            int sum = 0;
            seq = "";
            boolean status = false;
            for(int j = i; j >= 1; j--){
                sum += j;
                seq = j + " + " + seq;
                if(sum == n){
                    status = true;
                    break;
                }
            }
            if(status)
                System.out.println(seq.substring(0, seq.lastIndexOf('+')));
        }

	}

}
