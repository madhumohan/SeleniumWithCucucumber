package steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Madhu on 22/11/2018.
 */
public class Hook extends BaseUtil{


    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest() {

        System.out.println("Opening the browser : Firefox");
		
		

        System.setProperty("webdriver.gecko.driver", "D:\\TestNG\\geckodriver-v0.23.0-win64\\geckodriver.exe");
        base.Driver = new ChromeDriver();
		
        System.out.println("Open : Portal");
		
		driver.get("https://portal.actcorp.in");

        //Chrome driver
       // System.setProperty("webdriver.chrome.driver", "D:\\TestNG\\chromedriver_win32\\chromedriver.exe");
        //base.Driver = new ChromeDriver();
    }


    @After
    public void TearDownTest(Scenario scenario) {
        if (scenario.isFailed()) {
            //Take screenshot logic goes here
            System.out.println(scenario.getName());
        }
        System.out.println("Closing the browser : MOCK");
    }

}
