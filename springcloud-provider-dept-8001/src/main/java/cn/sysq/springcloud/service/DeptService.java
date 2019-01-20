package cn.sysq.springcloud.service;

import cn.sysq.springcloud.pojo.Dept;

import java.util.List;

/**
 * @author linjingze
 * @date 2019/1/20 10:49 AM
 */
public interface DeptService {

    boolean add(Dept dept);

    Dept get(Long id);

    List<Dept> list();
}
