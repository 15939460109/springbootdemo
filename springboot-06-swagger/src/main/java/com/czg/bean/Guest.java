package com.czg.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("嘉宾")
// ApiModel声明参数模型
public class Guest {

    @ApiModelProperty("名字")
    // ApiModelProperty声明参数模型属性
    private String name;
    @ApiModelProperty("角色")
    private String role;
}
