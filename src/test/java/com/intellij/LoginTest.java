package com.intellij;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        // تهيئة WebDriver باستخدام WebDriverManager
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        // فتح صفحة تسجيل الدخول
        driver.get("https://lms.skillsdynamix.com/login/index.php"); // استبدل الرابط برابط صفحتك
        driver.manage().window().maximize(); // تكبير النافذة
    }

    @Test
    public void testLogin() {
        try {
            // العثور على حقل اسم المستخدم وإدخال القيمة
            driver.findElement(By.id("username")).sendKeys("drnabil.nabih");

            // العثور على حقل كلمة المرور وإدخال القيمة
            driver.findElement(By.id("password")).sendKeys("drnabel@NABIH2D");

            // النقر على زر تسجيل الدخول
            driver.findElement(By.id("loginbtn")).click();

            // التحقق من نجاح تسجيل الدخول
            boolean isLoggedIn = driver.findElement(By.id("NABIL NABIH ABDELWAHAB")).isDisplayed();
            assertTrue(isLoggedIn, "لم يتم تسجيل الدخول بنجاح!");

        } catch (Exception e) {
            System.err.println("حدث خطأ أثناء تنفيذ الاختبار: " + e.getMessage());
        }
    }


    @AfterEach
    public void tearDown() {
        // إغلاق المتصفح بعد انتهاء الاختبار
        if (driver != null) {
            driver.quit();
        }
    }
}