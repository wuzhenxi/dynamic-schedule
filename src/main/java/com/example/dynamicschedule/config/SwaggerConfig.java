package com.example.dynamicschedule.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * swaggger2配置类.
 *
 * @author Jesse
 * @version 1.0
 * @since <pre>2021/2/3</pre>
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("blog-server")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.dynamicschedule"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Jessewu-task")
                .description("JesseWu's task for java")
                .termsOfServiceUrl("https://localhost:8888/doc.html")
                .contact(new Contact("Jessewu", "https://www.wuzhenxicloud.com", "wyyxwzx@163.com"))
                .version("1.0")
                .build();
    }
}
