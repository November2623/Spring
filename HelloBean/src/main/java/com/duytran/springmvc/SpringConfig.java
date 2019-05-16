package com.duytran.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.duytran.model.Order;
import com.duytran.model.Person;

@Configuration
@ComponentScan(basePackages = "com.duytran.springmvc")
@EnableWebMvc

public class SpringConfig extends WebMvcConfigurerAdapter {
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
//	@Bean(name="person", initMethod = "init", destroyMethod = "destroy")
//	public Person person() {
//		Person person = new Person("Tran ngoc Duy", 20);
//		
//		return person;
//	}
//	@Bean(name="person2", initMethod = "init", destroyMethod = "destroy")
//	@Scope(value = "prototype")
//	public Person person2() {
//		Person person = new Person("Le Thi Thuy Ngan", 20);
//		
//		return person;
//	}
//	
//	@Bean
//	@Autowired
//	@Qualifier("person2")
//	public Order order(Person person) {
//		return new Order(person);
//	}
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resource/**").addResourceLocations("/resources/");
	}
	@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource bundleMessageSource = new ReloadableResourceBundleMessageSource();
		bundleMessageSource.setBasename("classpath:messages");
		bundleMessageSource.setDefaultEncoding("utf-8");
		return bundleMessageSource;
	}
}
