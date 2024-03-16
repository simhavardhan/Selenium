package SamplePrograms;

import static org.testng.Assert.fail;

import java.time.Duration;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apsrtc {

	public static void main(String[] args) throws InterruptedException {

		WebDriver de = new ChromeDriver();
		de.get("https://in.search.yahoo.com/search?fr=mcafee&type=E211IN826G91791&p=apsrtc");
		//de.manage().window().maximize();
		de.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Supplier<Date> date = ()-> new Date();
		System.out.println(date.get());
		de.findElement(By.xpath("//li//div[@class='dd algo algo-sr relsrch fst richAlgo']//a[contains(text(),'APSRTC Official Website for Online Bus Ticket Booking ...')]"))
		.click();
		int twindows= de.getWindowHandles().size();
		System.out.println(twindows);
		Set<String> Windows =de.getWindowHandles();
		Iterator<String>itr=Windows.iterator();
		String Parentwindow = itr.next();
		String Childwindow = itr.next();
		de.switchTo().window(Childwindow);
		String loc= "RAJAMAHENDRAVARAM";
		de.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("Raja");
		Thread.sleep(2000);
		List<WebElement> locationlocators = de.findElements(By.xpath("ul[id='ui-id-1'] li a span:first-of-type"));
		for(int i=0; i<locationlocators.size();i++) {
			String location =locationlocators.get(i).getText();
			System.out.println(location);
			if(location.equalsIgnoreCase(loc)) {
				
				locationlocators.get(i).click();
				break;
			}
			
		}
		
		
		

	}

}
