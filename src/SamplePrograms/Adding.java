package SamplePrograms;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class Adding {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver re = new ChromeDriver();
		re.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)re;
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(1000);
		List<WebElement> values = re.findElements(By.cssSelector(".table-display td:nth-child(3)"));
		int sum=0;
		for(int i=0; i<values.size();i++) {
			 sum=sum+Integer.parseInt(values.get(i).getText());
		}
		System.out.println(sum);
	
	}

}
