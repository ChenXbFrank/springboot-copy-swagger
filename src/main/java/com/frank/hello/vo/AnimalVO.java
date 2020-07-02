package com.frank.hello.vo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 小石潭记
 * @date 2020/7/2 21:11
 * @Description: ${todo}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "AnimalVO", description = "动物类")
public class AnimalVO {

    @ApiModelProperty(value = "名字",
                        name = "name",
                        example = "小花")
    private String name;

    @ApiModelProperty(value = "年级",
            name = "age",
            example = "1")
    private int age;
}
