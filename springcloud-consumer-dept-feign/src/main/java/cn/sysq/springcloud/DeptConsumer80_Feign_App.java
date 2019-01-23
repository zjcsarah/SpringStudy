package cn.sysq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author linjingze
 * @date 2019/1/20 11:11 AM
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"cn.sysq.springcloud"})
public class DeptConsumer80_Feign_App  {


    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_Feign_App.class, args);
    }
}
