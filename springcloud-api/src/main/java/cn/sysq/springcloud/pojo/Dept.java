package cn.sysq.springcloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author linjingze
 * @date 2019/1/20 10:02 AM
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
// 链式风格访问
@Accessors(chain = true)
public class Dept implements Serializable{
    private static final long serialVersionUID = -4915126340245979295L;
    private Long deptNo;
    private String dName;
    private String dbSource;
}
