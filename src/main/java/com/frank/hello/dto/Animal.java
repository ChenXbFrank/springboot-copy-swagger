package com.frank.hello.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class Animal {

    @JsonProperty("NAME")
    private String name;

    @JsonProperty("AGE")
    private int age;

}
