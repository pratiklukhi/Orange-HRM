package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserManager extends BasePage {
    LoadProp loadProp = new LoadProp();
    public static final String AUTOMATE_USERNAME = "pratiklukhi_tXJQCT";
    public static final String AUTOMATE_ACCESS_KEY = "z6JkfedXwcz6X1ZqzMY8";
    public static final String BrowserStack = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";

    DesiredCapabilities caps = new DesiredCapabilities();

    // Browser name
  // public String browserName = System.getProperty("browser");
  //  boolean cloud= Boolean.parseBoolean(System.getProperty("cloud"));
  //  String browserName = "chrome";
    public String browserName = "chrome";
    boolean cloud = false;


    public void openBrowser() {
        //to run on cloud
        // making decision cloud True or false
        if (cloud){
            //
            if(browserName.equalsIgnoreCase("chrome")){

                caps.setCapability("os", "Windows");
                caps.setCapability("os_version", "10");
                caps.setCapability("browser", "Chrome");
                caps.setCapability("browser_version", "latest");
                caps.setCapability("browserstack.local", "false");
                caps.setCapability("browserstack.selenium_version", "3.14.0");

            }


            else if (browserName.equalsIgnoreCase("edge")){


            }else if (browserName.equalsIgnoreCase("firefox")){
                DesiredCapabilities caps = new DesiredCapabilities();
                caps.setCapability("os", "Windows");
                caps.setCapability("os_version", "10");
                caps.setCapability("browser", "Firefox");
                caps.setCapability("browser_version", "latest");
                caps.setCapability("browserstack.local", "false");
                caps.setCapability("browserstack.selenium_version", "3.10.0");

            }
            else {
                System.out.println("your Browser is Wrong");
            }
            try {
                driver= new RemoteWebDriver(new URL(BrowserStack),caps);
            } catch (MalformedURLException e) {
                e.printStackTrace();

            }
        }
        else if(browserName.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "src/test/java/driver/chromedriver.exe");
            driver=new ChromeDriver();
        }
        else if (browserName.equalsIgnoreCase("edge"))
        {
            System.setProperty("webdriver.edge.driver","src/test/java/driver/msedgedriver.exe");
            driver=new EdgeDriver();
        }
        else if (browserName.equalsIgnoreCase("firefox"))
        {
            System.setProperty("webdriver.gecko.driver","src/test/java/driver/geckodriver.exe");
            driver=new FirefoxDriver();
        }
        else {
            System.out.println("your Browser is Wrong");
        }
        driver.manage().window().maximize();
        //type url link
        driver.get(loadProp.getProperty("url"));

    }
    public void closeBrowser()
    {
        //Close The Browser
     driver.close();
    }
}

