package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepsample {
	WebDriver driver;
	@Given("^login browser$")
	public void launchbrowser() {
			System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");
			driver = new ChromeDriver();	
			driver.manage().window().maximize();		
			driver.get("https://freecrm.co.in/");
	}
	@When("^login application$")
	public void launchapplication() throws Exception {	
	WebElement Log= driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[2]"));
	Log.click();
	Thread.sleep(2000);
	}
	@Then("^enter Username and Passwd$")
	public void enterdetails() throws Exception {
		WebElement email=driver.findElement(By.name("email"));
		email.sendKeys("neenub18@gmail.com");
		WebElement pwd=driver.findElement(By.name("password"));
		pwd.sendKeys("Itrust@3");
	}
	@Then("^enter login button$")
	public void enterlogin() throws Exception {
		WebElement submitbutton =driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[3]"));
		submitbutton.click();
		System.out.println("Logged into the application");
		Thread.sleep(2000);
	}
	@Then("^Quit browser$")
	public void quitbroswer() {
		driver.quit();
	}
	
}
