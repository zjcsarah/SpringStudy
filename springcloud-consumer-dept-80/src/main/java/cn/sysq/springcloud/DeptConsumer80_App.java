package cn.sysq.springcloud;

import cn.sysq.myrule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author linjingze
 * @date 2019/1/20 11:11 AM
 */
@SpringBootApplication
@EnableEurekaClient
// MyRule 这个自定义的类不能放在@ComponentScan 所在的同包或子包下
@RibbonClient(name = "SPRINGCLOUD-DEPT", configuration = MyRule.class)
public class DeptConsumer80_App {


    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_App.class, args);
    }
}
