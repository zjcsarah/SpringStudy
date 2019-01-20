package cn.sysq.springcloud.controller;

import cn.sysq.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author linjingze
 * @date 2019/1/20 11:16 AM
 */
@RestController
@RequestMapping("/consumer/dept")
public class DeptController_Consumer {

    //private final static String RESTPRE = "http://127.0.0.1:8001";
    // 设置成对外暴露的微服务的名字
    private final static String RESTPRE = "http://SPRINGCLOUD-DEPT";


    /**
     * 使用restTemplate访问restful接口非常的简单粗暴无脑
     * (url, requestMap, ResponseBean.class) 这三个参数分别代表
     * REST请求地址, 请求参数, Http响应转换被转换成的对象类型
     */
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/info/{id}")
    public Dept info(@PathVariable(value = "id") Long id){
        return restTemplate.getForObject(RESTPRE + "/dept/info/" + id, Dept.class);
    }
    @PostMapping("/add")
    public boolean add(@RequestBody Dept dept){
        return restTemplate.postForObject(RESTPRE + "/dept/add", dept, Boolean.class);
    }
    @GetMapping("/list")
    public List<Dept> list(){
        return restTemplate.getForObject(RESTPRE + "/dept/list", List.class);
    }
    @GetMapping("/discovery")
    public Object discovery(){
        return restTemplate.getForObject(RESTPRE + "/dept/discovery", Object.class);
    }
}
