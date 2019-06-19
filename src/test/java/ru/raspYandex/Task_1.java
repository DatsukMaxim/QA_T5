package ru.raspYandex;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_1 {


    public WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void firstTest() {
        driver.manage().window().maximize();
        driver.navigate().to("https://rasp.yandex.ru");

        WebElement fromField = driver.findElement(By.id("from"));
        fromField.sendKeys("Кемерово");

        WebElement toField = driver.findElement(By.xpath("//*[@id=\"to\"]"));
        toField.sendKeys("Москва");

        WebElement whenField = driver.findElement(By.id("when"));
        whenField.sendKeys("7 июля");

        WebElement searchButton = driver.findElement(By.xpath("//form[@class='SearchForm__holder']//button[@class='Button SearchForm__submit']"));
        searchButton.click();

        boolean number, time, icon;
        number = driver.findElements(By.xpath("//article[@class='SearchSegment SearchSegment_isNotInterval SearchSegment_isNotGone SearchSegment_isVisible']//a[@class='Link SegmentTitle__link']//span[@class='SegmentTitle__number']")).size()>0;
        System.out.println("number - " + number);

        time = driver.findElements(By.xpath("//article[@class='SearchSegment SearchSegment_isNotInterval SearchSegment_isNotGone SearchSegment_isVisible']//div[@class='SearchSegment__duration']")).size()>0;
        System.out.println("time - " + time);

        icon = driver.findElements(By.id("icon-plane")).size()>0;
        System.out.println("icon - " + icon);
    }

    @After
    public void close() {
        driver.quit();
    }
}
