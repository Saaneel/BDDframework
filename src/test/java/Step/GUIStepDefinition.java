package Step;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Util.Lib;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class GUIStepDefinition extends Lib{

	public WebDriver driver;

	@Before
	public void initialize() {
		
		

		System.out.println("this is before class");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Saaneel\\eclipse-workspace\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");
	}

	@Given("^user at facebook home page$")
	public void firststep() {
		System.out.println(driver.getTitle());
		System.out.println("first step!! ");

	}

	@When("^user enter valid username \"([^\"]*)\"$")

	public void secondstep(String username) {

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
	}

	@And("^user enter invalid password \"([^\"]*)\"$")

	public void thirdstep(String password) {

		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
	}

	@And("^user Click on login button$")

	public void forthstep() {

		driver.findElement(By.xpath("//input[@aria-label='Log In']")).click();
	}

	@Then("^user will see red error message$")
	public void fithstep() {
		System.out.println(driver.findElement(By.xpath("//div[@class='_4rbf _53ij']")).getText());
	}

	@After
	public void teardown() {
		System.out.println("test is over");
		driver.manage().deleteAllCookies();
	}

}
