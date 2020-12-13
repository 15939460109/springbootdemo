package com.czg.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
// 告知这是一个springboot配置类
@EnableSwagger2
// 开启swagger功能
public class SwaggerConfig {

    /**
     * 使用swagger需要创建一个摘要
     * 参数如下:
     *      文档类型     DocumentationType.SWAGGER_2
     *      文档通过一系列选择器组成api path
     *      select()设置apis和paths
     *      apis表示需要生成哪些controller的接口
     *      paths表示在controller上查找出来的接口中进行筛选
     * @return
     */
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                // .apis(RequestHandlerSelectors.any())
                .apis(RequestHandlerSelectors.basePackage("com.czg.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    // 文档标题、描述、版本号的配置
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("springboot-06-swagger")
                .description("这是一个简单的swagger demo")
                .version("1.0")
                .build();
    }
}
