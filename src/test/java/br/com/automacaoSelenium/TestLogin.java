package br.com.automacaoSelenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class TestLogin {


    @Test
    public void realizarLogin(){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://localhost:8088/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("username")).sendKeys("fulano");
        driver.findElement(By.id("password")).sendKeys("pass");
        driver.findElement(By.id("Login")).click();
        driver.findElement(By.xpath("//a[@class=\"text-light ml-3\"]")).click();
        driver.quit();

    }
}
