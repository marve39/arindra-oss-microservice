package com.nokia.gdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient //http://cloud.spring.io/spring-cloud-zookeeper/spring-cloud-zookeeper.html
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
