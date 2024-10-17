package com.hqyj.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 用户类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties("handler")  //使用jackson过滤掉不能被序列化的属性handler
public class Telephone implements Serializable {
    //属性
    private Integer id;
    private String name;
    private String gender ;
    private String address;
    private Integer number;
}
