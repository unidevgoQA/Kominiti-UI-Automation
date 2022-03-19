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


public class HomePage extends Base {

    // Declared the private driver of behavior tab on a specific story page
    @SuppressWarnings("unused")
    private final WebDriver driver;
    private final DriverWaits driverWaits;
    private final DriverActions driverActions;

    // Start: Home screen web elements
    @FindBy(xpath = "//*[@id=\"app-inner\"]/div[2]/div[2]/div[1]/div/div/div[4]/ul/li[1]/a")
    WebElement NavigatetoHome;
    @FindBy(xpath = "//textarea[@placeholder='Share what is in your mind...']")
    WebElement shareWinmind;
    @FindBy(xpath = "//span[normalize-space()='Post']")
    WebElement postbutton;
    @FindBy(xpath = "//*[@id=\"app-inner\"]/div[2]/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[2]/div/div[2]/div")
    WebElement joinPicoftheWeekC;
    @FindBy(xpath = "//*[@id=\"body\"]/div[3]/div[2]/div/div[2]/div/div/div[3]/button")
    WebElement Enterpicoftheweek;
    @FindBy(xpath = "//*[@id=\"body\"]/div[3]/div[2]/div/div[1]/span/img")
    WebElement Exitfromuploadp;
    @FindBy(xpath = "//*[@id=\"react-tabs-33\"]/div/div[3]/div[2]/div/div[39]/div/div[1]/div[2]/div/div/a/div/img")
    WebElement ScrollToElement;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/span[1]")
    WebElement trendingTopic;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[3]/span[1]")
    WebElement Walloffame;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/a[1]/span[1]")
    WebElement Likeapost;
    @FindBy(xpath = "//div[contains(@class,'infinite-scroll-component')]//div[1]//div[1]//div[1]//div[1]//div[3]//div[1]//div[1]//button[1]//*[name()='svg']//*[name()='path' and contains(@d,'M3 12C4.38')]")
    WebElement drpdwnPost;
    @FindBy(xpath = "//div[contains(@class,'show')]//a[2]")
    WebElement deletePost;
    @FindBy(xpath = "//div[contains(@class,'infinite-scroll-component')]//div[1]//div[1]//div[1]//div[1]//div[3]//div[1]//div[1]//button[1]//*[name()='svg']//*[name()='path' and contains(@d,'M3 12C4.38')]")
    WebElement confirmDelete;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/a[1]")
    WebElement EditPost;
    @FindBy(xpath = "//*[@id=\"app-inner\"]/div[2]/div[2]/div[2]/div/div[3]/div[1]/div/div[2]/button")
    WebElement StartTriviabtn;
    @FindBy(xpath = "//*[@id=\"app-inner\"]/div[2]/div[2]/div[2]/div/div[1]/button/svg")
    WebElement stsrtTrtivia;
    @FindBy(xpath = "//*[@id=\"body\"]/div[2]/div[2]/div/div/span/span")
    WebElement CloseTrivia;
    @FindBy(xpath = "//*[@id=\"body\"]/div[2]/div[2]/div/div/div/div/div[2]/button[2]")
    WebElement confirmTriviaClose;
    @FindBy(xpath = "//*[@id=\"app-inner\"]/div[2]/div[2]/div[2]/div/div[1]/div[3]/div[2]/button")
    WebElement startTestbtn;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/span/img")
    WebElement closeTest;
    @FindBy(xpath = "//*[@id=\"app-inner\"]/div[2]/div[2]/div[2]/div/div[1]/button/svg")
    WebElement Tip;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.driverActions = PagesFactory.getDriverActionsObject();
        this.driverWaits = PagesFactory.getDriverWaitsObject();
    }


    public boolean home(TestDataModel dataModel) {
        try {
            int step = 0;
            System.out.println("\n## Started Navigating To The Home Page. ##\n");
            driverActions.clickOnWebElementWithActionsClass(NavigatetoHome);
            step++;


            System.out.println("Navigated to the home page");
           implicitlyWait(5);
            driverActions.clickOnWebElementWithActionsClass(shareWinmind);
            step++;
            System.out.println("Clicked on the input field");
            implicitlyWait(3);
            driverActions.typeText(shareWinmind, dataModel.getPost());
            step++;

            System.out.println("Shared What's In Mind");
            //implicitlyWait(2);
            driverActions.clickOnWebElementUsingJavaScript(postbutton);
            step++;
            System.out.println("Posted the shared text");
            //implicitlyWait(2);
            driverActions.clickOnWebElementWithActionsClass(Likeapost);
            System.out.println("Liked A Post");
            implicitlyWait(10);
//            driverActions.clickOnWebElementWithActionsClass(drpdwnPost);
//            driverActions.clickOnWebElementWithActionsClass(EditPost);

            driverActions.clickOnWebElementWithActionsClass(drpdwnPost);
            driverActions.clickOnWebElementWithActionsClass(deletePost);
            implicitlyWait(5);
            driverActions.clickOnWebElementWithActionsClass(confirmDelete);
            implicitlyWait(20);
            System.out.println("post deleted");

            driverActions.clickOnWebElementWithActionsClass(StartTriviabtn);
            System.out.println("Navigated to the Trivia Modal");
            implicitlyWait(2);
            driverActions.clickOnWebElementWithActionsClass(stsrtTrtivia);
            System.out.println("Started Trivia");
            driverActions.clickOnWebElementWithActionsClass(CloseTrivia);
            System.out.println("Trivia Closed");
            implicitlyWait(5);
            driverActions.clickOnWebElementWithActionsClass(confirmTriviaClose);
            implicitlyWait(5);


            driverActions.clickOnWebElementWithActionsClass(startTestbtn);
            System.out.println("Navigated to the test modal");
            implicitlyWait(10);
            driverActions.clickOnWebElementWithActionsClass(closeTest);
            System.out.println("Closed test");
            implicitlyWait(5);


            driverActions.clickOnWebElementWithActionsClass(Tip);
            System.out.println("Navigated to the tip");

            driverActions.clickOnWebElementWithActionsClass(joinPicoftheWeekC);
            step++;
            System.out.println("Clicked join now button on pic of the week challenge");
            driverActions.clickOnWebElementWithActionsClass(Enterpicoftheweek);
            step++;
            System.out.println("Clicked Enter to join pic of the week challenge");
            driverActions.clickOnWebElementWithActionsClass(Exitfromuploadp);
            step++;
            System.out.println("Exit from the upload modal of the pic of the week challenge");
//            driverActions.scrollToWebElementWithJavaScript(ScrollToElement);
//            driverActions.
            driverActions.clickOnWebElementWithActionsClass(trendingTopic);
            step++;
            System.out.println("Navigated to the trending topic");
            driverActions.clickOnWebElementWithActionsClass(Walloffame);
            System.out.println("Navigated to the wall of fame page");
            return true;

        } catch (Exception ex) {
            System.out.println(ex);

            return false;
        }
    }
}
