package com.frank.hello.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author 小石潭记
 * @date 2020/7/2 21:15
 * @Description: ${todo}
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true) //链式风格，在调用set方法时，返回这个类的实例对象
@ApiModel(value = "DataResponseVO", description = "返回的结果类")
public class DataResponseVO {

    @ApiModelProperty(value = "返回的code码",
            name = "code",
            example = "200")
    private int code;

    @ApiModelProperty(value = "返回的信息",
            name = "message",
            example = "success")
    private String message;

    @ApiModelProperty(value = "返回的数据",
            name = "data",
            example = "返回的数据")
    private TeacherVO data;
}
