package com.chromatech.automation.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {

    /**
     * Use this method to move to an element
     *
     * @param element
     */
    public static void moveToElement(WebElement element) {
        Actions actions = new Actions(WebDriverUtils.driver);
        actions.moveToElement(element).perform();
    }

    /**
     * Use this method to move to an element and right click
     *
     * @param element
     */
    public static void moveToElementAndRightClick(WebElement element) {
        Actions actions = new Actions(WebDriverUtils.driver);
        actions.moveToElement(element).contextClick().perform();
    }

    public static void sleep(long waitTime) {
        try {
            Thread.sleep(waitTime);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }

    /**
     * Use this method to select a value by visible text with select drop-downs
     * @param element
     * @param option
     */
    public static void selectValueByVisibleText(WebElement element, String option){
        Select select = new Select(element);
        select.selectByVisibleText(option);
    }

    /**
     * Use this method to select a value by index with select drop-down
     * @param element
     * @param index
     */
    public static void selectValueByIndex(WebElement element, int index){
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    /**
     * Use this method to select a value by using an attribute value with select drop-downs
     * @param element
     * @param value
     */
    public static void selectValueByAttributeValue(WebElement element, String value){
        Select select = new Select(element);
        select.selectByValue(value);
    }

    public static void selectDateByJS(WebElement element, String date) {
        JavascriptExecutor js = (JavascriptExecutor) WebDriverUtils.driver;
        js.executeScript("arguments[0].setAttribute('value','" + date + "');", element);
    }




}
