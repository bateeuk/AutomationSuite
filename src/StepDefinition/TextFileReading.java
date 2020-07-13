package StepDefinition;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReading {
	 public static void main(String[] args) {
	        try {
	            FileReader reader = new FileReader("G:/input.txt");
	            BufferedReader bufferedReader = new BufferedReader(reader);
	 
	            String line;
	 
	            while ((line = bufferedReader.readLine()) != null) {
	            	//System.out.println(bufferedReader.readLine());
	                System.out.println(line);
	                String liner = line;
	                System.out.println(liner);
	            }
	            reader.close();
	 
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

}
