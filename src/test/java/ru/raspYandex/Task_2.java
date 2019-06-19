package ru.raspYandex;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_2 {
    public WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void test() {
        driver.manage().window().maximize();
  /*      driver.navigate().to("https://rasp.yandex.ru");

        WebElement fromField = driver.findElement(By.id("from"));
        fromField.sendKeys("Кемерово проспект Ленина");

        WebElement toField = driver.findElement(By.xpath("//*[@id=\"to\"]"));
        toField.sendKeys("Кемерово Бакинский переулок");

        WebElement whenField = driver.findElement(By.id("when"));
        whenField.sendKeys("26 июня");

        WebElement busButton = driver.findElement(By.xpath("//div[@class='TransportSelector']//lable[@class='RadioButton']//span[@class='RadioButton__buttonLable']"));
        busButton.click();

        WebElement searchButton = driver.findElement(By.xpath("//form[@class='SearchForm__holder']//button[@class='Button SearchForm__submit']"));
        searchButton.click();
*/
        driver.navigate().to("https://rasp.yandex.ru/search/bus/?fromName=%D0%9A%D0%B5%D0%BC%D0%B5%D1%80%D0%BE%D0%B2%D0%BE+%D0%BF%D1%80%D0%BE%D1%81%D0%BF%D0%B5%D0%BA%D1%82+%D0%9B%D0%B5%D0%BD%D0%B8%D0%BD%D0%B0&toName=%D0%9A%D0%B5%D0%BC%D0%B5%D1%80%D0%BE%D0%B2%D0%BE+%D0%91%D0%B0%D0%BA%D0%B8%D0%BD%D1%81%D0%BA%D0%B8%D0%B9+%D0%BF%D0%B5%D1%80%D0%B5%D1%83%D0%BB%D0%BE%D0%BA&when=26+%D0%B8%D1%8E%D0%BD%D1%8F");
        boolean text;
        text = driver.findElements(By.linkText("Пункт прибытия не найден. Проверьте правильность написания или выберите другой город.")).size() > 0;
        System.out.println(text);
    }

    @After
    public void close() {
       // driver.quit();
    }
}
