package lab_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab_4 {

	public static String driverpath = "C:\\Users\\SHUSALUN\\Desktop\\VNV Software\\Selenium\\WebDrivers\\";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", driverpath+"chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//1.Enter URL.
		driver.get("http://demo.opencart.com/");
		
		//2.Click on 'My Account' dropdown.
		driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/a")).click();

		//3.Click on 'Login'.
		driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[2]/a")).click();
		
		//4.Enter E-Mail Address.
		driver.findElement(By.name("email")).sendKeys("ssss5678@gmail.com");
		
		//5.Enter Password.
		driver.findElement(By.id("input-password")).sendKeys("12345");
		
		//6.Click on 'Login' Button.
		driver.findElement(By.xpath("//*[@id='content']/div/div[2]/div/form/input")).click();
		
		//7.Go to 'Components' tab and click.
		driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[3]/a")).click();
		
		//8.Select 'Monitors'.
		driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[3]/div/div/ul/li[2]/a")).click();
		
		//9.Select 25 from 'Show' dropdown.
		driver.findElement(By.id("input-limit")).click();
		driver.findElement(By.xpath("//*[@id='input-limit']/option[2]")).click();
		
		//10.Click on 'Add to cart' for the first item.
		driver.findElement(By.xpath("//*[@id='content']/div[3]/div[1]/div/div[1]/a/img")).click();
		driver.findElement(By.id("button-cart")).click();
		
		//11.Click on 'Specification' tab.
		driver.findElement(By.xpath("//*[@id='content']/div[1]/div[1]/ul[2]/li[2]/a")).click();
		
		//12.Verify details present on the page.
		
		
		
	}

}
