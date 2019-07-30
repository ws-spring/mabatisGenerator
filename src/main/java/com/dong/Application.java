package com.dong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class Application 
{
    public static void main( String[] args )
    {
        SpringApplication springApplication = new SpringApplication(Application.class);
        springApplication.run(args);
    }
}
