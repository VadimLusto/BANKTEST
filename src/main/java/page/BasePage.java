package page;

import driver.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    public WebDriver webDriver = DriverSingleton.getDriver();


    public void goTo(String text) {
        webDriver.get(text);

    }

    public void fillInTheField(String text, By elementBy) {
        WebElement element = webDriver.findElement(elementBy);
        element.clear();
        element.sendKeys(text);
    }
    public void click(By elementBy){
        webDriver.findElement(elementBy).click();
    }

}
