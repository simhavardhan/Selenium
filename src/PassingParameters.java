import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class PassingParameters {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(2000);
	
		String password = PassingParameters.getpassword(d);
		d.get("https://rahulshettyacademy.com/locatorspractice/");
		d.findElement(By.xpath("//div/form[@class='form']/input[1]")).sendKeys("Krishna@gmail.com");
		
		d.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		
		d.findElement(By.xpath("//div[@class='checkbox-container']/span[1]/input")).click();
		d.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		d.quit();
		

	}
	
	public static String getpassword(WebDriver r) throws InterruptedException {
		
		r.get("https://rahulshettyacademy.com/locatorspractice/");
		
		r.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		r.findElement(By.xpath("//div/button[@class = 'reset-pwd-btn']")).click();
		
		String forpassword = r.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		String getpasswor = forpassword.split("'")[1].split("'")[0];
		
		
		return getpasswor;
	}

}
