//Part 4: For 'Password'
package lab_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab_3_Part_4 {

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
		driver.findElement(By.id("input-email")).sendKeys("ssss5678@gmail.com");
		
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
		
		//13.Verify message 'Your Account Has Been Created!'
		String str =driver.findElement(By.xpath("//*[@id='content']/h1")).getText();
		System.out.println("Msg verify: "+str.equals("Your Account Has Been Created!"));
		
		//14.Click on 'Continue'
		driver.findElement(By.xpath("//*[@id='content']/div/div/a")).click();
		
		//15.Click on link 'View your order history' under 'My Orders'
		driver.findElement(By.xpath("//*[@id='content']/ul[2]/li[1]/a")).click();
		
		//16.Close.
		driver.close();
	}

}
