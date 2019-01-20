package cn.sysq.springcloud.controller;

import cn.sysq.springcloud.pojo.Dept;
import cn.sysq.springcloud.service.DeptService;
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
    @Autowired
    private DiscoveryClient client;

    @GetMapping("/info/{id}")
    public Dept info(@PathVariable(value = "id") Long id){
        return deptService.get(id);
    }

    @PostMapping("/add")
    public boolean add(@RequestBody Dept dept){
        return deptService.add(dept);
    }

    @GetMapping("/list")
    public List<Dept> list(){
        return deptService.list();
    }

    @GetMapping("/discovery")
    public Object discovery(){
        List<String> services = client.getServices();
        log.info("当前所有的服务:{}", services);
        List<ServiceInstance> instances = client.getInstances("SPRINGCLOUD-DEPT");
        for (ServiceInstance serviceInstance : instances) {
            log.info("{}, {}, {}, {}", serviceInstance.getServiceId(), serviceInstance.getHost(),serviceInstance.getPort(), serviceInstance.getUri());
        }
        return this.client;
    }
}
