package org.springboot.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IDEA.
 * User: zhoudianyou
 */

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class WebApplicationMain {

    public static void main(String[] args) throws Exception {
        SpringApplication springApplication = new SpringApplication();
        springApplication.run(WebApplicationMain.class,args);
    }

}
