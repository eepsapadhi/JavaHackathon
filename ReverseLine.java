package javaHackathon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReverseLine {

	public static void main(String[] args) throws IOException {
 List<String> strings = new ArrayList<String>();
		 
		 //Read the input file
		 BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\Users\\Ranjan\\Ranu\\Nov2020\\src\\day12ReadWriteFile\\Subha1.txt")));
		 String line = reader.readLine();
		 System.out.println("Input file contents:");
         while (line != null)
         {
        	 System.out.println(line);
        	 strings.add(line);
        	 line = reader.readLine();
         }
         System.out.println("====================");
         reader.close();
         System.out.println("Output file contents:");
         //Write to the output file
         BufferedWriter writer = new BufferedWriter(new FileWriter(new File("C:\\Users\\Ranjan\\Ranu\\Nov2020\\src\\day12ReadWriteFile\\Subha1_reverse.txt")));
         for(int index=strings.size()-1; index >= 0; index--)
         {
        	 System.out.println(strings.get(index));
        	 writer.write(strings.get(index));
        	 writer.newLine();
         }
         writer.flush();
         writer.close();
         System.out.println("====================");

	}

}
