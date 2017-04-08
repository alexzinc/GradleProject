package firstTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by aleksandrs on 02/04/2017.
 */
public class test {

    @Test
    public void gradleProj() {
        System.setProperty("webdriver.gecko.driver", "/Users/aleksandrs/QAcourses/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://javaguru.lv");
        driver.quit();
    }
}
