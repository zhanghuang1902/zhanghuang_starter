package com.zhanghuang;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 97083
 */
public class HelloServiceImpl implements HelloService {

    @Autowired
    private HelloProperties helloProperties;
    @Override
    public void sayHello() {
        System.out.println(helloProperties.getName()+":hello world!");
    }
}
