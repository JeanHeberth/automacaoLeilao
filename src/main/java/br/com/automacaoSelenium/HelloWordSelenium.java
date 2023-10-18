package br.com.automacaoSelenium;


import com.google.common.annotations.VisibleForTesting;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWordSelenium {
    @Test
    public void hello(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8088/leiloes");
        String title = driver.getTitle();
        System.out.println("Titulo da página:  " + title);
        driver.quit();
    }
}
