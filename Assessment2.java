package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Assessment2 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\yalam\\Desktop\\testing\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.build.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='email-subscribe-splash']/div/div/div[1]/button")).click();
		
		driver.findElement(By.name("term")).sendKeys("K-6626-6U "+Keys.RETURN);
		Thread.sleep(10000);
		WebElement ele = driver.findElement(By.xpath(".//ul[@class='media-list finishes']/li[7]/div"));
		
		Actions ac = new Actions(driver);
		ac.moveToElement(ele).click().build().perform();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//*[@id='configure-product-wrap']/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("term")).sendKeys("K-6626-6U "+Keys.RETURN);
		Thread.sleep(10000);
		WebElement sue = driver.findElement(By.xpath(".//ul[@class='media-list finishes']/li[14]/div"));
		ac.moveToElement(sue).click().build().perform();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='configure-product-wrap']/button")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.name("term")).sendKeys("Kohler K-5180-ST  "+Keys.RETURN);
		Thread.sleep(5000);
				Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='add-to-cart-wrap']/button")).click();
		Thread.sleep(15000);
		driver.findElement(By.linkText("Secure Checkout")).click();
		driver.findElement(By.xpath("//*[@id='guest-login']/button")).click();
		driver.findElement(By.id("shippingfirstname")).sendKeys("chaitanyayala");
		driver.findElement(By.id("shippinglastname")).sendKeys("yala");
		driver.findElement(By.id("shippingaddress1")).sendKeys("123cshca");
		driver.findElement(By.id("shippingpostalcode")).sendKeys("47404");
		driver.findElement(By.id("shippingcity")).sendKeys("bloom");
		WebElement state_dropdown=driver.findElement(By.id("shippingstate_1"));
		Select state_dd=new Select(state_dropdown);
		state_dd.selectByValue("IN");
		driver.findElement(By.id("shippingphonenumber")).sendKeys("214-838-6374");
		driver.findElement(By.id("emailAddress")).sendKeys("chaitanyayala123@gmail.com");
		driver.findElement(By.xpath("//*[@id='creditCardNumber']")).sendKeys("4111111111111111");
	WebElement month_dropdown=driver.findElement(By.id("creditCardMonth"));
		
		Select month_dd=new Select(month_dropdown);
		month_dd.selectByValue("10");
	WebElement year_dropdown=driver.findElement(By.id("creditCardYear"));
		
		Select year_dd=new Select(year_dropdown);
		year_dd.selectByValue("2021");
		
		driver.findElement(By.name("creditcardname")).sendKeys("chaitanyayala");
		driver.findElement(By.name("creditcardcvv2")).sendKeys("123");
		
		driver.findElement(By.xpath("//*[@id='creditcard']/div[3]/input")).click();

	}

}
