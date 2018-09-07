package com.wthfeng.dubboserver.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author wangtonghe
 * @since 2018/7/14 14:12
 */
@Configuration
@ConfigurationProperties(prefix = "application.dubbo.demo.server")
@PropertySource("dubbo-server.properties")
@Data
public class DubboProperties {

    private String name;

    private String address;

    private String client;
}
