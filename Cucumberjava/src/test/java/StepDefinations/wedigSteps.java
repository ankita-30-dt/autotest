//package StepDefinations;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class LoginSteps {
//	@Given("user is on login page")
//	public void user_is_on_login_page() {
//		// Write code here that turns the phrase above into concrete actions
//		System.out.println("Inside Step- user is on login page");}
//
//	@When("user enters username and password")
//	public void user_enters_username_and_password() {
//		// Write code here that turns the phrase above into concrete actions
//		System.out.println("Inside Step- user enters username and password");
//
//	}
//
//	@And("clicks on login button")
//	public void clicks_on_login_button() {
//		// Write code here that turns the phrase above into concrete actions
//		System.out.println("Inside Step- clicks on login button");
//		}
//	
//
//	@Then("user is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() {
//		// Write code here that turns the phrase above into concrete actions
//		System.out.println("Inside Step- user is navigated to login page");
//	}
//
//
//}
package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class wedigSteps {
	WebDriver driver = null;
@SuppressWarnings("deprecation")
@Given("startup browser is open")
public void startup_browser_is_open() {
	System.out.println("Inside step- user is on dashboard");
	System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
	driver = new ChromeDriver();
    driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
}

@And("user is on startup login page")
public void user_is_on_startup_login_page() {
	driver.navigate().to("https://demojanus.thexfuture.com/authentication/signin");

}

@When("user enters startup username and password")
public void user_enters_startup_username_and_password() {
	driver.findElement(By.id("mat-input-0")).sendKeys("saurabh.mittal@wedigtech.com");
	driver.findElement(By.id("mat-input-1")).sendKeys("Wedigtech@123");

}
@And("user clicks on startup login")
public void user_clicks_on_startup_login() {
	driver.findElement(By.className("mat-focus-indicator")).click();

}

@Then("user is navigated to the startup home page")
public void user_is_navigated_to_the_startup_home_page() {
	 
	driver.findElement(By.xpath("//*[@type='button']")).click();//post a solution
//	WebElement search=driver.findElement(By.name("title"));//enter title
//	search.sendKeys("solution1");//solution input
//	driver.findElement(By.xpath("//*[@class='material-icons' and contains(text(),'check')]")).click();//usecase created
	
}
@And("user publishes the solution")
public void user_publishes_the_usecase() {
driver.findElement(By.xpath("//*[text()=' Click here to add description! ']")).click();
driver.findElement(By.id("mat-input-2")).sendKeys("3D modeling");

driver.findElement(By.id("mat-input-3")).sendKeys("Reducing the dimensionality of the dataset using PCA");
driver.findElement(By.id("mat-input-4")).sendKeys("Redundancy");
driver.findElement(By.id("mat-input-5")).sendKeys("TCS");
driver.findElement(By.id("mat-input-6")).sendKeys("Robustness");
driver.findElement(By.id("mat-input-7")).sendKeys("independent software-Vodafone");
driver.findElement(By.id("percentage-number")).sendKeys("74");
//Select drpdown = new Select(driver.findElement(By.className("pos-rel tag-white-box ng-star-inserted")));
//drpdown.selectByVisibleText("3D modelling ");

driver.findElement(By.xpath("//*[@class='mat-form-field-infix ng-tns-c147-10']")).click();
driver.findElement(By.xpath("//*[text()='Any Industry ']")).click();//industry


driver.findElement(By.xpath("//*[@class='mat-select-value ng-tns-c181-13']")).click();
driver.findElement(By.xpath("//*[text()=' IT Department ']")).click();//function

//Select drpdown = new Select(driver.findElement(By.xpath("/html/body/app-root/app-edit-ucs/section/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/div/app-overview/form/div[1]/div[3]/div/div[2]/div/div[3]/div/div/div/ng-select/div/div/div[2]/input")));
//drpdown.selectByIndex(1);

driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("3D modelling");
//driver.findElement(By.xpath("/html/body//section/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/div/app-overview/form/div[1]/div[3]/div/div[2]/div/div[1]/div/div/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]/span")).click();//tags

driver.findElement(By.xpath("/html/body/app-root/app-edit-ucs/section/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/div/app-overview/form/div[1]/div[3]/div/div[2]/div/div[3]/div/div/div/ng-select/div/div/div[2]/input")).sendKeys("3D Printing");
//driver.findElement(By.xpath("//div/mat-tab-body[1]/div/div/div/div/app-overview/form/div[1]/div[3]/div/div[2]/div/div[3]/div/div/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]/span")).click();
//driver.findElement(By.xpath("")).click();

//driver.findElement(By.xpath("//*[text()='3D Printing']")).click();


driver.findElement(By.xpath("/html/body/app-root/app-edit-ucs/section/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/div/app-overview/form/div[3]/button")).click();





	
	driver.close();
	driver.quit();
}
}
