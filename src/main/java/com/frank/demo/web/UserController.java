package com.frank.demo.web;

import com.frank.demo.entity.Role;
import com.frank.demo.entity.User;
import com.frank.demo.entity.UserRoleDto;
import com.frank.demo.mapper.UserRoleMapper;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 小石潭记
 * @date 2020/7/3 20:53
 * @Description: ${todo}
 */
@Slf4j
@RestController
@RequestMapping("/user")
@Api(value = "UserController", description = "User测试类")
public class UserController {

    // 初始化数据
    Role role  = new Role(2L, "administrator", "超级管理员");
    User user  = new User(1L, "zhangsan", "12345", "17677778888", "123@qq.com", role);

    /**
     * 常规的赋值，先取出值，然后再set进去，如果属性过多，这就比较麻烦了
     * @return
     */
    @GetMapping("/index")
    public UserRoleDto index(){
        UserRoleDto userRoleDto = new UserRoleDto();
        userRoleDto.setUserId(user.getId());
        userRoleDto.setName(user.getUsername());
        userRoleDto.setRoleName(user.getRole().getRoleName());
        log.info(userRoleDto.toString());
        return userRoleDto;
    }

    @GetMapping("/mapStruct")
    public UserRoleDto mapStruct(){
        UserRoleDto userRoleDto = UserRoleMapper.INSTANCES.toUserRoleDto(user);
        log.info(userRoleDto.toString());
        return userRoleDto;
    }
}
