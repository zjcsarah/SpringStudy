package cn.sysq.springcloud.controller;

import cn.sysq.springcloud.pojo.Dept;
import cn.sysq.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author linjingze
 * @date 2019/1/20 10:49 AM
 */
@RestController
@RequestMapping("/dept")
@Slf4j
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/info/{id}")
    @HystrixCommand(fallbackMethod = "processHystrix")
    public Dept info(@PathVariable(value = "id") Long id){
        Dept dept = deptService.get(id);
        if (dept == null) {
            throw new RuntimeException("没有找到id=" + id + "的部门");
        }
        return dept;
    }
    public Dept processHystrix(@PathVariable(value = "id") Long id){
        return new Dept().setDeptNo(id)
                         .setDName("没有找到id=" + id + "的部门")
                         .setDbSource("没有对应的dbSource");
    }
}
