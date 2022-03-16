/**
 * Login page class implementation.
 * Author: Nabil, Date: September 12, 2020
 */

package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import applicationsettings.ApplicationSettings;
import helper.DriverActions;
import helper.DriverWaits;
import pages.PagesFactory;

import DataModel.TestDataModel;


public class LoginPage extends Base {

    // Declared the private driver of behavior tab on a specific story page
    @SuppressWarnings("unused")
    private final WebDriver driver;
    private final DriverWaits driverWaits;
    private final DriverActions driverActions;

    // Start: Login screen web elements
 @FindBy(xpath = "//*[@id=\"email-undefined-undefined-48700\"]")
 WebElement signInemail;
 @FindBy(xpath = "//*[@id=\"password-undefined-undefined-19012\"]")
 WebElement signInPassword;
 @FindBy(xpath = "//*[@id=\"app-inner\"]/div[2]/div[2]/div[2]/div/div[2]/div[2]/form/div[3]/div/button")
 WebElement signInforgetPassword;
 @FindBy(xpath = "//*[@id=\"app-inner\"]/div[2]/div[2]/div[2]/div/div[2]/div[2]/form/div[4]/button")
 WebElement signInButton;
 @FindBy(xpath = "//*[@id=\"app-inner\"]/div[2]/div[2]/div[2]/div/div[2]/div[2]/div/p[2]/a")
 WebElement redirectTosignUp;
 @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/form[1]/div[4]/button[1]")
 WebElement wrongmailorpass;
 @FindBy(xpath = "//*[@id=\"email-undefined-undefined-37564\"]")
 WebElement forgetpassEmail;
 @FindBy(xpath = "//*[@id=\"app-inner\"]/div[2]/div[2]/div[2]/div/div[2]/div[2]/form/div[4]/button")
 WebElement restorepassbtn;

// sign up field elements:

   @FindBy(xpath = "//*[@id=\"app-inner\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[2]/button")
   WebElement redirect;
   //will redirect to the sign up page.

 @FindBy(xpath = "//*[@id=\"app-inner\"]/div[2]/div[2]/div[2]/div/div[2]/div[1]/div/div[2]/div")
 WebElement accountType;
 @FindBy(xpath = "//*[@id=\"app-inner\"]/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[1]/div/div[2]/div")
 WebElement jobseeker;
 @FindBy(xpath = "//*[@id=\"sig-in-nameinput-undefined-undefined-25135\"]")
 WebElement signUpName;
 @FindBy(xpath = "//*[@id=\"email-undefined-undefined-32794\"]")
 WebElement signUpemail;
 @FindBy(xpath = "//*[@id=\"password-undefined-undefined-44240\"]")
 WebElement signUpPassword;
 @FindBy(xpath = "//*[@id=\"app-inner\"]/div[2]/div[2]/div[2]/div/div/div[2]/form/div[5]/div/div/input")
 WebElement signUpcheckbox;
 @FindBy(xpath = "//*[@id=\"app-inner\"]/div[2]/div[2]/div[2]/div/div/div[2]/form/div[6]/button")
 WebElement getstatedButton;
 @FindBy(xpath = "//*[@id=\"app-inner\"]/div[2]/div[2]/div[2]/div/div/div[2]/div/p[2]/a")
 WebElement signinRedirect;


    // End: home screen web elements

    // Initializing the driver for behavior tab on a specific story page
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.driverActions = PagesFactory.getDriverActionsObject();
        this.driverWaits = PagesFactory.getDriverWaitsObject();
    }




    public boolean signup(TestDataModel dataModel) {
        String Name = dataModel.getName();
        String Email = dataModel.getEmail();
        String Password = dataModel.getPassword();
        try {

            System.out.println("\n## Started filling up Sign Up form. ##\n");


            driverActions.clickOnWebElementWithActionsClass(redirect);
            System.out.println("Redirecting to the sign up page");
            driverActions.clickOnWebElementWithActionsClass(accountType);
            System.out.println("Choosen The Account Type");
            driverActions.clickOnWebElementWithActionsClass(jobseeker);
            System.out.println("Profile Selected");
            driverActions.typeText(signUpName,Name);
            System.out.println("Entered Name");
            driverActions.typeText(signUpemail,Email);
            System.out.println("Entered Email Address");
            driverActions.typeText(signUpPassword,Password);
            System.out.println("Entered Password");
            driverActions.clickOnWebElementWithActionsClass(signUpcheckbox);
            System.out.println("Accepted the terms and conditions");
            driverActions.clickOnWebElementWithActionsClass(getstatedButton);
            System.out.println("Sign up form submitted");
            driverActions.clickOnWebElementWithActionsClass(signinRedirect);
            System.out.println("Redirecting to the sign in page");






           // implicitlyWait(10);

            return true;

        } catch (Exception ex) {
            System.out.println(ex);

            return false;
        }
    }


    public boolean login(TestDataModel loginData) {

        String email = loginData.getEmail();
        String password = loginData.getPassword();
        System.out.println(email+"loginPage");
        try {

            int step = 0;

            driverActions.typeText(signInemail,email);
            step++;
            System.out.println(step + ". Inputted 'email'.");
            driverActions.typeText(signInPassword,password);
            step++;
            System.out.println(step + ". Inputted 'password'.");



            driverActions.clickOnWebElementWithActionsClass(signInButton);
            step++;
            System.out.println(step + ". 'Login' button clicked.");
            boolean isDisplayed =wrongmailorpass.isDisplayed();
            if (isDisplayed)
            {
                driverActions.clickOnWebElementWithActionsClass(signInforgetPassword);
                driverActions.typeText(forgetpassEmail,email);
                driverActions.clickOnWebElementWithActionsClass(restorepassbtn);
            }


            return true;
        }
        catch (Exception ex) {
            System.out.println(ex + "\n");
            return false;
        }
    }

}