package com.wthfeng.democlient.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author wangtonghe
 * @since 2018/9/7 09:58
 */
@Configuration
@ConfigurationProperties(prefix = "application.dubbo.demo.client")
@PropertySource("classpath:dubbo-client.properties")
@Data
public class DubboProperties {

    private String name;

    private String address;

    private String client;
}
