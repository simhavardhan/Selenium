package ActionsClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;

public class MouseAndKeysHanderover {

	public static void main(String[] args) {
       
		WebDriver de = new ChromeDriver();
		de.manage().window().maximize();
		de.get("https://www.amazon.in/");
		Actions a = new Actions(de);
		a.moveToElement(de.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();
		a.moveToElement(de.findElement(By.xpath("//input[@type='text']"))).keyDown(Keys.SHIFT).click().sendKeys("samsung").build()
		.perform();
		a.moveToElement(de.findElement(By.xpath("//input[@type='text']"))).doubleClick().build().perform();
		a.moveToElement(de.findElement(By.xpath("//a[@id='nav-link-accountList']"))).contextClick().build().perform();
		
		
	}

}
