package com.frank.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author 小石潭记
 * @date 2020/7/3 20:51
 * @Description: ${todo}
 */
@AllArgsConstructor
@Data
public class Role {
    private Long id;
    private String roleName;
    private String description;
}
