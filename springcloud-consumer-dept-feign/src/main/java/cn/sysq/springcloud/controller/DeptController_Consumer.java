package cn.sysq.springcloud.controller;

import cn.sysq.springcloud.pojo.Dept;
import cn.sysq.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author linjingze
 * @date 2019/1/20 11:16 AM
 */
@RestController
@RequestMapping("/consumer/dept")
public class DeptController_Consumer {

    @Autowired
    private DeptClientService deptClientService;

    @GetMapping("/info/{id}")
    public Dept info(@PathVariable(value = "id") Long id){
        return deptClientService.get(id);
    }
    @PostMapping("/add")
    public boolean add(@RequestBody Dept dept){
        return deptClientService.add(dept);
    }
    @GetMapping("/list")
    public List<Dept> list() {
        return deptClientService.list();
    }

}
