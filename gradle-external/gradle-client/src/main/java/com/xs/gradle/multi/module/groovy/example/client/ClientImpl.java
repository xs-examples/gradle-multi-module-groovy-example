package com.xs.gradle.multi.module.groovy.example.client;

import lombok.extern.slf4j.Slf4j;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Slf4j
@Service
public class ClientImpl implements Client {

    @Override
    public Integer requestHttpStatus(String url) {
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet httpGet = new HttpGet(url);
            CloseableHttpResponse response = httpClient.execute(httpGet);
            return response.getStatusLine().getStatusCode();
        } catch (IOException e) {
            log.error("request error", e);
        }
        return -1;
    }
}