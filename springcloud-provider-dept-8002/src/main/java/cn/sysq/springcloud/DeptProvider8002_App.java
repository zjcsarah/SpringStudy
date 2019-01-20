package cn.sysq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author linjingze
 * @date 2019/1/20 10:39 AM
 */
@SpringBootApplication
// 本服务启动后会自动注册进eureka服务中
@EnableEurekaClient
// 服务发现
@EnableDiscoveryClient
public class DeptProvider8002_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8002_App.class, args);
    }
}
