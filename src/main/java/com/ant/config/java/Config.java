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
	@Bean(name = "d1") // dans ce cas le nom sera prioritaire au nom de la méthode
	public D d() {
		D d = new D(c1());
		return d;
	}

}
