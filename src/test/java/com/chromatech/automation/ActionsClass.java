package com.chromatech.automation;

import com.chromatech.automation.utils.CommonMethods;
import com.chromatech.automation.utils.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActionsClass {

    public static void main(String[] args) {
         /*
         * TOPIC: ACTIONS CLASS
         */

        WebDriverUtils.setUp();
        String url = "https://chroma-tech-academy.mexil.it/static_page/";
        WebDriverUtils.driver.get(url);

        /* SCROLLING DOWN EXAMPLE USING ACTIONS CLASS */
        
        WebElement hoverButton = WebDriverUtils.driver.findElement(By.xpath("//button[normalize-space()='Mouse Hover']"));
        CommonMethods.moveToElement(hoverButton);
        CommonMethods.moveToElementAndRightClick(hoverButton);

        // SCROLLING TO AN ELEMENT THAT IS LOWER THAN THE HOVER BUTTON
        WebElement restAPILink = WebDriverUtils.driver.findElement(By.xpath("//a[normalize-space()='REST API']"));
        CommonMethods.moveToElement(restAPILink);
        WebDriverUtils.driver.quit();
    }
}