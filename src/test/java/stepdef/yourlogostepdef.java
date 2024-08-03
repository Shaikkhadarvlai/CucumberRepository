package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class yourlogostepdef 
{

 public WebDriver driver;
@Given("Open the application")
public void open_the_application() 
{
	driver.get("http://www.automationpractice.pl/index.php");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
}

@When("test the sign button")
public void test_the_sign_button() 
{
	driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
    
}

@Then("test the url currect or not")
public void test_the_url_currect_or_not() 
{
	Assert.assertTrue(driver.getCurrentUrl().contains("authentication"),"not matched");
	System.out.println("this is matched");
	
}
}
