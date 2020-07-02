package com.frank.hello.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author 小石潭记
 * @date 2020/7/2 22:11
 * @Description: ${todo}
 */
@Configuration
@EnableSwagger2
// http://localhost:8080/swagger-ui.html
public class Swagger2 {
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.frank.hello"))//扫描接口的包
                .build();
    }

    public ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("spring boot利用swagger构建api文档")
                .description("简单优雅的rest风格")
                .termsOfServiceUrl("http://localhost:8080")//文档遵循的开发协议的展现网址
                .version("1.0")//版本
                .build();
    }
}
