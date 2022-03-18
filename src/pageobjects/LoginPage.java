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
 @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
 WebElement signInemail;
 @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
 WebElement signInPassword;
 @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/form[1]/div[3]/div[1]/button[1]")
 WebElement signInforgetPassword;
 @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/form[1]/div[4]/button[1]")
 WebElement signInButton;
 @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/p[2]/a[1]")
 WebElement redirectTosignUp;
 @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/form[1]/div[4]/button[1]")
 WebElement wrongmailorpass;
 @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
 WebElement forgetpassEmail;
 @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/form[1]/div[4]/button[1]")
 WebElement restorepassbtn;

// sign up field elements:

   @FindBy(xpath = "//*[@id=\"app-inner\"]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/button")
   WebElement redirect;
   //will redirect to the sign up page.

 @FindBy(xpath = "//*[@id=\"app-inner\"]/div[2]/div[2]/div[2]/div/div[2]/div[1]/div/div[2]/div")
 WebElement accountType;
 @FindBy(xpath = "//*[@id=\"app-inner\"]/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[1]/div/div[2]/div")
 WebElement jobseeker;
 @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div[2]/div/div/div[2]/form/div[2]/div/div[1]/div/input")
 WebElement signUpName;
 @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/input[1]")
 WebElement signUpemail;
 @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/div[1]/div[1]/input[1]")
 WebElement signUpPassword;
 @FindBy(xpath = "//input[@name='isAcceptTerm']")
 WebElement signUpcheckbox;
 @FindBy(xpath = "//*[@id=\"app-inner\"]/div[2]/div[2]/div[2]/div/div/div[2]/form/div[6]/button")
 WebElement getstatedButton;
 @FindBy(xpath = "//*[@id=\"app-inner\"]/div[2]/div[2]/div[2]/div/div/div[2]/div/p[2]/a")
 WebElement signinRedirect;
 @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")
 WebElement emailAlreadytaken;
    @FindBy(xpath = "//*[@id=\"app-inner\"]/div[2]/div[2]/div[1]/div/div/div[4]/ul/li[1]/a")
    WebElement NavigatetoHome;
    @FindBy(xpath = "//textarea[@placeholder='Share what is in your mind...']")
    WebElement shareWinmind;
    @FindBy(xpath = "//button[@class='btn btn-post waves-effect waves-light']")
    WebElement postbutton;
    @FindBy(xpath = "//*[@id=\"app-inner\"]/div[2]/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[2]/div/div[2]/div")
    WebElement joinPicoftheWeekC;
    @FindBy(xpath = "//*[@id=\"body\"]/div[3]/div[2]/div/div[2]/div/div/div[3]/button")
    WebElement Enterpicoftheweek;
    @FindBy(xpath = "//*[@id=\"body\"]/div[3]/div[2]/div/div[1]/span/img")
    WebElement Exitfromuploadp;
    @FindBy(xpath = "//div[5]//div[1]//div[1]//div[1]//div[2]//a[1]//h4[1]")
    WebElement ScrollToElement;
    @FindBy(xpath = "//span[normalize-space()='Trending topics']")
    WebElement trendingTopic;
    @FindBy(xpath = "//span[normalize-space()='Wall of fame']")
    WebElement Walloffame;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/a[1]/*[name()='svg'][1]")
    WebElement Likeapost;



    // End: home screen web elements
    //Landing page to navigations bar's page's:
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[4]/ul[1]/li[1]/a[1]")
    WebElement AfterloginNavtohome;
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
            implicitlyWait(5);
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
            driverActions.clickOnWebElementUsingJavaScript(signUpcheckbox);
            System.out.println("Accepted the terms and conditions");
            driverActions.clickOnWebElementWithActionsClass(getstatedButton);
            System.out.println("Sign up form submitted");
            boolean isDisplayed = emailAlreadytaken.isDisplayed();
            if (isDisplayed)
            {
                driverActions.clickOnWebElementWithActionsClass(signinRedirect);
                System.out.println("Redirecting to the sign in page");
            }
//            driverActions.clickOnWebElementWithActionsClass(signinRedirect);
//            System.out.println("Redirecting to the sign in page");








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
            implicitlyWait(10);
            boolean isDisplayed =wrongmailorpass.isDisplayed();
            step++;
            if (isDisplayed)
            {
                driverActions.clickOnWebElementWithActionsClass(signInforgetPassword);
                step++;
                driverActions.typeText(forgetpassEmail,email);
                step++;
                driverActions.clickOnWebElementWithActionsClass(restorepassbtn);
                step++;
            }




            return true;
        }
        catch (Exception ex) {
            System.out.println(ex + "\n");
            return false;
        }
    }
    public boolean home(TestDataModel dataModel) {

        boolean flag= false;

        try {
            int step = 0;

            System.out.println("\n## Started Navigating To The Home Page. ##\n");
            driverActions.clickOnWebElementWithActionsClass(NavigatetoHome);
            step++;


            System.out.println("Navigated to the home page");
            implicitlyWait(10);
            driverActions.clickOnWebElementWithActionsClass(shareWinmind);
            step++;
            System.out.println("Clicked on the input field");
            implicitlyWait(5);
            driverActions.typeText(shareWinmind, dataModel.getPost());
            step++;

            System.out.println("Shared What's In Mind");
            //implicitlyWait(2);
            driverActions.clickOnWebElementUsingJavaScript(postbutton);
            implicitlyWait(10);
            step++;
            System.out.println("Posted the shared text");
            driverActions.scrollToWebElementWithJavaScript(ScrollToElement);
            step++;
            System.out.println("Scrolled Down");
//            //implicitlyWait(2);
            driverActions.clickOnWebElementWithActionsClass(Likeapost);
            System.out.println("Liked a post");
            driverActions.clickOnWebElementWithActionsClass(joinPicoftheWeekC);
            step++;
            System.out.println("Clicked join now button on pic of the week challenge");
            driverActions.clickOnWebElementWithActionsClass(Enterpicoftheweek);
            step++;
            System.out.println("Clicked Enter to join pic of the week challenge");
            driverActions.clickOnWebElementWithActionsClass(Exitfromuploadp);
            step++;
            System.out.println("Exit from the upload modal of the pic of the week challenge");
//
//            driverActions.
            driverActions.clickOnWebElementWithActionsClass(trendingTopic);
            step++;
            System.out.println("Navigated to the trending topic");
            driverActions.clickOnWebElementWithActionsClass(Walloffame);

            System.out.println("Navigated to the wall of fame page");
            flag=true;

        } catch (Exception ex) {
            System.out.println(ex);


        }
        return flag;
    }

}