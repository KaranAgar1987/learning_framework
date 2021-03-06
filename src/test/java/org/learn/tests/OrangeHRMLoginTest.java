package org.learn.tests;

import com.aventstack.extentreports.ExtentTest;
import org.FrameworkAnnotation.FrameworkAnnotation;
import org.assertj.core.api.Assertions;
import org.enums.TestCategory;
import org.extentreport.ExtentReport;
import org.pages.OrangeHRMLoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OrangeHRMLoginTest extends BaseTest{


    @DataProvider(name="loginDataProvider",parallel = true)
    public Object[][] getData(){

        return new Object[][]{
                {"Admin","admin123"},
                {"Admin1","admin123"}
        };
    }


    @FrameworkAnnotation(author = {"Karan"},Category={TestCategory.Regression})
    @Test(dataProvider = "loginDataProvider" )
    public void test_login(String username,String password) throws Exception {

        OrangeHRMLoginPage orl = new OrangeHRMLoginPage();
        String title = orl.enterUserName(username).enterPassword(password).click_login().click_logout().getPageTitle();
        Assertions.assertThat(title)
                .isEqualToIgnoringCase("OrangeHRM")
                .isInstanceOf(String.class);
    }

    @FrameworkAnnotation(author = {"Karan","Ashutosh"},Category={TestCategory.Regression,TestCategory.Smoke})
    @Test(dataProvider = "loginDataProvider" )
    public void test_login2(String username,String password) throws Exception {

        OrangeHRMLoginPage orl = new OrangeHRMLoginPage();
        String title = orl.enterUserName(username).enterPassword(password).click_login().click_logout().getPageTitle();
        Assertions.assertThat(title)
                .isEqualToIgnoringCase("OrangeHRM")
                .isInstanceOf(String.class);
    }
}
