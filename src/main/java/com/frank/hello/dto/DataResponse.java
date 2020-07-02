package com.frank.hello.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 小石潭记
 * @date 2020/7/2 21:15
 * @Description: ${todo}
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class DataResponse {

    @JsonProperty("CODE")
    private int code;

    @JsonProperty("MESSAGE")
    private String message;

    @JsonProperty("DATA")
    private Teacher data;

}
