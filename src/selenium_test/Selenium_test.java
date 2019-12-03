/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selenium_test;

/**
 *
 * @author netphenix
 */
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
//import org.junit.Test

public class Selenium_test {

    /**
     * @param args the command line arguments
     */
    private static WebDriver driver = null;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/netphenix/Downloads/chromedriver_linux64/chromedriver");
        driver = new ChromeDriver();
        driver.get("http:\\localhost:8081\\jenkins_test\\");
        driver.manage().window().maximize();
        driver.findElement(By.id("uname")).sendKeys("admin");
        driver.findElement(By.id("pword")).sendKeys("admin");
        driver.findElement(By.id("click")).click();
        String at = driver.getTitle();
        System.out.println(at);
        String et = "Login";
//        driver.close();
        if (at.equalsIgnoreCase(et)) {
            System.out.println("Test Successfully");
        } else {
            System.out.println("Test Failure");
        }
    }

}
