package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_BIRTHDAY = "//div[@class=\"_5k_5\"]/span/span/";
    public static final String XPATH_BIRTHDAY_MONTH = XPATH_BIRTHDAY + "select[@id=\"month\"]";
    public static final String XPATH_BIRTHDAY_DAY = XPATH_BIRTHDAY + "select[@id=\"day\"]";
    public static final String XPATH_BIRTHDAY_YEAR = XPATH_BIRTHDAY + "select[@id=\"year\"]";
    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_BIRTHDAY_MONTH));
        WebElement selectComboDay = driver.findElement(By.xpath(XPATH_BIRTHDAY_DAY));
        WebElement selectComboYear = driver.findElement(By.xpath(XPATH_BIRTHDAY_YEAR));

        Select selectMonth = new Select(selectComboMonth);
        Select selectDay = new Select(selectComboDay);
        Select selectYear = new Select(selectComboYear);

        selectDay.selectByIndex(8);
        selectMonth.selectByVisibleText("sie");
        selectYear.selectByValue("1991");
    }
}
