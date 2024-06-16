package com.biwott.springapi;

import com.sun.org.slf4j.internal.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringApiApplication {
     private  static  final Logger log= LoggerFactory.getlogger(Application.class);
    public static void main(String[] args) {
        SpringApplication.run(SpringApiApplication.class, args);
        log.info("Application running succwssfully");


    }

}
