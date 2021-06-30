package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class InputBox_ButtonClick {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		//url_visit
		driver.get("https://youtube.com/");
		
		//Input Box
	     driver.findElement(By.id("search")).sendKeys("Bangladesh");
		
		/*WebElement search box=driver.findElement(By.id("search"));
		searchbox.sendKeys("Bangladesh");*/
		
		//Name
	    //driver.findElement(By.name("search data")).sendKeys("Bangladesh");
		
		Thread.sleep(1000);
		
	    //xPath
	    driver.findElement(By.xpath("//button[@id='search-icon-legacy']//yt-icon[@class='style-scope ytd-searchbox']")).click();
	    
	    
	    //search button testing
	    //driver.findElement(By.cssSelector("button[id='search-icon-legacy'] yt-icon[class='style-scope ytd-searchbox']")).click();
		
	}

}
