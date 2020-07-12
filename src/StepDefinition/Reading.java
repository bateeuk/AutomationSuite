package StepDefinition;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author babs_
 *
 */
public class Reading {
	
	public static void main(String[] args) {
		String line = "";
        try {
        	
        	//String line = "";
        	 
            FileReader reader = new FileReader("G:\\Regist.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
 
            
 
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
            
        }
        
        /**
        try (FileReader reader = new FileReader("G:\\Regist.txt")) {
            int character;
         
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        **/
    }
}
