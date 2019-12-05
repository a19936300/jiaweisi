package com.binbinxiu.jiaweisi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.binbinxiu.jiaweisi.dao"})
public class JiaweisiApplication {

    public static void main(String[] args) {
        SpringApplication.run(JiaweisiApplication.class, args);
    }

}
