package com.xs.gradle.multi.module.groovy.example.integration;

import com.xs.gradle.multi.module.groovy.example.client.Client;
import com.xs.gradle.multi.module.groovy.example.common.CommonEntity;
import com.xs.gradle.multi.module.groovy.example.util.CommonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class IntegrationServiceImpl implements IntegrationService {

    private final Client client;

    public IntegrationServiceImpl(Client client) {
        this.client = client;
    }

    @Override
    public void integration(CommonEntity commonEntity) {
        String wrapperName = CommonUtil.wrapperName(commonEntity.getName());
        Integer httpStatus = client.requestHttpStatus(commonEntity.getUrl());
        log.info("name -> {} ,request url -> {} ,http status -> {}", wrapperName, commonEntity.getUrl(), httpStatus);
    }
}