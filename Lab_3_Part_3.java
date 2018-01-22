//Part 3: For 'Your Address'
package lab_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lab_3_Part_3 {

	public static String driverpath = "C:\\Users\\SHUSALUN\\Desktop\\VNV Software\\Selenium\\WebDrivers\\";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", driverpath+"chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//1.Enter URL.
		driver.get("https://demo.opencart.com");
		
		//2.Click on 'My Account' dropdown.
		driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/a")).click();
				
		//3.Select 'Register' from dropdown:
		driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[1]/a")).click();
		
		//4.Enter data in 'First Name' text box:
		driver.findElement(By.name("firstname")).sendKeys("sssss");
		
		//5.Enter data in 'Last Name' text box:
		driver.findElement(By.name("lastname")).sendKeys("sssss");
		
		//6.Enter valid 'E-mail':
		driver.findElement(By.id("input-email")).sendKeys("sus1234@gmail.com");
		
		//7.Enter 'Telephone' which must be between 3 and 32 characters:
		driver.findElement(By.id("input-telephone")).sendKeys("022-123456789");
		
		//8.Enter 'Password' which must be between 4 and 20 characters.
		driver.findElement(By.name("password")).sendKeys("12345");
		
		//9.Enter 'Password Confirm'.
		driver.findElement(By.name("confirm")).sendKeys("12345");
		
		//10.Click on 'Yes' Radio button
		driver.findElement(By.name("newsletter")).click();
		
		//11.Click on checkbox for 'I have read and agree to the Privacy Policy'.
		driver.findElement(By.name("agree")).click();
		
		//12.Click on 'Continue' button
		driver.findElement(By.xpath("//*[@id='content']/form/div/div/input[2]")).click();
		
		//13.Click on Address Book.
		driver.findElement(By.xpath("//*[@id='column-right']/div/a[4]")).click();
		
		//14.Click on New Address.
		driver.findElement(By.xpath("//*[@id='content']/div/div[2]/a")).click();
		
		//15.Enter 'First name'.
		driver.findElement(By.id("input-firstname")).sendKeys("ssss");
		
		//16.Enter 'Last Name'.
		driver.findElement(By.id("input-lastname")).sendKeys("ssss");
		
		//17.Enter 'Address 1' which should contain characters between 3 and 128.
		driver.findElement(By.name("address_1")).sendKeys("jdahfshfs");
		
		//18.Enter 'City' which should contain characters between 2 and 128.
		driver.findElement(By.name("city")).sendKeys("udsfugf");
		
		//19.Enter 'Post Code' which should contain characters between 2 and 10.
		driver.findElement(By.id("input-postcode")).sendKeys("454641");
		
		//20.Select 'India' from 'Country' Dropdown.
		WebElement wb1 = driver.findElement(By.xpath("//*[@id='input-zone']"));
		Select sel = new Select(wb1);
		sel.selectByVisibleText("India");
		//sel.selectByValue("99");
		
		//21.Select 'Region/State' from dropdown.
		WebElement wb2 = driver.findElement(By.id("input-zone"));
		Select sel1 = new Select(wb2);
		sel1.selectByVisibleText("Madhya Pradesh");
		//sel1.selectByValue("1492");
	}

}
