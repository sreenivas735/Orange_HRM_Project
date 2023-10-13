package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class orange_pages extends orange_common_methods {

    WebDriver driver;

    By usernamexpath = By.xpath("//input[@name='username']");
    By passwordxpath = By.xpath("//input[@name='password']");
    By loginbutton = By.xpath("//button[@type='submit']");
    By homepagedashboard = By.xpath("//h6[contains(@class, 'topbar-header-breadcrumb-module')]");

    By errormsg = By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']");

    By emptyerror = By.xpath("//span[contains(@class, 'input-field-error-message')]");

    By forgotpass = By.xpath("//p[contains(@class, 'orangehrm-login-forgot-header')]");

    By forgotpasstext = By.xpath("//h6[contains(@class, 'orangehrm-forgot-password-title')]");

    By Orangehrmlinktext = By.xpath("//h1[contains(text(), 'Peace of mind is just a few clicks away!')]");

    By orangehrmlink = By.xpath("//a[@href='http://www.orangehrm.com']");

    By linkdiniconpath = By.xpath("//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']");

    By linkdinicontext = By.xpath("//h1[contains(@class, 'ember-view text-display')]");
    By linkdiniconsignintext = By.xpath("//h2[contains(@class, 'contextual-sign-in-modal')]");

    By facebookiconpath = By.xpath("//a[@href='https://www.facebook.com/OrangeHRM/']");

    By facebookiconloginpath = By.xpath("//span[contains(@class, 'x1lliihq x6ikm8r x10wlt62 x1n2onr6 xg8j3zb')]");

    By twittericonpath = By.xpath("//a[@href='https://twitter.com/orangehrm?lang=en']");

    By twittericonloginpath = By.xpath("//span[contains(text(), 'OrangeHRM')]");

    By youtubeiconpath = By.xpath("//a[@href='https://www.youtube.com/c/OrangeHRMInc']");

    By youtubeiconpagepath = By.xpath("//div[@id='text-container']");


    public orange_pages(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void usernametext(String username) {
        waitforvisibletime(usernamexpath);
        sendkeys(usernamexpath, username);
    }

    public void passwordbox(String password) {
        waitforvisibletime(passwordxpath);
        sendkeys(passwordxpath, password);
    }

    public void login() {
        click(loginbutton);
    }

    public void dashboardverification(String input) {
        waitforvisibletime(homepagedashboard);
        textMatching(homepagedashboard, input);
    }

    public void screenshotofthepage(String filename) throws Exception {
        screenshot(filename);
    }

    public void errormsg(String error) {
        waitforvisibletime(errormsg);
        textMatching(errormsg, error);
    }

    public void userempty(String error) {
        waitforvisibletime(emptyerror);
        textMatching(emptyerror, error);
    }

    public void clearthetextbox(String ele) {


        if (ele.equals("username")) {
            waitforvisibletime(usernamexpath);
            clearthebox(usernamexpath);
        } else if (ele.equals("password")) {
            waitforvisibletime(passwordxpath);
            clearthebox(passwordxpath);
        }

    }

    public void forgotpassword(String input) {
        waitforvisibletime(forgotpass);
        textMatching(forgotpass, input);
    }

    public void clicktheforgotpasswordlink() {
        click(forgotpass);
    }

    public void verifyuserableseetheforgotpasspage(String input) {
        waitforvisibletime(forgotpasstext);
        textMatching(forgotpasstext, input);
    }

    public void verifytheOrangehrmlink(String input) {
        waitforvisibletime(orangehrmlink);
        gettext(orangehrmlink);
    }

    public void orangehrmlink() {
        waitforclickbletime(orangehrmlink);
        click(orangehrmlink);
    }

    public void verifyuserabletoredirect(String input) {
        windowchange();
        waitforvisibletime(Orangehrmlinktext);
        textMatching(Orangehrmlinktext, input);
    }

    public void clickthelinkdinicon() {
        waitforclickbletime(linkdiniconpath);
        click(linkdiniconpath);
    }

    public void verifyuserableseethelinkdinpage(String input) {
        windowchange();
        waitforvisibletime(linkdiniconsignintext);
        textMatching(linkdiniconsignintext, input);

    }

    public void clickthefacebookicon() {
        waitforclickbletime(facebookiconpath);
        click(facebookiconpath);
    }

    public void verifyuserableseethefacebookloginpage(String input) {
        windowchange();
        waitforvisibletime(facebookiconloginpath);
        textMatching(facebookiconloginpath, input);
    }

    public void clicktwittericon() {
        waitforclickbletime(twittericonpath);
        click(twittericonpath);
    }

    public void Verifytheuserabletoseethetwitterpage(String input) {
        windowchange();
        waitforvisibletime(twittericonloginpath);
        textMatching(twittericonloginpath, input);
    }

    public void clickyoutubeicon() {
        waitforclickbletime(youtubeiconpath);
        click(youtubeiconpath);
    }

    public void verifytheuserabletoseetheyoutubepage(String input) {
        windowchange();
        waitforvisibletime(youtubeiconpagepath);
        textMatching(youtubeiconpagepath, input);
    }

    public void titleofthepage(String input) {
        String title = driver.getTitle();
        Assert.assertEquals(input, title);
    }

    public void verifytheurlofthepage(String input) {
        String url = driver.getCurrentUrl();

        Assert.assertEquals(url, input);

    }

    public void verifytheheadingofthepage(String input) {

    }
}
