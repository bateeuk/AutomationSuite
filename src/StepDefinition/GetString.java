package StepDefinition;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 * @author babs_
 *
 */

public class GetString {
	public static String getTextFromTextFile() {
	      //FilePath
	     String sFilePath = "G:\\temp.txt";
	      //Creating FileReader object
	      FileReader fr = null;
	      //Creating BufferedReader object
	      BufferedReader txtReader  = null;
	      //Handling Exception using Try-Catch
	      String sCurrentLine = null;
	      try {

	         fr =  new FileReader(sFilePath);
	         txtReader = new BufferedReader(fr);
	         //Reading file until file is null
	         while ((sCurrentLine = txtReader.readLine()) != null) {
	           System.out.println(sCurrentLine);
	         }

	        } catch (IOException e) {
	             e.printStackTrace();
	        } finally {
	         try {
	          if (txtReader != null)txtReader.close();
	         } catch (IOException ex) {
	          ex.printStackTrace();
	         }
	        }
	        return sCurrentLine;
	       }

}
