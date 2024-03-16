import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver ve = new ChromeDriver();
		
		ve.get("https://rahulshettyacademy.com/dropdownsPractise/");
		ve.findElement(By.xpath("//input [@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		Thread.sleep(1000);
		ve.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@text='Vishakhapatnam (VTZ)']")).click();
		Thread.sleep(1000);
		ve.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='HYD']")).click();
	}

}
