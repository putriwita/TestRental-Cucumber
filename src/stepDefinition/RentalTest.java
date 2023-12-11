package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RentalTest {
	/*
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe"); //Create a new
	 * instance of the Chrome Driver WebDriver wd = new ChromeDriver();
	 * 
	 * //Launch the w3schools online code learning website
	 * wd.get("https://www.w3schools.com/");
	 */

	WebDriver driver;
	// --------------------------Variasi 1------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
/*
		WebDriver wd = new ChromeDriver();

		// Launch the w3schools online code learning website
		wd.get("https://www.w3schools.com/");*/
		
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/user/login");

	}

	@When("^I enter valid email and valid password$")
	public void I_enter_valid_email_and_valid_password() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
		driver.findElement(By.id("password")).sendKeys("putriwita11");
		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
		Thread.sleep(4000);
	}

	@And("^I click rental$")
	public void I_click_rental() throws Throwable {
		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Medan");
		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("01-09-2023");
		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("10:00 PM");
		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Samosir");
		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("01-10-2023");
		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("12:00 PM");
	
	}
	
	@Then("^Rental is success$")
	public void rental_is_success() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
	}
	
	//---------------------------TestCase 2-----------------------------------------------------------------------
	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Silangit");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("06-09-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("10:00AM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Balige");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("06-10-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("12:00AM");
//	
//	}
//	
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	// --------------------------Variasi 2------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
	//---------------------------TestCase 2-----------------------------------------------------------------------
	
	// --------------------------Variasi 3------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
	//---------------------------TestCase 2-----------------------------------------------------------------------
	
	// --------------------------Variasi 4------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
	//---------------------------TestCase 2-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Silangit");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("06-09-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Balige");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("06-10-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("12:00AM");
//	
//	}
//	
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	
	// --------------------------Variasi 5------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Silangit");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("06-09-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("10:00AM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("11");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("06-10-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("12:00AM");
//	
//	}
//	
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	//---------------------------TestCase 2-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Silangit");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("06-09-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("10:00AM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("11");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("06-10-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("12:00AM");
//	
//	}
//	
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	// --------------------------Variasi 6------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Silangit");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("06-09-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("10:00AM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("11");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("12:00AM");
//	
//	}
//	
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	//---------------------------TestCase 2-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Silangit");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("06-09-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("10:00AM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Porsea");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("05-12-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("12:00AM");
//	
//	}
//	
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	// --------------------------Variasi 7------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Silangit");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("06-09-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("10:00AM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Porsea");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("05-12-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("");
//	
//	}
//	
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	//---------------------------TestCase 2-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Silangit");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("06-09-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("10:00AM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Porsea");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("05-12-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("11");
//	
//	}
//	
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	// --------------------------Variasi 8------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("10:00AM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Porsea");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("05-12-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("11.00AM");
//	
//	}
//	
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	//---------------------------TestCase 2-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("0000000");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("10:00AM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Porsea");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("05-12-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("11.00AM");
//	
//	}
//	
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	// --------------------------Variasi 9------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("06-09-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("AM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Porsea");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("05-12-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("11.00AM");
//	
//	}
//	
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	//---------------------------TestCase 2-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("06-09-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("11");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Porsea");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("05-12-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("11.00AM");
//	
//	}
//	
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	// --------------------------Variasi 10------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("06-09-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("11.35AM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("05-12-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("11.00AM");
//	
//	}
//	
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	//---------------------------TestCase 2-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("06-09-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("11.35AM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Siantar");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("05-12-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("11.00AM");
//	
//	}
//	
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	// --------------------------Variasi 11------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("06-09-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("11.35AM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Siantar");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("05-12-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("11.00AM");
//	
//	}
//	
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//		
	//---------------------------TestCase 2-----------------------------------------------------------------------
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
//			WebDriver wd = new ChromeDriver();
//
//			// Launch the w3schools online code learning website
//			wd.get("https://www.w3schools.com/");*/
//			
//			driver = new ChromeDriver(); 
//			driver.manage().window().maximize();
//			driver.get("http://127.0.0.1:8000/user/login");
//
//		}
//
//		@When("^I enter valid email and valid password$")
//		public void I_enter_valid_email_and_valid_password() throws Throwable {
//			driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//			driver.findElement(By.id("password")).sendKeys("putriwita11");
//			driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//			driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//			Thread.sleep(4000);
//		}
//
//		@And("^I click rental$")
//		public void I_click_rental() throws Throwable {
//			driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//			Thread.sleep(4000);
//			driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("");
//			driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("06-09-2023");
//			driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("11.35AM");
//			driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Siantar");
//			driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("05-12-2023");
//			driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("11.00AM");
//		
//		}
//		
//		@Then("^Rental is success$")
//		public void rental_is_success() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//			
//	
	// --------------------------Variasi 12------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
//				WebDriver wd = new ChromeDriver();
//
//				// Launch the w3schools online code learning website
//				wd.get("https://www.w3schools.com/");*/
//				
//				driver = new ChromeDriver(); 
//				driver.manage().window().maximize();
//				driver.get("http://127.0.0.1:8000/user/login");
//
//			}
//
//			@When("^I enter valid email and valid password$")
//			public void I_enter_valid_email_and_valid_password() throws Throwable {
//				driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//				driver.findElement(By.id("password")).sendKeys("putriwita11");
//				driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//				driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//				Thread.sleep(4000);
//			}
//
//			@And("^I click rental$")
//			public void I_click_rental() throws Throwable {
//				driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//				Thread.sleep(4000);
//				driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("");
//				driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("06-09-2023");
//				driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("11.35AM");
//				driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Siantar");
//				driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("05-12-2023");
//				driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("AM");
//			
//			}
//			
//			@Then("^Rental is success$")
//			public void rental_is_success() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//			}
			
	//---------------------------TestCase 2-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("06-09-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("11.35AM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Siantar");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("05-12-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("00");
//	
//	}
//	
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	// --------------------------Variasi 13------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Siantar");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("00-00-0000");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("11AM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Siantar");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("05-12-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("00");
//	
//	}
//	
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	//---------------------------TestCase 2-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Siantar");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("00-00-0000");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("11");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Siantar");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("05-12-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("00");
//	
//	}
//	
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	// --------------------------Variasi 14------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Siantar");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("14.25AM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("05-12-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("00");
//	
//	}
//	
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	//---------------------------TestCase 2-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Siantar");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("03-15-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("14.25AM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("05-12-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("00");
//	
//	}
//	
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	} 
	
	// --------------------------Variasi 15------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Siantar");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("14.25AM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("05-12");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("10.00PM");
