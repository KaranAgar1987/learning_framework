package org.learn.tests;




import org.assertj.core.api.Assertions;
import org.learn.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;


public final class LoginpageTests extends BaseTest{


    private LoginpageTests(){}

    @Test
    public void test2()
    {

        DriverManager.getWebDriver().findElement(By.name("q")).sendKeys("Automation", Keys.ENTER);
    }

    @Test
    public void test3()
    {

        DriverManager.getWebDriver().findElement(By.name("q")).sendKeys("Automation", Keys.ENTER);
        String title = DriverManager.getWebDriver().getTitle();

        Assertions.assertThat(title)
                .isNotNull()
                .as("Checking the error messag").containsIgnoringCase("automation")
                .withFailMessage(() -> "Size is less than 100")
                .hasSizeLessThan(100)
                .isInstanceOf(String.class)
                .isMixedCase();
    }

    @Test
    public void test4(){
        String test = "abc";
        Assertions.assertThat(test)
                .containsIgnoringCase("bc");
    }

}
