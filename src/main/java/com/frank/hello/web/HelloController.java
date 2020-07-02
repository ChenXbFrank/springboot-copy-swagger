package com.frank.hello.web;

import com.frank.hello.dto.Animal;
import com.frank.hello.dto.DataResponse;
import com.frank.hello.dto.Student;
import com.frank.hello.dto.Teacher;
import com.frank.hello.mapper.SourceTargetMapper;
import com.frank.hello.vo.DataResponseVO;
import com.frank.hello.vo.TeacherVO;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 小石潭记
 * @date 2020/7/2 21:12
 * @Description: ${todo}
 */
@RestController
@Api(value = "HelloController", description = "主页")
public class HelloController {

    @GetMapping("/index")
    @ApiOperation(value = "获取接口信息",notes = "获取接口信息",tags = "DataResponseVO",httpMethod = "GET")
    @ApiResponses({//方法返回值的swagger注释
            @ApiResponse(code = 200,message = "成功",response = DataResponseVO.class),
            @ApiResponse(code = 400,message = "用户输入错误",response = DataResponseVO.class),
            @ApiResponse(code = 500,message = "系统内部错误",response = DataResponseVO.class)
    })
    public DataResponseVO index(){
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("小一", 1));
        animals.add(new Animal("小二", 2));
        animals.add(new Animal("小三", 3));
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "小明", "成都", animals));
        Teacher teacher = new Teacher(1, "小梅沙", "四川", students);
        // 这里模拟从第三方接口获取的数据
        DataResponse dataResponse = new DataResponse(200, "成功", teacher);
        // 这里直接将上面的数据拷贝变成DataResponseVO，这里注意一下先compile一下整个项目
        TeacherVO responseVo = SourceTargetMapper.MAPPER.toTarget(dataResponse.getData());
        DataResponseVO dataResponseVO = new DataResponseVO();
        dataResponseVO.setCode(dataResponse.getCode()).setMessage(dataResponse.getMessage()).setData(responseVo);
        return dataResponseVO;
    }
}
