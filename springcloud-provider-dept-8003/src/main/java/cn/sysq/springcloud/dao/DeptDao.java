package cn.sysq.springcloud.dao;

import cn.sysq.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author linjingze
 * @date 2019/1/20 10:43 AM
 */
// 一定要加这个
@Mapper
public interface DeptDao {


    boolean addDept(Dept dept);

    Dept findById(Long id);

    List<Dept> findAll();
}
