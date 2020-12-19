/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sel.tests;

import com.sel.jenkinssel.Calculator;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author itexps
 */
public class AShopLoginTest {
    
    public AShopLoginTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    WebDriver driver;
    @Before
    public void setUp() {
    /*   System.setProperty("webdriver.chrome.driver", "c:\\qa\\drivers\\chromedriver.exe");
       driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);*/
    }
    
    @After
    public void tearDown() {
        //driver.quit();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    /* @Test
    public void testLogin() throws InterruptedException{
        driver.get("http://advantageonlineshopping.com/#/");
        driver.findElement(By.id("hrefUserIcon")).click();
        driver.findElement(By.name("username")).sendKeys("nltest2");
        driver.findElement(By.name("password")).sendKeys("Abc@1234");
        driver.findElement(By.id("sign_in_btnundefined")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@id='menuUserLink']/span")).click();
        driver.findElement(By.xpath("//div[@id='loginMiniTitle']/label[3]")).click();
    }*/
    
    @Test
    public void testAdd(){
        Calculator c=new Calculator();
        int result=c.add(100,200);
        assertEquals(300, result);
    }
    
      @Test
    public void testAdd1(){
        Calculator c=new Calculator();
        int result=c.add(100,300);
        assertEquals(400, result);
    }
}
