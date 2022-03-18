/**
 * Login page class implementation.
 * Author: Nabil, Date: September 12, 2020
 */

package main.java.testcases;

import DataModel.TestDataModel;
import main.java.testdataprovider.TestDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import pages.PagesFactory;

import applicationsettings.ApplicationSettings;


@SuppressWarnings("ThrowablePrintedToSystemOut")
public class HomepageTest extends BaseTest {
    @SuppressWarnings("unused")
    HomePage Homepage;
    @Test(dataProvider = "credentials", dataProviderClass = TestDataProvider.class,priority = 3)
    public void validateHomeFunctionality(String post) {

        try {

            initializeTest("Validate Home Functionality", "This test will verify that the home page is functional", "Sanity Test");

            Homepage = PagesFactory.getHomePage();
            TestDataModel testData = new TestDataModel();

            testData.setPost(post);
            System.out.println(post);



            System.out.println("\nStarting signup into the site.\\n");
            boolean signupResult = Homepage.home(testData);
//            Assert.assertTrue(loginResult, "Login failed");

        } catch (Exception ex) {
            System.out.println(ex);

        }
    }
}