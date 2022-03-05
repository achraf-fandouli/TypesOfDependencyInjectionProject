package com.ant.config.annotation;

import org.springframework.stereotype.Component;

/*pour que la classe E travaille avec les annotations il faut qu'il soit un composant spring
et pour q'il soit un composant spring il faut au minimum avoir l'annotation @Component*/
@Component // il va retourner un objet = un bean qui être creer
public class E {

	public void show() {
		System.out.println("Hello config annotation");
	}
}
