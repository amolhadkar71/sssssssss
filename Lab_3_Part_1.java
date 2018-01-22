//Part 1: Launch Application
package lab_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab_3_Part_1 {

	public static String driverpath = "C:\\Users\\SHUSALUN\\Desktop\\VNV Software\\Selenium\\WebDrivers\\";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", driverpath+"chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//1.Enter URL.
		driver.get("https://demo.opencart.com");
		
		//2.Verify Title:
		String title = driver.getTitle();
		System.out.println(title);
		String expected_title = "Your Store";
		System.out.println("Title Equals: "+title.equals(expected_title));
		
		//3.Click on 'My Account' dropdown.
		driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/a")).click();
		
		//4.Select 'Register' from dropdown:
		driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[1]/a")).click();
		
		//5.‘Register Account’ page will open up, verify the heading ‘Register Account’:
		boolean b = driver.findElement(By.xpath("//*[@id='content']/h1")).isDisplayed();
		System.out.println("Heading verify: "+b);
		
		//6.Click on 'Continue' button at the bottom of the page
		driver.findElement(By.xpath("//*[@id='content']/form/div/div/input[2]")).click();
	
		//7.Verify warning message 'Warning: You must agree to the Privacy Policy!'.
		String str =driver.findElement(By.xpath("//*[@id='account-register']/div[1]")).getText();
		System.out.println("Warning msg verify: "+str.equals("Warning: You must agree to the Privacy Policy!"));
		
		//8.Close:
		driver.close();
	}

}
