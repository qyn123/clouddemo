package com.qyn.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author qiaoyn
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable{

    private Long deptno;//主键
    private String dname;//部门名称
    //来自哪个数据库，因为微服务可以一个服务对应一个数据库
    private String db_source;
}
