package AlertHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlretHandilings {

	public static void main(String[] args) {
      
		WebDriver wb = new ChromeDriver();
		String name = "krishna";
		wb.manage().window().maximize();
		wb.get("https://rahulshettyacademy.com/AutomationPractice/");
		wb.findElement(By.xpath("//input[@id='name']")).sendKeys(name);
		wb.findElement(By.xpath("//input[@id='alertbtn']")).click();
		System.out.println(wb.switchTo().alert().getText());
		wb.switchTo().alert().accept();
		wb.findElement(By.xpath("//input[@id='name']")).sendKeys(name);
		wb.findElement(By.cssSelector("input[id='confirmbtn']")).click();
		System.out.println(wb.switchTo().alert().getText());
		wb.switchTo().alert().dismiss();
		
	}

}
