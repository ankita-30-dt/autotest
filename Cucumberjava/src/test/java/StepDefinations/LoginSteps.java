package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver = null;
@SuppressWarnings("deprecation")
@Given("browser is open")
public void browser_is_open() {
	System.out.println("Inside step- user is on dashboard");
	System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
	driver = new ChromeDriver();
    driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
}

@And("user is on login page")
public void user_is_on_login_page() {
	driver.navigate().to("https://demojanus.thexfuture.com/authentication/signin");

}

@When("user enters username and password")
public void user_enters_username_and_password() {
	driver.findElement(By.name("email")).sendKeys("janus@thexfuture.com");
	driver.findElement(By.name("password")).sendKeys("Wedigtech@123");

}
@And("user clicks on login")
public void user_clicks_on_login() {
	driver.findElement(By.className("mat-focus-indicator")).click();

}

@Then("user is navigated to the home page")
public void user_is_navigated_to_the_home_page() {
	 
	driver.findElement(By.xpath("//*[@type='button']")).click();
//	WebElement search=driver.findElement(By.name("title"));
//	search.sendKeys("driver1");
//	driver.findElement(By.xpath("//*[@class='material-icons' and contains(text(),'check')]")).click();//usecase created
	
}
@And("user publishes the usecase")
public void user_publishes_the_usecase() {
driver.findElement(By.xpath("//*[text()=' Click here to add description! ']")).click();

//driver.findElement(By.className("text-left ng-star-inserted")).click();
//driver.findElement(By.xpath("//*[ @role  ='combobox']")).sendKeys("3D ");

driver.findElement(By.xpath("//*[@class='mat-form-field-infix ng-tns-c147-4']")).click();
driver.findElement(By.xpath("//*[text()='Any Industry ']")).click();//industry


driver.findElement(By.xpath("//*[@class='mat-select-value ng-tns-c181-7']")).click();
driver.findElement(By.xpath("//*[text()=' IT Department ']")).click();//function

driver.findElement(By.xpath("//textarea[@id='shortDesc']")).sendKeys("....");//short description


//driver.findElement(By.xpath("/html/body/app-root/app-edit-ucs/section/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/div/app-overview/form/div[1]/div/div/div[1]/div/div[1]/div/div/div/ng-select/div/div/div[2]/span[2]")).click();




//driver.findElement(By.className("mat-select-placeholder ng-tns-c181-13 ng-star-inserted")).click();
//driver.findElement(By.xpath("//*[ text()  ='driver1']")).click();
//driver.findElement(By.xpath("//*[ text()  ='driver1']")).click();
//driver.findElement(By.xpath("//div/mat-tab-group/div/mat-tab-body[1]/div/div/div/div/app-overview/form/div[1]/div/div/div[1]/div/div[3]/div/div/div/ng-select/div")).sendKeys("3D printing");
//driver.findElement(By.xpath("/html/body/app-root/app-edit-ucs/section/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/div/app-overview/form/div[1]/div/div/div[1]/div/div[3]/div/div/div/ng-select/div")).sendKeys("3D Printing");
driver.findElement(By.xpath("//div/mat-tab-group/div/mat-tab-body[1]/div/div/div/div/app-overview/form/div[2]/button")).click();//publish

	
	driver.close();
	driver.quit();
}
}
