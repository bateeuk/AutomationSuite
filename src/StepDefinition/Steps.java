package StepDefinition;
/**
 * @author babs_
 * 10/06/2020
 *
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
/**
 * @author babs_
 *
 */

public class Steps {

	public WebDriver driver;
	public String baseUrl;
	public WebElement element;
	
	@Given("^User would logged into the Car registration screen$")
    public void user_would_logged_into_the_car_registration_screen() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cartaxcheck.co.uk/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @When("^User clicks and enters REG Number$")
    public void user_clicks_and_enters_reg_number() throws Throwable {
         String line;
    		 try {
 	            FileReader reader = new FileReader("G:/input.txt");
 	            BufferedReader bufferedReader = new BufferedReader(reader);

 	            while ((line = bufferedReader.readLine()) != null) {
 	                System.out.println(line);
 		            driver.findElement(By.id("vrm-input")).click();
 		        	driver.findElement(By.id("vrm-input")).clear();
 		    		driver.findElement(By.id("vrm-input")).sendKeys(line);
 	           }

	            reader.close();

	 
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
    	
    }



	@Then("^User is directed to the Vehicle Identity screen$")
    public void user_is_directed_to_the_vehicle_identity_screen() throws Throwable {
    	String sPageDetail = driver.findElement(By.xpath("//h4[contains(text(),'Vehicle Identity')]")).getText();
    	System.out.println(sPageDetail);

    }

    @Then("^User logs down vehicle details$")
    public void user_logs_down_vehicle_details() throws Throwable {
    	
    	WebElement elementR = driver.findElement(By.xpath("//dd[contains(text(),'T29TEE')]"));
    	String RegText = elementR.getText();
    	System.out.println(RegText);
    	WebElement elementM = driver.findElement(By.xpath("//dd[contains(text(),'Mercedes-Benz')]"));
    	String MakeText = elementM.getText();
    	System.out.println(MakeText);
    	WebElement elementMo = driver.findElement(By.xpath("//dd[contains(text(),'E 220 D Amg Line Auto')]"));
    	String ModelText = elementMo.getText();
    	System.out.println(ModelText);
    	WebElement elementC = driver.findElement(By.xpath("//dd[contains(text(),'Silver')]"));
    	String ColText = elementC.getText();
    	System.out.println(ColText);
    	WebElement elementY = driver.findElement(By.xpath("/html//div[@id='m']/div[@class='jsx-79705764']/div[3]/div[1]/div/span[@class='jsx-2222053380']/div[2]/dl[5]/dd[@class='jsx-3496807389']"));
    	String YeaText = elementY.getText();
    	System.out.println(YeaText);
    	
    	try {
    		   File file = new File("G:/output.txt");
    		   if(!file.exists()){
    		    file.createNewFile();
    		   }
    		   
    		   FileWriter fw = new FileWriter(file);
    		   fw.write(RegText = elementR.getText());
    		   fw.write("\n");
    		   fw.write(MakeText = elementM.getText());
    		   fw.write("\n");
    		   fw.write(ModelText = elementR.getText());
    		   fw.write("\n");
    		   fw.write(ColText = elementM.getText());
    		   fw.write("\n");
    		   fw.write(YeaText = elementM.getText());
    		   fw.write("\n");
    		   
    		   fw.close();
    		  } catch (Exception e) {
    		   e.printStackTrace();
    		  }
    	
    	 
    	 driver.close();
    	 
          
    }

    @And("^should be present at the Free Car Check screen$")
    public void should_be_present_at_the_free_car_check_screen() throws Throwable {
    	driver.getTitle().compareTo("Free Car Check");
        
    }

    @And("^User selects the Free Car Check button$")
    public void user_selects_the_free_car_check_button() throws Throwable {
    	
    	
    	driver.findElement(By.xpath("//button[contains(@class,'jsx-3655351943')]")).isDisplayed();
    	driver.findElement(By.xpath("//button[contains(@class,'jsx-3655351943')]")).click();
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	
        
    }

}
