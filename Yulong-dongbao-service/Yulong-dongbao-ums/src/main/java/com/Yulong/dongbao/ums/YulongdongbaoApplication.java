package com.Yulong.dongbao.ums;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther: YuLong
 * @Date: 2021/10/23
 * @Description: com.Yulong.Yulongdongbaoums
 */
@SpringBootApplication
@MapperScan("com.Yulong.dongbao.ums.mapper")
public class YulongdongbaoApplication {
    public static void main(String[] args) {
            SpringApplication.run(YulongdongbaoApplication.class, args);
        }



}
