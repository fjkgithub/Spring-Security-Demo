package com.spring.security;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan({"com.spring.security.dao","com.gitee.sunchenbin.mybatis.actable.dao.*"})
@SpringBootApplication(scanBasePackages = {"com.spring.security.*", "com.gitee.sunchenbin.mybatis.actable.manager.*"})
public class SecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityApplication.class, args);
    }

}
