package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_NAME = "//div[contains(@id, \"u_0_m\")]/div/input[1]";
    public static final String XPATH_SURNAME = "//div[contains(@id, \"u_0_o\")]/div/input[1]";
    public static final String XPATH_PHONE = "//div[contains(@id, \"u_0_r\")]/div/input[1]";
    public static final String XPATH_PASSWORD = "//div[contains(@id, \"u_0_y\")]/div/input[1]";
    public static final String XPATH_DAY = "//span[contains(@class, \"_5k_4\")]/span/select[1]";
    public static final String XPATH_MONTH = "//span[contains(@class, \"_5k_4\")]/span/select[2]";
    public static final String XPATH_YEAR = "//span[contains(@class, \"_5k_4\")]/span/select[3]";


    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement name = driver.findElement(By.xpath(XPATH_NAME));
        name.sendKeys("Adrian");

        WebElement surname = driver.findElement(By.xpath(XPATH_SURNAME));
        surname.sendKeys("Pazucha");

        WebElement phone = driver.findElement(By.xpath(XPATH_PHONE));
        phone.sendKeys("781276569");

        WebElement password = driver.findElement(By.xpath(XPATH_PASSWORD));
        password.sendKeys("Kodilla123");

        WebElement day = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(day);
        selectDay.selectByIndex(22);

        WebElement month = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonth = new Select(month);
        selectMonth.selectByIndex(5);

        WebElement year = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYear = new Select(year);
        selectYear.selectByIndex(30);



    }
}
