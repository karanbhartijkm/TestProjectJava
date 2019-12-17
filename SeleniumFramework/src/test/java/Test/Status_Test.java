package Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.LocalFileDetector;


import java.io.IOException;

public class Status_Test  {
	private static WebDriver driver =null;
	private static WebElement uploadElement;
	public static void main(String[] args) throws InterruptedException {
		statusSearch();
		
	}
	

	
	public static void statusSearch() throws InterruptedException  {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		
		
	driver = new ChromeDriver();
	
	//*******Maximize Google Chrome Window*********
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--start-maximized");
	driver = new ChromeDriver(options);

		// ********goto STATUS Website*********
		
		driver.get("https://beta.status.bluedd.com/");
		
		// *************login credentials************
		
		
		driver.findElement(By.id("UserName")).sendKeys("BU_JuniperInternal");
		driver.findElement(By.name("Password")).sendKeys("Status@14kk");
		driver.findElement(By.id("PrivacyConsent")).click();
		
		
	
		
		//**********click on login button************
		driver.findElement(By.cssSelector("div.d-table div:nth-child(1) div:nth-child(2) form:nth-child(1) div:nth-child(9) > button.login-button")).click();
		Thread.sleep(3000);

   
		
		
		//Resize current window to the set dimension
		
		
	        driver.manage().window().maximize();
	        
	   
	        
	        
	        
	        
	       //***********Add New Third Party***********
	        
	       /* WebElement element = driver.findElement(By.className("main-tab"));
	        Actions action = new Actions(driver);
	        action.moveToElement(element).build().perform();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//li[@class='menu-item sub-menu']//a[contains(text(),'Order')]")).click();
	        driver.findElement(By.id("img_AddNewThirdParty")).click();
	        driver.findElement(By.id("Name")).sendKeys("AdobeUK16");
	        Select drpCountry1 = new Select(driver.findElement(By.id("countryId")));
            drpCountry1.selectByVisibleText("India");
            driver.findElement(By.id("btnsavebus")).click();
            Thread.sleep(2000);
	       
            */
            
            //***********Bulk Order********************
            WebElement element = driver.findElement(By.className("main-tab"));
	        Actions action = new Actions(driver);
	        action.moveToElement(element).build().perform();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//li[@class='menu-item sub-menu']//a[contains(text(),'Order')]")).click();
	        driver.findElement(By.id("img_AddNewThirdParty")).click();
            driver.findElement(By.id("idblkupld"));
            driver.findElement(By.id("file")).sendKeys("C:\\Users\\karan\\Documents\\Bulk Uploads\\BlackListThirdParty_BetaHK-NEW.xlsx");
            Thread.sleep(2000);
            driver.switchTo().alert().accept();
            JavascriptExecutor js = ((JavascriptExecutor) driver);
            ((JavascriptExecutor)driver).executeScript("scroll(0,760)");
            Thread.sleep(3000);
            driver.findElement(By.id("Indcheck_453213")).click();
            driver.findElement(By.id("AddMatch")).click();
            JavascriptExecutor js1 = ((JavascriptExecutor) driver);
            ((JavascriptExecutor)driver).executeScript("scroll(0,760)");
            
            
                  
	       //**************Order Service Monitoring***************
            
	       driver.findElement(By.xpath("//a[@class='btn-primary']")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.id("ChkMON")).click();
           driver.findElement(By.id("btnProceed")).click();
	    	        
           
           
           
           //*********Order Service CIQ*************
           
           
	       WebElement element1 = driver.findElement(By.className("main-tab"));
	       Actions action1 = new Actions(driver);
	       action.moveToElement(element1).build().perform();
           driver.findElement(By.xpath("//a[text()='My Third Parties']")).click();
           driver.findElement(By.xpath("//text()[contains(.,'AdobeUK15')]/ancestor::a[1]")).click(); 
	       driver.findElement(By.xpath("//a[@class='btn-primary']")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.id("ChkCIQ")).click();
	       driver.findElement(By.id("btnProceed")).click();
	       driver.findElement(By.id("lstCasesCreate_0__objPrimaryContactInfo_Name")).sendKeys("KARAN");
	       driver.findElement(By.id("lstCasesCreate_0__objPrimaryContactInfo_Email")).sendKeys("karan@bluedd.com");
           driver.findElement(By.id("btnSave")).click();
           
         //*************Order Service Third Party Code of Conduct***************
	       WebElement element2 = driver.findElement(By.className("main-tab"));
	       Actions action2 = new Actions(driver);
	       action.moveToElement(element1).build().perform();
           driver.findElement(By.xpath("//a[text()='My Third Parties']")).click();
           driver.findElement(By.xpath("//text()[contains(.,'AdobeUK15')]/ancestor::a[1]")).click(); 
	       driver.findElement(By.xpath("//a[@class='btn-primary']")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.id("ChkTPCC")).click();
	       driver.findElement(By.id("btnProceed")).click();
	       driver.findElement(By.id("lstCasesCreate_0__objPrimaryContactInfo_Name")).sendKeys("KARAN");
	       driver.findElement(By.id("lstCasesCreate_0__objPrimaryContactInfo_Email")).sendKeys("karan@bluedd.com");
           driver.findElement(By.id("btnSave")).click();
           
           
           
         //*************Order Service Retrieval of Corporate Documents***************
	       WebElement element3 = driver.findElement(By.className("main-tab"));
	       Actions action3 = new Actions(driver);
	       action.moveToElement(element1).build().perform();
           driver.findElement(By.xpath("//a[text()='My Third Parties']")).click();
           driver.findElement(By.xpath("//text()[contains(.,'AdobeUK15')]/ancestor::a[1]")).click(); 
	       driver.findElement(By.xpath("//a[@class='btn-primary']")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.id("ChkRCD")).click();
	       driver.findElement(By.id("btnProceed")).click();
	       driver.findElement(By.id("lstCasesCreate_0__objPrimaryContactInfo_Name")).sendKeys("KARAN");
	       driver.findElement(By.id("lstCasesCreate_0__objPrimaryContactInfo_Email")).sendKeys("karan@bluedd.com");
           driver.findElement(By.id("btnSave")).click();
           
           
           
           
           //*************Order Service Document Request and Upload***************
	       WebElement element4 = driver.findElement(By.className("main-tab"));
	       Actions action4 = new Actions(driver);
	       action.moveToElement(element1).build().perform();
           driver.findElement(By.xpath("//a[text()='My Third Parties']")).click();
           driver.findElement(By.xpath("//text()[contains(.,'AdobeUK15')]/ancestor::a[1]")).click(); 
	       driver.findElement(By.xpath("//a[@class='btn-primary']")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.id("ChkDRU")).click();
	       driver.findElement(By.id("btnProceed")).click();
	       driver.findElement(By.id("lstCasesCreate_0__objPrimaryContactInfo_Name")).sendKeys("KARAN");
	       driver.findElement(By.id("lstCasesCreate_0__objPrimaryContactInfo_Email")).sendKeys("karan@bluedd.com");
           driver.findElement(By.id("btnSave")).click();
           
           
           
           
           //*************Order Service Quick Check***************
	       WebElement element5 = driver.findElement(By.className("main-tab"));
	       Actions action5 = new Actions(driver);
	       action.moveToElement(element1).build().perform();
           driver.findElement(By.xpath("//a[text()='My Third Parties']")).click();
           driver.findElement(By.xpath("//text()[contains(.,'AdobeUK15')]/ancestor::a[1]")).click(); 
	       driver.findElement(By.xpath("//a[@class='btn-primary']")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.id("ChkIDD")).click();
	       driver.findElement(By.id("btnProceed")).click();
	       driver.findElement(By.id("btnSave")).click();
           
           
           
	       
	     //*************Order Service Go/NoGo***************
	       WebElement element6 = driver.findElement(By.className("main-tab"));
	       Actions action6 = new Actions(driver);
	       action.moveToElement(element1).build().perform();
           driver.findElement(By.xpath("//a[text()='My Third Parties']")).click();
           driver.findElement(By.xpath("//text()[contains(.,'AdobeUK15')]/ancestor::a[1]")).click(); 
	       driver.findElement(By.xpath("//a[@class='btn-primary']")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.id("ChkGNG")).click();
	       driver.findElement(By.id("btnProceed")).click();
	       driver.findElement(By.id("btnSave")).click();
	       
	       
	       //*************Order Service Lite***************
	       WebElement element7 = driver.findElement(By.className("main-tab"));
	       Actions action7 = new Actions(driver);
	       action.moveToElement(element1).build().perform();
           driver.findElement(By.xpath("//a[text()='My Third Parties']")).click();
           driver.findElement(By.xpath("//text()[contains(.,'AdobeUK15')]/ancestor::a[1]")).click(); 
	       driver.findElement(By.xpath("//a[@class='btn-primary']")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.id("ChkBS")).click();
	       driver.findElement(By.id("btnProceed")).click();
	       driver.findElement(By.id("btnSave")).click(); 
	       
	       
	       
	       
	       
	       //*************Order Service Pro***************
	       WebElement element8 = driver.findElement(By.className("main-tab"));
	       Actions action8 = new Actions(driver);
	       action.moveToElement(element1).build().perform();
           driver.findElement(By.xpath("//a[text()='My Third Parties']")).click();
           driver.findElement(By.xpath("//text()[contains(.,'AdobeUK15')]/ancestor::a[1]")).click(); 
	       driver.findElement(By.xpath("//a[@class='btn-primary']")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.id("ChkSPS")).click();
	       driver.findElement(By.id("btnProceed")).click();
	       driver.findElement(By.id("btnSave")).click(); 
	       
	       
	       
	       
	       //*************Order Service Plus***************
	       WebElement element9 = driver.findElement(By.className("main-tab"));
	       Actions action9 = new Actions(driver);
	       action.moveToElement(element1).build().perform();
           driver.findElement(By.xpath("//a[text()='My Third Parties']")).click();
           driver.findElement(By.xpath("//text()[contains(.,'AdobeUK15')]/ancestor::a[1]")).click(); 
	       driver.findElement(By.xpath("//a[@class='btn-primary']")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.id("ChkCR")).click();
	       driver.findElement(By.id("btnProceed")).click();
	       driver.findElement(By.id("btnSave")).click(); 
	       
	       
	       
	       //*************Order Service Third Party Site Inspection***************
	       WebElement element10 = driver.findElement(By.className("main-tab"));
	       Actions action10 = new Actions(driver);
	       action.moveToElement(element1).build().perform();
           driver.findElement(By.xpath("//a[text()='My Third Parties']")).click();
           driver.findElement(By.xpath("//text()[contains(.,'AdobeUK15')]/ancestor::a[1]")).click(); 
	       driver.findElement(By.xpath("//a[@class='btn-primary']")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.id("ChkIPPSI")).click();
	       driver.findElement(By.id("btnProceed")).click();
	       driver.findElement(By.id("btnSave")).click(); 
	       
	       
	       
	       
	       //*************Order Service Reference Check***************
	       WebElement element11 = driver.findElement(By.className("main-tab"));
	       Actions action11 = new Actions(driver);
	       action.moveToElement(element1).build().perform();
           driver.findElement(By.xpath("//a[text()='My Third Parties']")).click();
           driver.findElement(By.xpath("//text()[contains(.,'AdobeUK15')]/ancestor::a[1]")).click(); 
	       driver.findElement(By.xpath("//a[@class='btn-primary']")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.id("ChkRC")).click();
	       driver.findElement(By.id("btnProceed")).click();
	       driver.findElement(By.id("lstCasesCreate_0__lstRefrenceEntity_0__companyName")).sendKeys("CP PLUS");
	       driver.findElement(By.id("lstCasesCreate_0__lstRefrenceEntity_0__contactPerson")).sendKeys("KARAN");
	       driver.findElement(By.id("lstCasesCreate_0__lstRefrenceEntity_0__email")).sendKeys("karan@bluedd.com");
	       driver.findElement(By.id("lstCasesCreate_0__lstRefrenceEntity_0__phoneNo")).sendKeys("9999912345");
	       driver.findElement(By.id("btnSave")).click(); 
	       
	       
	       
	     //*************Order Service  Reputational Enquiries***************
	       WebElement element12 = driver.findElement(By.className("main-tab"));
	       Actions action12 = new Actions(driver);
	       action.moveToElement(element1).build().perform();
           driver.findElement(By.xpath("//a[text()='My Third Parties']")).click();
           driver.findElement(By.xpath("//text()[contains(.,'AdobeUK15')]/ancestor::a[1]")).click(); 
	       driver.findElement(By.xpath("//a[@class='btn-primary']")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.id("ChkRE")).click();
	       driver.findElement(By.id("btnProceed")).click();
	       driver.findElement(By.id("btnSave")).click(); 
	       
	       
         
	       
	     //*************Order Service  Special Project***************
	       WebElement element13 = driver.findElement(By.className("main-tab"));
	       Actions action13 = new Actions(driver);
	       action.moveToElement(element1).build().perform();
           driver.findElement(By.xpath("//a[text()='My Third Parties']")).click();
           driver.findElement(By.xpath("//text()[contains(.,'AdobeUK15')]/ancestor::a[1]")).click(); 
	       driver.findElement(By.xpath("//a[@class='btn-primary']")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.id("ChkSP")).click();
	       driver.findElement(By.id("spro_Descr")).sendKeys("ALL");
	       driver.findElement(By.id("btnSave")).click();
	       driver.findElement(By.id("btnProceed")).click();
	       driver.findElement(By.id("btnSave")).click(); 
	       
	   /*
	       
	     //*************Order BUSINESS CASE***************
            WebElement element1 = driver.findElement(By.className("main-tab"));
 	       Actions action1 = new Actions(driver);
 	       action.moveToElement(element).build().perform();
            driver.findElement(By.xpath("//a[text()='My Third Parties']")).click();
            driver.findElement(By.xpath("//text()[contains(.,'AdobeUK13')]/ancestor::a[1]")).click(); 
 	       driver.findElement(By.xpath("//a[@class='btn-primary']")).click();
 	       Thread.sleep(2000);
	       driver.findElement(By.id("imgEditBC")).click();
	       driver.findElement(By.id("DropDown_ProposerName")).click();
	       driver.findElement(By.xpath("//select[@id='DropDown_ProposerName']//option[contains(text(),'Karan')]"));
	       driver.findElement(By.id("ddlquestype")).click();
	       driver.findElement(By.xpath("/html[1]/body[1]/div[1]/form[1]/div[2]/div[2]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/table[1]/tbody[1]/tr[1]/td[1]/select[1]"));
	       
	       
	       
	       
	       
	       driver.findElement(By.id("spro_Descr")).sendKeys("ALL");
	       driver.findElement(By.id("btnSave")).click();
	       driver.findElement(By.id("btnProceed")).click();
	       driver.findElement(By.id("btnSave")).click(); 
	       
	       */
	       
	        //**********close browser************  
	      				
	        driver.close();
		
	        System.out.println("Test Completed Successfully");
		
				
	}



	private static void click() {
		// *********TODO Auto-generated method stub***********
		
	}

}