//	
//	}
//	
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	} 
	//---------------------------TestCase 2-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Medan");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("01-09-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("10:00 PM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Samosir");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("01-10-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("12:00 PM");
//	
//	}
//	
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	// --------------------------Variasi 16------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Medan");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("-");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("10:00 PM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Samosir");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("01-10-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("0");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	//---------------------------TestCase 2-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Medan");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("-");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("10:00 PM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Samosir");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("01-10-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("0");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}

	// --------------------------Variasi 17------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Medan");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("08-05-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("10 PM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("01-10-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("12.00PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	//---------------------------TestCase 2-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Medan");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("08-05-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("0");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("01-10-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("12.00PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
//	
	// --------------------------Variasi 18------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Medan");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("08-05-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("0");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Paarsoburan");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("01");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("12.00PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}	
	
//	//---------------------------TestCase 2-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Medan");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("08-05-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("0");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Paarsoburan");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("00");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("12.00PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	
	// --------------------------Variasi 19------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Medan");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("08-05-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("0");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Paarsoburan");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("08-12-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("12.PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	//---------------------------TestCase 2-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Medan");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("08-05-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("PM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Paarsoburan");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("08-12-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	// --------------------------Variasi 20------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Medan");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("08-05-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("12.00PM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("-------");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	//---------------------------TestCase 2-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Medan");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("08-05-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("12.00PM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("2023-14-32");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	
	// --------------------------Variasi 21------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Medan");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("08-05-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("12.00PM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("02-14-2024");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	//---------------------------TestCase 2-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Medan");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("08-05-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("12.00PM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("02-14-2024");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	// --------------------------Variasi 22------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Medan");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("08-05-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("12.00PM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Siantar");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
//	
	
	//---------------------------TestCase 2-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Medan");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("08-05-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("12.00PM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Siantar");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	// --------------------------Variasi 23------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("PM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Siantar");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("12-03-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("13.00PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	//---------------------------TestCase 2-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("23456781");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("00");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Siantar");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("12-03-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("13.00PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	// --------------------------Variasi 24------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("23456781");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("14.00PM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("12-03-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("13.00PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	//---------------------------TestCase 2-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("23456781");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("20.00PM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("12-03-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("13.00PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	// --------------------------Variasi 25------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("23456781");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("20.00PM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Silaen");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("3-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("13.00PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	//---------------------------TestCase 2-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("23456781");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("20.40PM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Parsoburan");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("3-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("13.00PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	// --------------------------Variasi 26------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("23456781");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("20.40PM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Parsoburan");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("10-03-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("00PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	//---------------------------TestCase 2-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("23456781");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("15.30PM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Medan");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("11-08-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("00PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	// --------------------------Variasi 27------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("10-13-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("150PM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("11-08-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("16.00PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	//---------------------------TestCase 2-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("10-15-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("150PM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("11-08-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("16.00PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	// --------------------------Variasi 28------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("10-15-2024");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("150PM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Sidikalang");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("11-08");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("16.00PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	//---------------------------TestCase 2-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("07-30-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("150PM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Silimbat");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("11-08");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("16.00PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
