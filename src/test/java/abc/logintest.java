package abc;



	import org.openqa.selenium.By;
   import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.*;
	import org.openqa.selenium.firefox.*;
	import org.openqa.selenium.WebDriver;
	import io.github.bonigarcia.wdm.WebDriverManager;

	import org.testng.Assert;
	import org.testng.annotations.*;
	
	
	
     public class logintest {
		//WebDriverManager.chromedriver().setup();
    	 public static WebDriver driver;
    	
		@Test
	    public void verifyTitle() {
			 WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				//ChromeDriver driver=new ChromeDriver();
	        // Get and verify the title of the web page
			driver.get("https://www.google.com");
	        String expectedTitle = "Google";
	        String actualTitle = driver.getTitle();
	        
	        Assert.assertEquals(actualTitle, expectedTitle);
	        System.out.println(actualTitle);
	        System.out.println("Bisillah");
	        driver.quit();
		}
		
		 @Test
			public void test1() {
			        // Get and verify the title of the web page
					
			        System.out.println("Bisillah");
			       

		}
			
		
			 @Test
			public void test2() {
			        // Get and verify the title of the web page
					
			        System.out.println("Allahuakbar");
			       

		}
			
	}
	

