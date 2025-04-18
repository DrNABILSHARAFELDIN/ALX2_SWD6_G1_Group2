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
        driver.get("https://www.jetbrains.com/idea/download/?section=windows"); // استبدل الرابط برابط صفحتك
        driver.manage().window().maximize(); // تكبير النافذة
    }

    @Test
    public void testLogin() {
        try {
            // العثور على حقل اسم المستخدم وإدخال القيمة
            driver.findElement(By.id("username")).sendKeys("yourUsername");

            // العثور على حقل كلمة المرور وإدخال القيمة
            driver.findElement(By.id("password")).sendKeys("yourPassword");

            // النقر على زر تسجيل الدخول
            driver.findElement(By.id("loginButton")).click();

            // التحقق من نجاح تسجيل الدخول
            boolean isLoggedIn = driver.findElement(By.id("welcomeMessage")).isDisplayed();
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