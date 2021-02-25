package elements.Pack;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ByAll;

public class Package {
	
	private WebDriver driver;
	
	public Package (WebDriver driver) {
		this.driver = driver;
			
	}
	
	public WebDriver chromeDriverConection() {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/ChromeDriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	public WebElement finElement (By Locator) {
		return driver.findElement(Locator);
		
	}
	
	public List<WebElement> findElements(By locator){
		return driver.findElements(locator);
	}
	
	public String getText(WebElement element) {
		return element.getText();
	}
	
	public String getText(By locator) {
		return driver.findElement(locator).getText();
		
	}
	
	public void type (String inputText, By locator) {
		driver.findElement(locator).sendKeys(inputText);
	}
	
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	public Boolean isDisplayed(By locator) {
		try {
		return driver.findElement(locator).isDisplayed();
		}catch (org.openqa.selenium.NoSuchElementException e) {
			// TODO: handle exception
			return false;
		}			
	}
	public void visit(String url) {
		driver.get (url);	

	}
	
}



