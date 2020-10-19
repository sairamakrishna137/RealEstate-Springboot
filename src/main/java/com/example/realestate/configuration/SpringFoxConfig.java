package com.example.realestate.configuration;


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
@EnableSwagger2
public class SpringFoxConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.ant("/api/**"))
                .apis(RequestHandlerSelectors.basePackage("com.example.realestate.controller"))
                .build()
                .apiInfo(apiEndPointInfo());
    }
    //http://localhost:8080/swagger-ui.html
    public ApiInfo apiEndPointInfo(){
        return new ApiInfoBuilder().title("Real Estate Application")  // Title 
                .description("Application Maintain the RealEsate Infomation") //description
                .license("Version 1.0") //license
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
                .version("0.0.1-SNAPSHOT")
                .build();
    }

}