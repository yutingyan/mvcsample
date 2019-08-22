package com.bfbm.annotation.test.aop;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy        //开启AOP代理自动配置
@ComponentScan({"com.bfbm.annotation.test"})
@Configuration
public class AOPConfig {
    public AOPConfig() {
        System.out.println("into AOPConfig");
    }
}
