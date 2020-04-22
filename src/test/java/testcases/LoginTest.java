package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class LoginTest {

	public static WebDriver driver;

	@BeforeSuite
	public void setUp() {
		
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();

		
		}
	
	
	@Test
	public void doLogin() {
		driver.get("http://gmail.com");
	
		//WebDriverWait wait=new WebDriverWait(driver, 20);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("identifierId")).sendKeys("manaliprafullpihu@gmail.com");
		
		driver.findElement(By.xpath("//*[@id='identifierNext']/span")).click();
		//driver.findElement(By.name("password")).sendKeys("9096366517");
		//driver.findElement(By.xpath("//*[@id='passwordNext']/span/span")).click();

		

}
	@AfterSuite
	  public void tearDown() {
			
			driver.close();
			System.out.println("Quitting  Evarything !!!");
		}
		

}