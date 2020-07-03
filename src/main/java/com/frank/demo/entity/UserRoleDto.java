package com.frank.demo.entity;

import lombok.Data;

/**
 * @author 小石潭记
 * @date 2020/7/3 20:52
 * @Description: ${todo}
 */
@Data
public class UserRoleDto {
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 用户名
     */
    private String name;
    /**
     * 角色名
     */
    private String roleName;
}

