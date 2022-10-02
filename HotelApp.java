package org.hotelapp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;	

public class HotelApp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Sawan\\eclipse-workspace\\org.test\\Driver\\msedgedriver.exe");
			
				WebDriver driver1=new EdgeDriver();
				
				
				driver1.get("http://adactinhotelapp.com/");
				
			driver1.manage().window().maximize();
	
	WebElement txtUserName = driver1.findElement(By.id("username"));
	
	txtUserName.sendKeys("sawan");
	
	WebElement txtPassWord = driver1.findElement(By.id("password"));
	
	txtPassWord.sendKeys("xxxx1234");
	
	}

}
