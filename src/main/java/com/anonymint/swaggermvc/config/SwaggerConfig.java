package com.anonymint.swaggermvc.config;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;
import com.wordnik.swagger.model.ApiInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * //TODO Class description
 *
 * @author <a href="mailto:mint.com@gmail.com">anonymint</a>
 * @date 2014-05-19
 */
@EnableSwagger
@Configuration
public class SwaggerConfig {
    private SpringSwaggerConfig springSwaggerConfig;

    @Autowired
    public void setSpringSwaggerConfig(SpringSwaggerConfig springSwaggerConfig) {
        this.springSwaggerConfig = springSwaggerConfig;
    }

    @Bean
    public SwaggerSpringMvcPlugin swaggerSpringMvcPlugin() {
        return new SwaggerSpringMvcPlugin(springSwaggerConfig)
                .swaggerGroup("business-api")
                .includePatterns(
                        "/data.*"
                )
                .apiInfo(apiInfo())
                //.pathProvider(new BasePathProvider())
                .build();
    }

    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "Demo Spring MVC swagger 1.2 api",
                "Sample spring mvc api based on the swagger 1.2 spec",
                "http://en.wikipedia.org/wiki/Terms_of_service",
                "somecontact@somewhere.com",
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0.html"
        );
        return apiInfo;
    }
}
