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

	// par d�faut le bean prend le nom de la m�thode
	@Bean(name = "d1") 
	public D d() {
		D d = new D();
		d.setC(c1());
		return d;
	}

}
