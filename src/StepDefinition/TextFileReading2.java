package StepDefinition;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class TextFileReading2 {
	public static void main(String[] args) {
	try {
		   File file = new File("G:/input.txt");
		   FileReader fr = new FileReader(file);
		   char[] data = new char[(int) file.length()];
		   fr.read(data);   
		   System.out.println(data);
		   fr.close();
		  } catch (IOException e) {
		   e.printStackTrace();
		  }
	}

}
