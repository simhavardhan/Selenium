import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoopDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver r = new ChromeDriver();
		
		r.get("https://rahulshettyacademy.com/dropdownsPractise/");
		r.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		WebElement c = r.findElement(By.id("hrefIncAdt"));
		int i=1;
		while(i<=5) {
			
			c.click();
			i++;
		}
		r.findElement(By.id("btnclosepaxoption")).click();

	}

}
