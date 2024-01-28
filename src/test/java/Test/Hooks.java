package Test;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InvalidObjectException;
import java.util.Properties;

public class Hooks {
    public static WebDriver driver;

    @Before
    public void presteps() throws Exception {
        String path = System.getProperty("user.dir");
        System.out.println(path);
        File file = new File(path + "/Orange_HRM.properties");
        FileReader reader = new FileReader(file);

        Properties prop = new Properties();
        prop.load(reader);
        String browser = prop.getProperty("browser");
        String app_url = prop.getProperty("application_url");

        if (browser.equals("edge")) {
            System.setProperty("webdriver.edge.driver", path + "\\msedgedriver.exe");
            driver = new EdgeDriver();

        } else if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", path + "\\chromedriver.exe");
            driver = new ChromeDriver();
        } else {
            throw new InvalidObjectException("driver not found");
        }
        driver.manage().window().maximize();
        driver.get(app_url);

    }

    @After
    public void poststeps() {
        driver.quit();
    }
}
