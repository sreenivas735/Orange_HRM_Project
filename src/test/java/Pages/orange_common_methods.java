package Pages;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class orange_common_methods {
    WebDriver driver;

    public orange_common_methods(WebDriver driver) {
        this.driver = driver;
    }

    public void sendkeys(By byEle, String input) {
        driver.findElement(byEle).sendKeys(input);
    }

    public void click(By byEle) {
        driver.findElement(byEle).click();
    }

    public void waitforvisibletime(By byEle) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(byEle));
    }

    public void waitforclickbletime(By byEle) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(byEle));
    }

    public String gettext(By byEle) {
        return driver.findElement(byEle).getText();

    }

    public void textMatching(By byEle, String Expected) {
        String Actual = gettext(byEle);
        System.out.println(Actual);
        Assert.assertEquals(Expected, Actual);
    }

    public void screenshot(String filename) throws Exception {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File source = screenshot.getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\sreenu\\IdeaProjects\\Orange_HRM\\target\\screenshots\\" + filename + ".jpg");
        FileUtils.copyFile(source, dest);
    }

    public void clearthebox(By byEle) {
        driver.findElement(byEle).clear();
    }

    public void windowchange() {

        String parent = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();

        windows.remove(parent);

        for (String win : windows) {
            driver.switchTo().window(win);
        }
    }

//    public void isdisplay(By byEle) {
//        String Actual = gettext(byEle);
//
//
//    }

}
