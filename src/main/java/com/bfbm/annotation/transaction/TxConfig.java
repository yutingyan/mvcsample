package com.bfbm.annotation.transaction;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy        //开启AOP代理自动配置
@ComponentScan({"com.bfbm.annotation.transaction"})
@Configuration
public class TxConfig {


}
