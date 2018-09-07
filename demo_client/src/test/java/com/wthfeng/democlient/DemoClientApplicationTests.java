package com.wthfeng.democlient;

import com.wthfeng.democlient.service.BusinessService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoClientApplicationTests {

    @Resource
    private BusinessService businessService;

    @Test
    public void contextLoads() {
        businessService.testHello("dubbo");

    }
}
