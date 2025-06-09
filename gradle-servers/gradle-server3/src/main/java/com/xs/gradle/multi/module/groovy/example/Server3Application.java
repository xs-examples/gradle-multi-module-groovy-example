package com.xs.gradle.multi.module.groovy.example;

import com.xs.gradle.multi.module.groovy.example.common.CommonEntity;
import com.xs.gradle.multi.module.groovy.example.integration.IntegrationService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Server3Application implements ApplicationRunner {
    private final IntegrationService integrationService;

    public Server3Application(final IntegrationService integrationService) {
        this.integrationService = integrationService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Server3Application.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        integrationService.integration(CommonEntity.builder().name("server3").url("https://www.baidu.com").build());
    }
}