package com.wthfeng.dubboserver.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.wthfeng.dubboserver.properties.DubboProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * @author wangtonghe
 * @since 2018/7/14 14:03
 */
@Configuration
public class DubboConfig {

    @Resource
    private DubboProperties dubboProperties;

    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName(dubboProperties.getName());
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress(dubboProperties.getAddress());
        registryConfig.setClient(dubboProperties.getClient());
        return registryConfig;
    }










}
