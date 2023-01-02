package com.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring.configuration")
public class Configure {

	
	@Bean
	CompanyBean getCompany() {
		CompanyBean c1=new CompanyBean();
		return c1;
	}
	
	@Bean
	public Maggie getMaggie() {
		return new Maggie();
	}
	
	@Bean(name = {"product","maggie","getProduct"})
	public Product getProduct() {
		Product product=new Product(getMaggie());
		return product;
	}
}
