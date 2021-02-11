package stepdefination;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objects.Base;

public class Login extends Base {

	
	WebDriver driver;
	
	SoftAssert k = new SoftAssert();
	
	@Given("^User should be able to login with valid credentials$")
    public void user_should_be_able_to_login_with_valid_credentials() throws Throwable {
       
		this.driver=initialize();
		
		driver.get(prop.getProperty("url"));
		
		
    }


    
    @When("^Validate that user is able to click (.+) and (.+) and (.+)$")
    public void validate_that_user_is_able_to_click_and_and(String item1, String item2, String item3) throws Throwable {
        
String s[]= {item1,item2,item3};
    	
    	List<String> l1 = Arrays.asList(s);
    	
    	List<WebElement> w1=driver.findElements(By.xpath("//h4[@class='product-name']"));
    	
    	for(int i=0;i<w1.size();i++) {
    		
    		String a=w1.get(i).getText();
    		
    		String b[]=a.split("-");
    		
    		String name=b[0].trim();
    		
    		if(l1.contains(name)) {
    			
    			
    			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
    		}
    	}

    	
    }

    @Then("^User should be able to add items to the Cart (.+) and (.+) and (.+)$")
    public void user_should_be_able_to_add_items_to_the_cart_and_and(String item1, String item2, String item3) throws Throwable {
     
    	System.out.println("yeah");
    	
String s[]= {item1,item2,item3};


    	
    	List<String> l1 = Arrays.asList(s);
    	
    	List<WebElement> w1=driver.findElements(By.xpath("//h4[@class='product-name']"));
    	
    	for(int i=0;i<w1.size();i++) {
    		
    		String a=w1.get(i).getText();
    		
    		String b[]=a.split("-");
    		
    		String name=b[0].trim();
    		
    		if(l1.contains(name)) {
    			
    			
    			k.assertTrue(driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).isDisplayed());
    			
    			k.assertAll();
    			
    			System.out.println("True");
    		}
    	}

    	

    	
    }

    @When("^Validate that user should be able to click on PRODUCT CARD ICON$")
    public void validate_that_user_should_be_able_to_click_on_product_card_icon() throws Throwable {
       
    	driver.findElement(By.xpath("//img[@alt='Cart']")).click();
    	
    	
    }

    @Then("^User should be able to click on the product icon$")
    public void user_should_be_able_to_click_on_the_product_icon() throws Throwable {
       
    	System.out.println("Clicked");
    	
    	if(driver.findElement(By.xpath("//*[@id='root']/div/header/div/div[3]/div[2]/div[1]/div[1]/ul")).isDisplayed()) {
    		
    		System.out.println("yes");
    	}
    	
    	else {
    		
    		System.out.println("no");
    	}
    }
    
    @When("^Validate user should be able to click on PROCEED TO CART icon$")
    public void validate_user_should_be_able_to_click_on_proceed_to_cart_icon() throws Throwable {
       
    	driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
    	
    }

    @Then("^User should be able to see PROCEED TO CART icon$")
    public void user_should_be_able_to_see_proceed_to_cart_icon() throws Throwable {
       
    	System.out.println("checked");
    }    
}
