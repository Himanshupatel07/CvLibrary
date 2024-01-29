package driverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public static WebDriver driver; 

    //open browser
    public void openUp(){
        WebDriverManager.edgedriver().setup();
        driver=new EdgeDriver();
        driver.get("https://www.cv-library.co.uk/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      }
    //CLose browser
    public void close(){
        driver.quit();
    }

    //Constructor
    //Initialize our page model class
    public DriverFactory()
    {
        PageFactory.initElements(driver,this);
    }

}
