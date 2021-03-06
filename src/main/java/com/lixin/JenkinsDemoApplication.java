package com.lixin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Hello world!
 * @author zhenglubo
 */
@SpringBootApplication(scanBasePackages = "com.lixin")
@EnableSwagger2
public class JenkinsDemoApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(JenkinsDemoApplication.class,args);
    }
}
