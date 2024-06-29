package stepdef;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class PracticeStepdef
{
	public WebDriver driver;
	
@Given("Open the practice  page")
public void open_the_practice_page() 
{
    driver=new ChromeDriver();
	driver.get("https://practice.expandtesting.com/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
}

@When("Test the user and passwords login credentials")
public void test_the_user_and_passwords_login_credentials(DataTable table) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
    
	List <Map <String, String>>tab=table.asMaps();
	driver.findElement(By.id("username")).sendKeys(tab.get(0).get("email"));
	driver.findElement(By.id("password")).sendKeys(tab.get(0).get("password"));
	
	
}

@When("Test the login button")
public void test_the_login_button() 
{
	driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
    
}
@Then("Test for Login is success or Not")
public void test_for_login_is_success_or_not() {
    Assert.assertTrue(driver.getCurrentUrl().contains("secure"),"The Login is Fail");
    System.out.println("The Login is pass");
}



}
