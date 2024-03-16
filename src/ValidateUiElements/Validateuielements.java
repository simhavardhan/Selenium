package ValidateUiElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;

public class Validateuielements {

	public static void main(String[] args) {
        
		WebDriver wr = new ChromeDriver();
		wr.get("https://rahulshettyacademy.com/dropdownsPractise/");
		wr.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
	    String Attributevalue =	wr.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style");
		if(Attributevalue.contains("1")) {
		     System.out.println("Element is Enabled");
		     Assert.assertTrue(true);
			
		}
		else {
			System.out.println("Element is Disabled");
			Assert.assertTrue(false);
			
		}
		
	}

}
