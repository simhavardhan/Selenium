import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoDropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver b = new ChromeDriver();
		
		b.get("https://rahulshettyacademy.com/dropdownsPractise/");
		String Country = "india";
		b.findElement(By.xpath("//input[@class='inputs ui-autocomplete-input']")).sendKeys("ind");
		Thread.sleep(1000);
		List<WebElement> elements = b.findElements(By.cssSelector("li.ui-menu-item a"));
		
		for(int i=0; i<elements.size(); i++) {
			
			System.out.println(elements.get(i).getText());
			String ElementText = elements.get(i).getText();
			if(ElementText.equalsIgnoreCase(Country)) {
				
				elements.get(i).click();
				break;
			}
		}
		
	}

}
