import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rahulsettypage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://rahulshettyacademy.com/locatorspractice/");
		
		wd.findElement(By.id("inputUsername")).sendKeys("vardhan@gmail.com");
		wd.findElement(By.name("inputPassword")).sendKeys("122344");
		wd.findElement(By.className("submit")).click();
		Thread.sleep(2000);
	String st=	wd.findElement(By.cssSelector("p.error")).getText();
	System.out.println(st);
	
	wd.findElement(By.linkText("Forgot your password?")).click();
	wd.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("krishna");// absoultexpath
	wd.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("vardhan@gmail.com");
	wd.findElement(By.xpath("//input[@type='text'][2]")).clear();
	wd.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("krishna@gmail.com");
	wd.findElement(By.xpath("//form/input[3]")).sendKeys("9951318877");
	wd.findElement(By.cssSelector(".reset-pwd-btn")).click();
	String g = wd.findElement(By.cssSelector("form p")).getText();
	System.out.println(g);
	wd.findElement(By.xpath("//div[contains(@class,'pwd')]/button[1]")).click();
	wd.findElement(By.cssSelector("#inputUsername")).sendKeys("krishna");
	Thread.sleep(1000);
	wd.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
	wd.findElement(By.id("chkboxOne")).click(); //div[@class='checkbox-container']/span[2]/input
	wd.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	

	}

}
