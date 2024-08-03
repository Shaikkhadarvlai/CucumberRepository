package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import utility.utility123;

public class PracticeScrollDownStepdef 
{
public  WebDriver driver;
@Given("open the Application")
public void open_the_application() 
{ driver=new ChromeDriver();
  driver.get("https://practice.expandtesting.com/dropdown");
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  driver.manage().window().maximize();
  
	
}

@When("Test the Simple dropdown")
public void test_the_simple_dropdown() 
{
WebElement simple=  driver.findElement(By.xpath("//select[@id='dropdown']"));

utility123.selectBasedDropdown(simple,"Option2");

	
}

@When("Test the select your data of birth")
public void test_the_select_your_data_of_birth()
{
WebElement data=driver.findElement(By.xpath("//select[@id='elementsPerPageSelect']"));
utility123.selectBasedDropdown(data,"100");

	
}

@Then("Test the Country selection")
public void test_the_country_selection() 
{
 WebElement country=driver.findElement(By.xpath("//select[@id='country']"));
utility123.selectBasedDropdown(country,"Zimbabwe");
	
}




}
