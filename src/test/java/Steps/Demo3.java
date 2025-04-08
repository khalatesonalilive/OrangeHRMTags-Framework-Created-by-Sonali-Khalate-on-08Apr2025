//package Steps;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.When;
//
//public class Demo3 {
//	WebDriver driver;
//	
//	@Given("user is on LoginPage")
//	public void user_is_on_login_page() {
//	   
//		 driver=new EdgeDriver();
//		 driver.manage().window().maximize();
//		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//		 driver.manage().deleteAllCookies();
//		 driver.get("https://www.saucedemo.com/");
//	}
//
//	@When("user enter a valid {string} and {string}")
//	public void user_enter_a_valid_and(String userName , String Password ) {
//	    driver.findElement(By.name("user-name")).sendKeys(userName);
//	    driver.findElement(By.name("password")).sendKeys(Password);
//	   
//	}
//
//	@When("user click on Login button")
//	public void user_click_on_login_button() {
//	    driver.findElement(By.name("login-button")).click();
//	}
//	
//	
//}
