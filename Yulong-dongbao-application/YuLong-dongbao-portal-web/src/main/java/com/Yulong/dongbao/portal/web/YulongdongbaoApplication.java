package com.Yulong.dongbao.portal.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @Auther: YuLong
 * @Date: 2021/10/23
 * @Description: com.Yulong.Yulongdongbaoums
 */
@SpringBootApplication(scanBasePackages = {"com.Yulong"})
@MapperScan("com.Yulong.dongbao.ums.mappers")
public class YulongdongbaoApplication {
    public static void main(String[] args) { SpringApplication.run(YulongdongbaoApplication.class, args);
        }

        @Bean
        public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
        }



}
