package com.lwt.cloudpicture;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.aop.framework.AopContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.lwt.cloudpicture.mapper")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class CloudpictureApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudpictureApplication.class, args);

    }


}
