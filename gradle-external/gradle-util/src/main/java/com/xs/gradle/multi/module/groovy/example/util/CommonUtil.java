package com.xs.gradle.multi.module.groovy.example.util;

import cn.hutool.core.util.StrUtil;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CommonUtil {
    public String wrapperName(String name) {
        return StrUtil.join("帅气的🔹{}🔹", name);
    }
}