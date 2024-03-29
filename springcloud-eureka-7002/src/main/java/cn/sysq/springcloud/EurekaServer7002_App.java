package cn.sysq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author linjingze
 * @date 2019/1/20 1:30 PM
 */
@SpringBootApplication
// EurekaServer 服务启动类 接受其他微服务注册进来
@EnableEurekaServer
public class EurekaServer7002_App {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7002_App.class, args);
    }

}
