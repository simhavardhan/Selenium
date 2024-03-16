package Frames;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
public class iframesDragAndDrop {

	public static void main(String[] args) {
		
		WebDriver de = new ChromeDriver();
		de.manage().window().maximize();
		de.get("https://jqueryui.com/droppable/");
		de.switchTo().frame(de.findElement(By.cssSelector(".demo-frame")));
		WebElement source = de.findElement(By.xpath("//div[@id='draggable']"));
		WebElement traget = de.findElement(By.cssSelector("div#droppable"));
		Actions i = new Actions(de);
		i.dragAndDrop(source, traget).build().perform();
		de.switchTo().defaultContent();

	}

}
