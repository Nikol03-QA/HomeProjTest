package library;


import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ActionWithElement {

    protected WebDriver webDriver;
    WebDriverWait webDriverWait_10;
    WebDriverWait webDriverWait_15;
    Logger logger = Logger.getLogger(getClass());

    public ActionWithElement(WebDriver webDriver) {
        this.webDriver=webDriver;
//        webDriverWait_10 = new WebDriverWait(webDriver, 10);
//        webDriverWait_15 = new WebDriverWait(webDriver, 15);
    }
    public void enterTextIntoInput (WebElement webElement, String text){
        try{
        webElement.clear();
        webElement.sendKeys(text);
        logger.info(text + " was imputed in to the input.");
    }catch (Exception e ) {
        stopTestAndPrintMessage();
    }
    }

    private void stopTestAndPrintMessage() {
        logger.error("Can not work with element ");
        Assert.fail("Can not work with element ");
    }
    }

