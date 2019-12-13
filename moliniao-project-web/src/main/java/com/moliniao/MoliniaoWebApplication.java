package com.moliniao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.moliniao.mapper")
public class MoliniaoWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoliniaoWebApplication.class, args);
    }

}
