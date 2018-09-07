package com.wthfeng.democlient.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wthfeng.dubboapi.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author wangtonghe
 * @since 2018/9/7 10:11
 */
@Service
public class BusinessService {

    @Reference(version = "1.0", group = "demo-dubbo")
    private HelloService helloService;


    public void testHello(String name) {
        String str = helloService.sayHello(name);
        System.out.println("调用结果：" + str);
    }
}
