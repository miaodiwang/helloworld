import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestDemo {
	@Test
	public void test() {
		System.out.println("Hello, World");
    	//System.setProperty("webdriver.firefox.marionette","C:\\Users\\miwang\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		//WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\miwang\\Desktop\\DevOps\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","/var/lib/jenkins/workspace/chromedriver");
		
		WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "http://demo.guru99.com/selenium/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        //close Fire fox
        driver.close();
	}

}