//	
	// --------------------------Variasi 29------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("08-30-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("150PM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Silimbat");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("11-08-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("16.PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	//---------------------------TestCase 2-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("08-30-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("150PM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Silimbat");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("11-08-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("16.PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	
	
	// --------------------------Variasi 30------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("08-30-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("15.20PM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("16.00PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	//---------------------------TestCase 2-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("08-30-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("15.20PM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("16.00PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}

	// --------------------------Variasi 31------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("08-30-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("15.20PM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("09-05-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("16PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}

	//---------------------------TestCase 2-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("06-30-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("15.20PM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("07-05-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("16PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}


	// --------------------------Variasi 32------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("06-30-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("15.20PM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Balige");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("07052023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("16PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	//---------------------------TestCase 2-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("06-30-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("15.20PM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Balige");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("07052023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("16PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}


	// --------------------------Variasi 33------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Medan");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("06-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("1520PM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("06-15-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("16.45PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	//---------------------------TestCase 2-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Siantar");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("1PM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("06-15-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("16.45PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}


	// --------------------------Variasi 34------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Siantar");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("-------");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("-");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Tarutung");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("0000000");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("16.45PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	//---------------------------TestCase 2-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Siantar");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("-------");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("-");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Tarutung");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("0000000");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("16.45PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}


	// --------------------------Variasi 35------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Siantar");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("02-10-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("08");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Tarutung");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("06-15-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("16PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	//---------------------------TestCase 2-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Siantar");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("02-10-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("08");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Tarutung");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("06-15-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("16PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}


	// --------------------------Variasi 36------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Siantar");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("02102023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("08.00AM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("-");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("06");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("16.00PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	//---------------------------TestCase 2-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Siantar");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("02102023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("08.00AM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("-");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("06");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("16.00PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}

	// --------------------------Variasi 37------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------\
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Siantar");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("02102023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("08.00AM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("-");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("06-17-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("1PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}


	// --------------------------Variasi 38------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Siantar");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("02102023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("08.00AM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Tarutung");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("06-17");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("1PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
//	

	// --------------------------Variasi 39------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Siantar");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("12-08-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("0800AM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("06-17");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("13.00PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
		

	// --------------------------Variasi 40------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Siantar");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("12-08-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("0800AM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("06-17-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("00PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	
	// --------------------------Variasi 41------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Siantar");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("12-08-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("12.00AM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("06");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("00PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	// --------------------------Variasi 42------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("12");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("00AM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("06-10-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("15.00PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	// --------------------------Variasi 43------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("12");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("00AM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Tarutung");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("06--2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("15.00PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	// --------------------------Variasi 44------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("12");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("00AM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Tarutung");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("06-27-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	// --------------------------Variasi 45------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("12.30PM");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("00AM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("14.25PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	// --------------------------Variasi 46------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("12.15PM");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("00AM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("05-30-2024");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	// --------------------------Variasi 47------------------------------------------------------------------------
//	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("11-20-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("AM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Medan");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("x");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	// --------------------------Variasi 48------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("11-20-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("08.30AM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("x");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	// --------------------------Variasi 49------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("11-20-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("AM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("x");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("15.30PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	// --------------------------Variasi 50------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("mm-dd--yyyy");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("15.20PM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("01-23-2024");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	// --------------------------Variasi 51------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Siantar");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("11-20-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("AM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("x");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
//	
	// --------------------------Variasi 52------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Parapat");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("11-20");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("11.35AM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("x");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
//	
	// --------------------------Variasi 53------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Parsoburan");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("11-20-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("AM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("Silaen");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("x");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	// --------------------------Variasi 54------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Dolok Sanggul");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("11-20-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("AM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("05-13-2024");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
//	
	// --------------------------Variasi 55------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Tarutung");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("00000");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("AM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("x");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("13.25PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	// --------------------------Variasi 56------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Tarutung");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("11-20-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("AM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("x");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("PM");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	// --------------------------Variasi 57------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Medan");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("18-25-2035");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("12.45AM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	// --------------------------Variasi 58------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("Medan");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	// --------------------------Variasi 59------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("08-17-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	// --------------------------Variasi 60------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("12.37PM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	// --------------------------Variasi 61------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("Balige");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	// --------------------------Variasi 62------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("09-25-2023");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	// --------------------------Variasi 63------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("14.25PM");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
	
	// --------------------------Variasi 64------------------------------------------------------------------------
	//---------------------------TestCase 1-----------------------------------------------------------------------
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.id("email")).sendKeys("putriwitanapitupulu@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("putriwita11");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
//		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/ul/li[5]/a")).click();
//		Thread.sleep(4000);
//	}
//
//	@And("^I click rental$")
//	public void I_click_rental() throws Throwable {
//		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div[2]/div[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"pickinglocation\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingupdate\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickinguphour\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoff\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffdate\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"pickingoffhour\"]")).sendKeys("");
//	
//	}
//	@Then("^Rental is success$")
//	public void rental_is_success() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"formSearchSubmit3\"]")).click();
//	}
}