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
@ApiModel(value = "TeacherVO", description = "老师类")
public class TeacherVO {

    @ApiModelProperty(value = "老师的编号",
            name = "id",
            example = "1001")
    private int id;

    @ApiModelProperty(value = "老师的姓名",
            name = "name",
            example = "张老师")
    private String name;

    @ApiModelProperty(value = "地址",
            name = "address",
            example = "成都")
    private String address;

    @ApiModelProperty(value = "老师所教的学生",
            name = "students",
            example = "老师所教的学生")
    private List<StudentVO> students;
}
