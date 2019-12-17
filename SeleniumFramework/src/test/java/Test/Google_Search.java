package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Search {
	
	public static void main(String[] args) {
		googleSearch();
		
	}
	
	public static void googleSearch()  {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// goto google.com
		
		driver.get("https://google.com");
		
		// enter text in search textbox
		
		driver.findElement(By.name("q")).sendKeys("Artificial Intelligence");
		
		
		
		//click on search button
		
		
		//driver.findElement(By.name("btnk")).click();
		driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		
		
		//close browser
		
		
		driver.close();
		
		System.out.println("Test Completed Successfully");
		
		
		
				
		
		
		
	}

}
