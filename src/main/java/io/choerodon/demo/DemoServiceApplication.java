package io.choerodon.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableFeignClients
@EnableEurekaClient
//@EnableChoerodonResourceServer
public class DemoServiceApplication {
    public static void main(String[] args){
        SpringApplication.run(DemoServiceApplication.class, args);
    }
}

