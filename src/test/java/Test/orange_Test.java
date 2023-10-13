package Test;

import Pages.orange_pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class orange_Test {

    orange_pages page = new orange_pages(Hooks.driver);

    @Given("enter the username {string}")
    public void enterTheValidUsername(String username) {
        page.usernametext(username);

    }

    @And("enter the password {string}")
    public void enterTheValidPassword(String password) {
        page.passwordbox(password);
    }

    @Then("click the submit button")
    public void clickTheSubmitButton() {
        page.login();
    }

    @And("verify user able to see the homepage {string}")
    public void verifyUserAbleToSeeTheHomepage(String input) {
        page.dashboardverification(input);
    }

    @Then("take screenshot {string}")
    public void takeScreenshot(String filename) throws Exception {
        page.screenshotofthepage(filename);
    }

    @And("Verify the user able see the error {string}")
    public void verifyTheUserAbleSeeTheError(String error) {
        page.errormsg(error);
    }

    @And("Verify the user able see the error bottom of the box {string}")
    public void verifyTheUserAbleSeeTheErrorBottomOfTheBox(String error) {
        page.userempty(error);
    }

    @Then("clear the textbox {string}")
    public void clearTheTextbox(String name) {
        page.clearthetextbox(name);
    }

    @Given("Verify the forgot password link is visible {string}")
    public void verifyTheForgotPasswordLinkIsVisible(String input) {
        page.forgotpassword(input);

    }

    @And("click the forgot password link")
    public void clickTheForgotPasswordLink() {
        page.clicktheforgotpasswordlink();
    }

    @Then("Verify user able to redirected to forgot password page {string}")
    public void verifyUserAbleToRedirectedToForgotPasswordPage(String input) {
        page.verifyuserableseetheforgotpasspage(input);
    }

    @And("click the OrangeHRM, Inc. link")
    public void clickTheOrangeHRMIncLink() {
        page.orangehrmlink();
    }

    @Then("Verify the user able to redirected to Orange_HRM main page {string}")
    public void verifyTheUserAbleToRedirectedToOrange_HRMMainPage(String input) {
        page.verifyuserabletoredirect(input);
    }

    @Given("Click on the linkedin icon")
    public void clickOnTheLinkedinIcon() {
        page.clickthelinkdinicon();
    }

    @And("verify the user able to redirected to the Orange_HRM linkdin page {string}")
    public void verifyTheUserAbleToRedirectedToTheOrange_HRMLinkdinPage(String input) {
        page.verifyuserableseethelinkdinpage(input);
    }

    @Given("Click on the facebook icon")
    public void clickOnTheFacebookIcon() {
        page.clickthefacebookicon();
    }

    @And("verify the user able to redirected to the Orange_HRM facebook page {string}")
    public void verifyTheUserAbleToRedirectedToTheOrange_HRMFacebookPage(String input) {
        page.verifyuserableseethefacebookloginpage(input);
    }

    @Given("Click on the Twitter icon")
    public void clickOnTheTwitterIcon() {
        page.clicktwittericon();
    }

    @And("verify the user able to redirected to the Orange_HRM Twitter page {string}")
    public void verifyTheUserAbleToRedirectedToTheOrange_HRMTwitterPage(String input) {
        page.Verifytheuserabletoseethetwitterpage(input);
    }

    @Given("Click on the youtube icon")
    public void clickOnTheYoutubeIcon() {
        page.clickyoutubeicon();
    }

    @And("verify the user able to redirected to the Orange_HRM youtube page {string}")
    public void verifyTheUserAbleToRedirectedToTheOrange_HRMYoutubePage(String input) {
        page.verifytheuserabletoseetheyoutubepage(input);
    }

    @Given("verify the title of the page {string}")
    public void verifyTheTitleOfThePage(String input) {
        page.titleofthepage(input);
    }

    @And("verify the url of the page {string}")
    public void verifyTheUrlOfThePage(String input) {
        page.verifytheurlofthepage(input);
    }
}
