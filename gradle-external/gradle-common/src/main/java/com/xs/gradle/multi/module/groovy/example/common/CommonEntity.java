package com.xs.gradle.multi.module.groovy.example.common;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommonEntity {
    private String name;
    private String url;
}