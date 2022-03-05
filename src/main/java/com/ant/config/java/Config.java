package com.ant.config.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public C c1() {
		C c = new C();
		return c;
	}

	// par défaut le bean prend le nom de la méthode
	@Bean(name = "d1") 
	public D d() {
		D d = new D();
		d.setC(c1());
		return d;
	}

}
