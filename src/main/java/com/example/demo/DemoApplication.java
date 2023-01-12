package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author mht
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("测试Jenkins----------->");
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("项目启动成功----------->");
    }

}
