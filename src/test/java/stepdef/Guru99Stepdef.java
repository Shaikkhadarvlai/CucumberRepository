package stepdef;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import hooksDemo.BrowserSetUp;

import io.cucumber.java.en.*;
import utility.utility123;

public class Guru99Stepdef 
{
	
	public WebDriver driver=BrowserSetUp.getDriver();
	
@Given("Open The GuruPayment Application")
public void open_the_guru_payment_application() 
{
	driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/payment-gateway/index.php");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
    
}

@When("Test for select the Quantity")
public void test_for_select_the_quantity() 
{
 WebElement  ele=driver.findElement(By.name("quantity"));
	utility123.selectBasedDropdown(ele,"9");  
}

@When("Test for click button")
public void test_for_click_button() 
{
    //driver.findElement(By.xpath("//input[@value='Buy Now']")).click();
	
}


@When("Test for card number box")
public void test_for_card_number_box()
{
	 driver.findElement(By.xpath("//input[@value='Buy Now']")).click();
	driver.findElement(By.xpath("//input[@id='card_nmuber']")).sendKeys("1234567891234567");
    
}

@When("Test for month box")
public void test_for_month_box() 
{
	WebElement mon=driver.findElement(By.id("month"));
   utility123.selectBasedDropdown(mon,"12");
  
}

@When("Test for year box")
public void test_for_year_box()
{
  WebElement ye=  driver.findElement(By.id("year"));
	utility123.selectBasedDropdown(ye,"2028");
  
}

@When("Test for cvv code box")
public void test_for_cvv_code_box() 
{
	driver.findElement(By.id("cvv_code")).sendKeys("123");
   
}

@Then("Test for click pay ment button")
public void test_for_click_pay_ment_button() 
{
    driver.findElement(By.name("submit")).click();
	
}





}
