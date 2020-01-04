package com.java.ATS_Exam.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by Sudhir kumar Thanna on 1/3/20.
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {

	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("/login");
		registry.addViewController("/index").setViewName("/index");
		registry.addViewController("/login").setViewName("/login");
	}
}
