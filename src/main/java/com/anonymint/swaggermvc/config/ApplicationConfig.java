package com.anonymint.swaggermvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * //TODO description of this ApplicationConfig
 *
 * @author <a href="mailto:ekalak.rengwanidchakul@morningstar.com">erengwa</a>
 * @date 2014-03-31
 */
@Configuration
@ComponentScan({"com.anonymint.swaggermvc"})
@Import(SwaggerConfig.class)
public class ApplicationConfig {
}
