package com.frank.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author 小石潭记
 * @date 2020/7/3 20:47
 * @Description: ${todo}
 */
@AllArgsConstructor
@Data
public class User {
    private Long id;
    private String username;
    private String password;
    private String phoneNum;
    private String email;
    private Role role;
}

