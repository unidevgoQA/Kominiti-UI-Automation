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
    HomePage homePage;
  @Test(dataProvider = "credentials", dataProviderClass = TestDataProvider.class,priority = 3)
    public void validateHomeFunctionality(String post) {
        String post1 = "Test post";

        try {

            initializeTest("Validate Home Functionality", "This test will verify that the home page is functional", "Sanity Test");

            homePage = PagesFactory.getHomePage();
            TestDataModel testData = new TestDataModel();

            testData.setPost(post1);
            System.out.println(post1);



            System.out.println("\nStarting Home Navigation into the site.\\n");
            boolean signupResult = homePage.home(testData);
            Assert.assertTrue(signupResult, "Login failed");
//            Assert.assertNotNull(signupResult);
            System.out.println(signupResult);

        } catch (Exception ex) {
            System.out.println(ex);

        }
    }
}