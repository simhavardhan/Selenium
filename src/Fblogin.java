import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fblogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver wb = new ChromeDriver();
		
		wb.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=120&lwc=1348092");
		
		wb.findElement(By.name("email")).sendKeys("788654");
		wb.findElement(By.name("pass")).sendKeys("23423");
		wb.findElement(By.name("login")).click();
		Thread.sleep(2000);
	String	v = wb.findElement(By.className("_9ay7")).getText();
		
		System.out.println(v);

	}

}
