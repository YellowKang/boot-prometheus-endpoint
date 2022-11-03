package com.kang.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author HuangKang
 * @date 2022/11/3 5:51 PM
 * @describe SpringBoot + Prometheus 测试端点
 */
@SpringBootApplication
public class BootPrometheusEndpointApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(BootPrometheusEndpointApplication.class);
        application.run(args);
    }
}
