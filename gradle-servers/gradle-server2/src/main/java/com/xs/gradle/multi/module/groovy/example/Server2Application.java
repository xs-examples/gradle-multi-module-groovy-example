package com.xs.gradle.multi.module.groovy.example;

import com.xs.gradle.multi.module.groovy.example.common.CommonEntity;
import com.xs.gradle.multi.module.groovy.example.integration.IntegrationService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.xs.gradle.multi.module.groovy.example")
public class Server2Application implements ApplicationRunner {
    private final IntegrationService integrationService;

    public Server2Application(final IntegrationService integrationService) {
        this.integrationService = integrationService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Server2Application.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        integrationService.integration(CommonEntity.builder().name("server2").url("https://www.baidu.com").build());
    }
}