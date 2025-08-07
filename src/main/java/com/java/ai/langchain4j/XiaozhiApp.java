package com.java.ai.langchain4j;
/**
 * ClassName: XiaozhiApp
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author PML
 * @Create 2025/8/3 14:32
 * @Version 1.0
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class XiaozhiApp {
    public static void main(String[] args) {
        // 驱动加载测试
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("MySQL驱动加载成功");
        } catch (Exception e) {
            System.err.println("MySQL驱动加载失败：");
            e.printStackTrace();
        }
        SpringApplication.run(XiaozhiApp.class, args);
    }
}
