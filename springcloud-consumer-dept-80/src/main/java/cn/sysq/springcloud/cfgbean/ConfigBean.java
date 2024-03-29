package cn.sysq.springcloud.cfgbean;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author linjingze
 * @date 2019/1/20 11:12 AM
 */
@Configuration
public class ConfigBean {

    @Bean
    // 开启Ribbon负载均衡
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        // 提供了很多中便捷访问远程http的服务的方法
        // 是一种简单便捷的访问restful的服务模板类
        // 是spring 提供用于访问Rest服务的客户端模版工具集
        return new RestTemplate();
    }
    @Bean
    public IRule myRule(){
        // 用随机算法代替默认的轮询算法
//        return new RandomRule();
        // 重试算法
        return new RetryRule();
    }
}
