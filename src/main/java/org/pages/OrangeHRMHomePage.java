package org.pages;

import org.openqa.selenium.By;

public class OrangeHRMHomePage extends BasePage{

        private final By lnk_About = By.id("welcome");
        private final By lnk_logout = By.xpath("//a[text()='Logout']");

        public OrangeHRMLoginPage click_logout() throws Exception {

            click(lnk_About,"Welcome Link");
            click(lnk_logout,"Logout Link");

            return new OrangeHRMLoginPage();
        }


    }