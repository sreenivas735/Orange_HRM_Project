@loginpage
Feature: validate the loginpage functionality

  @login-title-url
  Scenario: Verify the title and url and page heading of the loginpage
    Given verify the title of the page "OrangeHRM"
    And verify the url of the page "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"


  @login-validcreds
  Scenario: Validate logging into the Application using valid credential
    Given enter the username "Admin"
    And enter the password "admin123"
    Then click the submit button
    And verify user able to see the homepage "Dashboard"
    Then take screenshot "homepage"

  @login-invalid
  Scenario Outline: Validate logging into the Application using invalid credential
    Given enter the username "<username>"
    And enter the password "<password>"
    Then click the submit button
    And Verify the user able see the error "<text>"
    Then take screenshot "<screenshot>"
    Examples:

      | username | password | text                | screenshot  |
      | Invalid  | invalid  | Invalid credentials | bothinvalid |
      | Admin    | invalid  | Invalid credentials | passinvalid |
      | invalid  | admin123 | Invalid credentials | userinvalid |

  @login-empty-user
  Scenario: Validate logging into the Application using empty credential
    Given enter the password "admin123"
    Then click the submit button
    When Verify the user able see the error bottom of the box "Required"
    Then take screenshot "userempty"

  @login-empty-password
  Scenario: Validate logging into the Application using empty credential
    Given enter the username "Admin"
    Then click the submit button
    And Verify the user able see the error bottom of the box "Required"
    Then take screenshot "passwordempty"

  @login-empty-user-password
  Scenario: Validate logging into the Application using empty credential
    Given enter the username ""
    When enter the password ""
    Then click the submit button
    And Verify the user able see the error bottom of the box "Required"
    Then take screenshot "userandpassempty"

  @forgotpass
  Scenario: Validate the working of Forgot password link in loginpage
    Given Verify the forgot password link is visible "Forgot your password?"
    And click the forgot password link
    Then Verify user able to redirected to forgot password page "Reset Password"
    And take screenshot "forgotpassword"

  @OrangeHRMlink
  Scenario: Validate the working of 'OrangeHRM, Inc.' in login page
    And click the OrangeHRM, Inc. link
    Then Verify the user able to redirected to Orange_HRM main page "Peace of mind is just a few clicks away!"
    And take screenshot "OrangeHRMmainlink"

  @OrangeHRM-linkdin
  Scenario: Validate the working of 'linkedin icon' in the login page
    Given Click on the linkedin icon
    And  verify the user able to redirected to the Orange_HRM linkdin page "Sign in to see who you already know at OrangeHRM"
    Then take screenshot "linkdin-icon"

  @OrangeHRM-facebook
  Scenario: Validate the working of 'linkedin icon' in the login page
    Given Click on the facebook icon
    And  verify the user able to redirected to the Orange_HRM facebook page "Connect with OrangeHRM - World's Most Popular Opensource HRIS on Facebook"
    Then take screenshot "facebookicon"

  @OrangeHRM-twitter
  Scenario: Validate the working of 'linkedin icon' in the login page
    Given Click on the Twitter icon
    And  verify the user able to redirected to the Orange_HRM Twitter page "OrangeHRM"
    Then take screenshot "twittericon"

  @OrangeHRM-youtube
  Scenario: Validate the working of 'linkedin icon' in the login page
    Given Click on the youtube icon
    And  verify the user able to redirected to the Orange_HRM youtube page "OrangeHRM Inc"
    Then take screenshot "youtubeicon"

