package com.frank.hello.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author 小石潭记
 * @date 2020/7/2 21:10
 * @Description: ${todo}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "StudentVO", description = "学生类")
public class StudentVO {

    @ApiModelProperty(value = "学号",
            name = "id",
            example = "1001")
    private int id;

    @ApiModelProperty(value = "学生的姓名",
            name = "name",
            example = "张三")
    private String name;

    @ApiModelProperty(value = "学生地址",
            name = "address",
            example = "成都")
    private String address;

    @ApiModelProperty(value = "学生所拥有的动物",
            name = "animals",
            example = "学生所拥有的动物")
    private List<AnimalVO> animals;
}
