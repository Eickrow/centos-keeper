package com.mine.keeper.web;

import com.mine.keeper.api.KeeperApiApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(KeeperApiApplication.class)
public class KeeperWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(KeeperWebApplication.class, args);
    }
}
