package StepDefinition;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
/**
 * @author babs_
 *
 */

public class Compare {
	 public static void main(String args[]){
	      try ( BufferedReader reader1 = new BufferedReader(new FileReader("G:/output.txt"));
	              BufferedReader reader2 = new BufferedReader(new FileReader("G:/input.txt")) ){

	              //assuming file1.txt is smaller than file2.txt in terms of no. of lines
	              HashSet<String> file1 = new HashSet<String>();

	              String s = null;
	              while( ( s = reader1.readLine()) != null){
	                 file1.add(s);
	              }

	              while( (s = reader2.readLine()) != null ){
	                 if(file1.contains(s))
	                    System.out.println(s);
	              }
	        }
	        catch(IOException e){
	           System.out.println(e);
	        }

	     }
}
