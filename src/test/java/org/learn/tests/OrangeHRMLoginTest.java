package org.learn.tests;

import org.assertj.core.api.Assertions;
import org.pages.OrangeHRMLoginPage;
import org.testng.annotations.Test;

public class OrangeHRMLoginTest extends BaseTest{

    @Test
    public void test_login() {
        OrangeHRMLoginPage orl = new OrangeHRMLoginPage();
        String title = orl.enterUserName("Admin").enterPassword("admin123").click_login().click_logout().getPageTitle();

        Assertions.assertThat(title)
                .isEqualToIgnoringCase("OrangeHRM")
                .isInstanceOf(String.class);
    }
}
