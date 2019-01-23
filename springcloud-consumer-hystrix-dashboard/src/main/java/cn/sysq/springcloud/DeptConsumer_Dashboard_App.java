package cn.sysq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


/**
 * http://127.0.0.1:9001/hystrix 访问地址
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumer_Dashboard_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_Dashboard_App.class, args);
    }
}