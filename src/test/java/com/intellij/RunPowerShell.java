package com.intellij;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class RunPowerShell {
    public static void main(String[] args) {
        // الأمر الذي نريد تنفيذه في PowerShell
        String command = "Get-Process"; // مثال: الحصول على قائمة العمليات

        // تحسينات:
        // 1. إضافة معالجة للاستثناءات بشكل أفضل
        // 2. إغلاق الموارد بشكل صحيح
        // 3. إضافة وقت انتظار للعملية
        // 4. معالجة المقاطعة (Interruption) بشكل صحيح

        Process process = null;
        BufferedReader reader = null;

        try {
            // إعداد ProcessBuilder مع تحسينات الأمان
            ProcessBuilder processBuilder = new ProcessBuilder(
                    "powershell.exe",
                    "-NoProfile", // عدم تحميل الملف الشخصي لتحسين الأداء
                    "-ExecutionPolicy", "Bypass", // تجاوز سياسة التنفيذ إذا لزم الأمر
                    "-Command", command
            );

            processBuilder.redirectErrorStream(true);

            // بدء العملية
            process = processBuilder.start();

            // قراءة المخرجات
            reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // انتظار انتهاء العملية مع تحديد وقت انتظار قصوى (30 ثانية)
            boolean finished = process.waitFor(30, java.util.concurrent.TimeUnit.SECONDS);

            if (!finished) {
                System.err.println("تحذير: العملية لم تنته خلال الوقت المحدد");
                process.destroy(); // إنهاء العملية
            }

            int exitCode = process.exitValue();
            System.out.println("رمز الخروج: " + exitCode);

        } catch (IOException e) {
            System.err.println("خطأ في تنفيذ الأمر: " + e.getMessage());
            e.printStackTrace();
        } catch (InterruptedException e) {
            System.err.println("تم مقاطعة العملية");
            Thread.currentThread().interrupt(); // إعادة ضبط حالة المقاطعة
            if (process != null) {
                process.destroy(); // إنهاء العملية
            }
        } finally {
            // إغلاق الموارد في كتلة finally لضمان التنظيف
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.err.println("خطأ في إغلاق القارئ: " + e.getMessage());
                }
            }
            if (process != null) {
                process.destroy(); // التأكد من إنهاء العملية
            }
        }
    }
}