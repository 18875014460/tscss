package com.kalvin.kvf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class})
//@MapperScan("com.kalvin.kvf.**.*")
public class KvfAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(KvfAdminApplication.class, args);
    }

}