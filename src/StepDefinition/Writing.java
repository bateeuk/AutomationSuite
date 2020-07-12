package StepDefinition;
import java.io.FileWriter;
import java.io.IOException;
/**
 * @author babs_
 *
 */
public class Writing {
	 public static void main(String[] args) {
	        try {
	            FileWriter writer = new FileWriter("G:\\temp.txt", true);
	            writer.write("P700TEE");
	            writer.write("\r\n");   // write new line
	            writer.write("T29TEE");
	            writer.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	 
	    }
}
