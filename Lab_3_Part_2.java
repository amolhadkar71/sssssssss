//Part 2: For 'Your Personal Details'
package lab_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab_3_Part_2 {

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
		driver.findElement(By.name("firstname")).sendKeys("Shubhammmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
		
		//5.Verify 'First Name' error message
		//String getfnameermsg = driver.findElement(By.className("text-danger")).getText();
		//System.out.println("Verifying Firstname error message: "+getfnameermsg);
		
		/*if(getname.length() > 32)
		  {
			System.out.println("Testcase Passed.");
	      }
		 else
		 {
			System.out.println("Testcase Failed.");
		 }*/
				
		//6.Enter data in 'Last Name' text box:
		driver.findElement(By.name("lastname")).sendKeys("Salunkheeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
		
		//7.Verify 'Last Name' error message
		//String getlnameermsg = driver.findElement(By.xpath("//*[@id='account']/div[3]/div/div")).getText();
		//System.out.println("Verifying Firstname error message: "+getlnameermsg);	
		
		//8.Enter valid 'E-mail':
		driver.findElement(By.id("input-email")).sendKeys("Shubham@gmail.com");
				
		//9.Enter 'Telephone' which must be between 3 and 32 characters:
		driver.findElement(By.id("input-telephone")).sendKeys("022-7898563241564645645645645678987987985645648798765648787956456487985648798156412556489648798545456484874856");
				
		//10.Click on 'Continue' button at the bottom of the page
		driver.findElement(By.xpath("//*[@id='content']/form/div/div/input[2]")).click();
			
		//11.Close.
		driver.close();
		
	}

}
