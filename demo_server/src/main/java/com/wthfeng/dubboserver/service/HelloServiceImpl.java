package com.wthfeng.dubboserver.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.wthfeng.dubboapi.service.HelloService;

/**
 * @author wangtonghe
 * @since 2018/9/5 17:46
 */
@Service(timeout = 5000, version = "1.0", group = "demo-dubbo")
public class HelloServiceImpl implements HelloService {


    @Override
    public String sayHello(String name) {
        String value = "Hello " + name + " !";
        return value;
    }
}
