package com.example.simplilearnspringio;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebAppConfiguration {

    @Bean
    public ServletRegistrationBean<HelloWorldServlet> exampleServletBean() {
        ServletRegistrationBean<HelloWorldServlet> bean =
                new ServletRegistrationBean<>(
                        new HelloWorldServlet(), "/*"
                );
        bean.setLoadOnStartup(1);
        return bean;
    }

}