package com.frank.hello.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class Teacher {

    @JsonProperty("ID")
    private int id;

    @JsonProperty("NAME")
    private String name;

    @JsonProperty("ADDRESS")
    private String address;

    @JsonProperty("STUDENTS")
    private List<Student> students;

}
