//import java.awt.List;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Test {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : "+projectPath);
		
		//System.setProperty("webdriver.gecko.driver", projectPath+"/drivers/geckodrivers/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.findElement(By.id("search")).senkeys("flowers");
		//WebElement textBox = driver.findElement(By.className("search"));
			
		
		//System.setProperty("webdriver.ie.driver", projectPath+"/drivers/iedriver/IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.bing.com");
		//driver.findElement(By.id("sb_form_q")).sendKeys("Data Analyst");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Artificial Intelligence");
		//WebElement textBox = driver.findElement(By.id("sb_form_q"));
		//textBox.sendKeys("flowers");
		
		
		List<WebElement> listOfInputElements = driver.findElements(By.xpath("//input"));
		
		int count = listOfInputElements.size();
		
		System.out.println("Count of Input Elements = "+count);
		
		Thread.sleep(30000);try {
			
		} catch (Exception e) {
			driver.close();
			//driver.quit();
		}
		
		}
		
	}


