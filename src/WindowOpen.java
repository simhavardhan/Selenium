import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowOpen {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
	//	WebDriver d = new ChromeDriver();
		WebDriver d = new ChromeDriver();
		d.get("https://rahulshettyacademy.com/locatorspractice/");
		d.findElement(By.cssSelector("input#inputUsername")).sendKeys("Vardhan2gmail.com");
		d.findElement(By.name("inputPassword")).sendKeys("1234567");
		d.findElement(By.className("submit")).click();
		Thread.sleep(2000);
		String s = d.findElement(By.cssSelector("p.error")).getText();
		System.out.println(s);
		d.quit();

	}

}
