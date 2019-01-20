package cn.sysq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author linjingze
 * @date 2019/1/20 11:11 AM
 */
@SpringBootApplication
@EnableEurekaClient
public class DeptConsumer80_App {


    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_App.class, args);
    }
}
