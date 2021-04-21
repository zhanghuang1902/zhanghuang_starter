package com.zhanghuang;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author 97083
 */
@ConfigurationProperties(prefix = "com.zhanghuang")
public class HelloProperties {

    private String name="张煌";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
