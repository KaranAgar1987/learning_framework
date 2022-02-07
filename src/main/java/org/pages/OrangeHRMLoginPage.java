package org.pages;

import org.learn.driver.DriverManager;
import org.openqa.selenium.By;

public class OrangeHRMLoginPage extends BasePage {

   private final By txt_userName = By.id("txtUsername");
   private final By txt_password = By.xpath("//input[@id='txtPassword' and @type='password']");
   private final By btn_login= By.id("btnLogin");

   public OrangeHRMLoginPage enterUserName(String userName){
       //DriverManager.getWebDriver().findElement(txt_userName).sendKeys(userName);
       sendKeys(txt_userName,userName,"UserName");
       return this;
   }
    public OrangeHRMLoginPage enterPassword(String password){
        //DriverManager.getWebDriver().findElement(txt_password).sendKeys(password);
        sendKeys(txt_password,password,"Password");
        return this;
    }
    public OrangeHRMHomePage click_login(){
        //DriverManager.getWebDriver().findElement(btn_login).click();
        click(btn_login,"Login Button");
        return (new OrangeHRMHomePage());
    }
    public String getPageTitle(){
        return getTitle();
    }
}
